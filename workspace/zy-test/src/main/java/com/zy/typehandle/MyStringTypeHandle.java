package com.zy.typehandle;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/4/17
 * Time:11:58
 */
@Slf4j
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes({String.class})
public class MyStringTypeHandle extends BaseTypeHandler<String> {

    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType)
            throws SQLException {
        log.info("MyStringTypeHandle 设置列值");
        if (StringUtils.isEmpty(s)) {
            preparedStatement.setString(i, "zy");
        } else {
            preparedStatement.setString(i,s);
        }
    }

    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        log.info("MyStringTypeHandle 通过列名获取列值");
        return resultSet.getString(s);
    }

    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        log.info("MyStringTypeHandle 通过列id获取列值");
        return resultSet.getString(i);
    }

    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i);
    }
}
