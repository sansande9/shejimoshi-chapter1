package edu.cqie.prototype;

import lombok.Data;

@Data
public class Monkey extends MajicAnimal{
    public String name;
    public int age;
    public String address;
    private Weapon weapon;

    public void show(){
        System.out.println("我叫"+this.name+"来自"+this.address+"今年"+this.age+"岁");
        this.weapon.show();
    }
}
