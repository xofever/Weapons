package xofever.feifei.armyweapon;

public class Army {
    //声明一个武器库
    Weapon[] weapons;


    public Army() {
    }

    public Army(int weaponNumber) {
        weapons = new Weapon[weaponNumber];
    }

    public void addweapon(Weapon weapon) throws AddWeaponException {
        for(int i = 0;i<weapons.length;i++){
            if(null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon+"添加成功");
                return;
            }
        }
        //武器满了 就要抛出异常
        throw new AddWeaponException("已经达到最高武器上限，不能在添加武器！");
    }
    //使用武器方法
    public void useWeapon(Weapon weapon) throws UseWeaponException {
        if(weapon == null){
            throw new UseWeaponException("输入的武器是空的，不能使用");
        }
        for (int i = 0;i<weapons.length;i++){
            if(weapons[i].equals(weapon)){
                if (weapons[i]instanceof Shootable){
                    Shootable shootable = (Shootable)weapons[i];
                    shootable.shoot();
                    return;
                }
                else if (weapons[i]instanceof Moveable){
                    Moveable moveable = (Moveable)weapons[i];
                    moveable.move();
                    return;
                }
                else{
                    throw new UseWeaponException("武器既不能射击又不能移动");
                }
            }
        }
        throw new UseWeaponException("武器库未找到武器！");
    }


    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }
}
