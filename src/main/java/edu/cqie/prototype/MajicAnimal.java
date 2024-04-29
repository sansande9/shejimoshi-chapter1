package edu.cqie.prototype;

import lombok.Data;

@Data
public abstract class MajicAnimal implements Cloneable{
    public String name;
    public int age;
    public String address;
    private Weapon weapon;

    public abstract void show();

    public MajicAnimal clone() throws CloneNotSupportedException {
        Weapon weapon =this.weapon.clone();
        MajicAnimal majicAnimal = (MajicAnimal) super.clone();
        majicAnimal.setWeapon(weapon);
        return majicAnimal;
    }

}
