package edu.cqie.prototype;

public class Weapon implements Cloneable {
    public String name;
    public int hurtValue;
    public void show(){
        System.out.println("食用武器名"+this.name+"伤害值"+this.hurtValue+"点");
    }
    public Weapon clone() throws CloneNotSupportedException {
        return (Weapon)super.clone();
    }
}
