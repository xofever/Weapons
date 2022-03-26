package xofever.feifei.armyweapon;

/*
* 各种武器的父类
* */
public class Weapon {

    private String name;

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "武器在使用";
    }
}
