package edu.cqie.birdge;

public class Client {
    public static void main(String[] args) {
        //1、准备毛笔
        Brush bigBrush = new BigBrush();
        Brush smallBrush = new SmallBrush();
        // 2、准备颜料
        Color red = new Red();
        Color blue = new Blue();
        // 3、用毛笔蘸颜料
        bigBrush.setColor(red);
        smallBrush.setColor(blue);
        // 4、画画
        bigBrush.Draw();
        smallBrush.Draw();

    }
}
