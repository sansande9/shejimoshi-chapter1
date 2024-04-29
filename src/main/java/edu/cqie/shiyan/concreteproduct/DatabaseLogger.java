package edu.cqie.shiyan.concreteproduct;

import edu.cqie.shiyan.product.Logger;

public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("数据库日志成功写入");
    }
}
