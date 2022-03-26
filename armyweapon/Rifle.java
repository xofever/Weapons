package xofever.feifei.armyweapon;
//步枪类武器
public class Rifle extends Weapon implements Shootable{

    @Override
    public void shoot() {
        System.out.println("步枪正在射击");
    }
}
