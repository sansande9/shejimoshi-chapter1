package edu.cqie.daili;

import lombok.Data;

@Data
public abstract class Mobile {
    private String name;
    private int price;

    public abstract void show();
}
