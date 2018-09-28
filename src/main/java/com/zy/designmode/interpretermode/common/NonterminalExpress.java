package com.zy.designmode.interpretermode.common;

import com.zy.designmode.interpretermode.Express;

/**
 * Desc:非终结表达式
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:34
 */
public class NonterminalExpress extends AbstractExpress{

    public NonterminalExpress(Express... expresses) {

    }

    @Override
    public Object interpreter(Context context) {
//        执行文法处理
        return null;
    }
}
