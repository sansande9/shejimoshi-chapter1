package edu.cqie.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
    Zoo zoo = new Zoo();
    MajicAnimal sunwukong = zoo.getAnimal(0);

    sunwukong.show();

    sunwukong.name="弼马温";

    zoo.addAnimal(sunwukong);
    MajicAnimal bimawen = zoo.getAnimal(2);
    bimawen.show();
    }
}
