package xofever.feifei.armyweapon;
//使用武器是发生的异常
public class UseWeaponException extends Exception{
    public UseWeaponException(){

    }
    public UseWeaponException(String s){
        super(s);
    }
}
