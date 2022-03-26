package xofever.feifei.armyweapon;

public class M4A1 extends Rifle implements Shootable{
    @Override
    public void shoot() {
        System.out.println("M4A1正在压枪扫射！");
    }

    @Override
    public String toString() {
        return "M4A1";
    }
}
