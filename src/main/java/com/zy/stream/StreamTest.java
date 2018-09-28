package com.zy.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/12
 * Time:21:23
 */
public class StreamTest {
    public static void main(String[] args) {
        // 累加
        int value = Stream.of(1, 2, 3, 4).reduce(0, (acc, element) -> acc + element).intValue();
        System.out.println("累加："+value);

        // 统计
        IntSummaryStatistics statistics = Stream.of(8, 2, 3, 4).mapToInt(t -> t).summaryStatistics();
        System.out.println("最大：" + statistics.getMax());
        System.out.println("平均值：" + statistics.getAverage());

        // 分类
        Map<Boolean, List<Integer>> map = Stream.of(1, 2, 3, 4).collect(Collectors.partitioningBy(t -> t > 3));
        map.get(Boolean.TRUE).forEach(System.out:: print);
        System.out.println();
        map.get(Boolean.FALSE).forEach(System.out:: print);
        System.out.println();

        // 并行初始化数组
        int[] ints = new int[5];
        Arrays.parallelSetAll(ints,i->i+1);
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println();

        // 滚动窗口计算  如果输入数据为 0、1、2、3、4、3.5，滑动窗口的大小为 3， 则简单滑动平均数为 1、2、3、3.5。
        double[] input = new double[] { 0, 1, 2, 3, 4, 3.5 };
        Arrays.parallelPrefix(input, Double::sum);
        int start=3-1;
        double[] end=IntStream.range(start, input.length)
                .peek(t -> System.out.print("中间值"+t + " "))
                .mapToDouble(i -> {
                    Double pr = i == start ? 0 : input[i - 3];
                    return (input[i] - pr) / 3;
                }).peek(t -> System.out.print("结果"+t + " ")).toArray();
        System.out.println();



    }
}
