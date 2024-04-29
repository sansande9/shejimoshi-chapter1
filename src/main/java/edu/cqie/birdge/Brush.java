package edu.cqie.birdge;

import java.awt.*;

public abstract class Brush {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    protected abstract void Draw();
}
