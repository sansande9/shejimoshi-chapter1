package edu.cqie.birdge;

public class BigBrush extends Brush{

    @Override
    protected void Draw() {
        this.color.colorration();
        System.out.println("使用大号毛笔画一条线");

    }
}
