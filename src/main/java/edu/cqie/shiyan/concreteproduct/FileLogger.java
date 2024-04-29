package edu.cqie.shiyan.concreteproduct;

import edu.cqie.shiyan.product.Logger;

public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志成功写入");
    }
}
