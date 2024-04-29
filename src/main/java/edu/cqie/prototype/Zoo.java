package edu.cqie.prototype;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<MajicAnimal> animals = new ArrayList<>();

    public Zoo(){
        MajicAnimal sunwukong = new Monkey();
        sunwukong.name="孙悟空";
        sunwukong.age=500;
        sunwukong.address="花果山";

        Weapon jingubang = new Weapon();
        jingubang.name="金箍棒";
        jingubang.hurtValue=10000;

        sunwukong.setWeapon(jingubang);

        animals.add(sunwukong);

        MajicAnimal niumowang = new Monkey();
        niumowang.name="牛魔王";
        niumowang.age=6000;
        niumowang.address="火焰山";

        Weapon sanchaji = new Weapon();
        sanchaji.name="三叉戟";
        sanchaji.hurtValue=10000;

        niumowang.setWeapon(sanchaji);

        animals.add(niumowang);
    }

    public  MajicAnimal getAnimal(int i) throws CloneNotSupportedException {
        return animals.get(i).clone();
    }

    public void addAnimal(MajicAnimal animal) {
        this.animals.add(animal);
    }
}
