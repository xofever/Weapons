package xofever.feifei.armyweapon;
//所有冲锋枪的父类
public class SubmachineGun extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("冲锋枪正在快速扫射！");
    }
}
