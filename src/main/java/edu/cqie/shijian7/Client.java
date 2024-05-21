package edu.cqie.shijian7;

public class Client {
    public static void main(String[] args) {
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean();
        String result = searcher.doSearch("杨过","射雕英雄传");
    }
}
