package xofever.feifei.armyweapon;

public class UMP4 extends SubmachineGun implements Shootable{
    @Override
    public void shoot() {
        System.out.println("UMP4正在快速扫射！");

    }

    @Override
    public String toString() {
        return "UMP4";
    }
}
