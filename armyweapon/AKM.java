package xofever.feifei.armyweapon;
//AKM武器
public class AKM extends Rifle implements Shootable{
    @Override
    public void shoot() {
        System.out.println("AKM正在压枪点射！");
    }

    @Override
    public String toString() {
        return "AKM";
    }
}
