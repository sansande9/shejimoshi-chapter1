package edu.cqie.shiyan2;

import java.io.Serializable;

public class Attachment implements Serializable {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void download(){
        System.out.println("下载附件，文件名为："+fileName);
    }
}
