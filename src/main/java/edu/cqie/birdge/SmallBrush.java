package edu.cqie.birdge;

public class SmallBrush extends Brush{
    @Override
    protected void Draw() {
        this.color.colorration();
        System.out.println("使用小号毛笔画一条线");
    }
}
