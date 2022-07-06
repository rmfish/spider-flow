package org.spiderflow.core.executor.function;

import org.spiderflow.annotation.Comment;
import org.spiderflow.annotation.Example;
import org.spiderflow.executor.FunctionExecutor;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
@Comment("数据库常用方法")
public class SqlFunctionExecutor implements FunctionExecutor {

    @Override
    public String getFunctionPrefix() {
        return "sql";
    }

    @Comment("获取数据库类型日期")
    @Example("${sql.timestamp(date)}")
    public static Timestamp timestamp(Date date) {
        if (date != null) {
            return new Timestamp(date.getTime());
        } else {
            return null;
        }
    }

    @Comment("获取数据库类型日期")
    @Example("${sql.timestamp(date)}")
    public static Timestamp timestamp(Long date) {
        if (date != null) {
            return new Timestamp(date);
        } else {
            return null;
        }
    }
}
