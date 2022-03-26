package xofever.feifei.armyweapon;

import xofever.feifei.homework.UsernameException;

import java.util.Scanner;

public class WeaponTestMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.println("输入最大武器数：");
        int weaponMaxNumber = s.nextInt();*/
        Army army = new Army(2);
        /*System.out.println("你可以拥有的最大武器数量是"+weaponMaxNumber);*/

        Weapon w1 = new AKM();
        Weapon w2 = new M4A1();
        Weapon w3 = new UMP4();
        try {
            army.addweapon(w1);
            army.addweapon(w2);
            army.addweapon(w3);
        }catch (AddWeaponException e ){
            System.out.println(e.getMessage());
        }
        try {
            army.useWeapon(w1);
            army.useWeapon(w2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    }

