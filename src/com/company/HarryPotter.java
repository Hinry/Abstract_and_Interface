package com.company;
import java.util.*;
/**
 * Created by mrhri on 16.10.2016.
 */
public class HarryPotter extends Main implements Skills{


    String name = "Гарри";
    int power_fire = 800;
    int mana = 500;
    int power_ice = 600;

    public static void main(String[] args) {

        HarryPotter Harry = new HarryPotter();
        Harry.Use_Skill_Earth();
        Harry.Use_Skill_Fire();
        Harry.Use_Skill_Ice();
    }

    @Override
    public void Use_Skill_Fire() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Анонс: Гарри собирается ударить Владыку!");
        System.out.println("Введите желаемую защиту Лорда Волан Де Морта против "+name);
        try{
            int Volandemort_Deff = sc.nextInt();
            int b = power_fire / Volandemort_Deff;
            if(b < 0){
                System.out.println(name+" пробил полностью уничтожил ваще в прах ну прям в какашку");
            }else {
                System.out.println(name+" нанёс " + b + " урона огнём");
            }
        }
        catch (ArithmeticException e){
            System.out.println(name+ " нанёс "+power_fire+" чистого урона огнём");;
        }
        catch (Exception e){
            System.out.println("Какая то ошибка при вводе Брони Лорда");
        }
    }

    @Override
    public void Use_Skill_Ice() {
        int mana_coast = 500;
        System.out.println(name+ " ударил Волан Де Морта куском льда прямо в лицо на "+power_ice+" урона и затратил "+mana_coast+" маны");
        mana = mana - mana_coast;
        System.out.println("Оставшаяся мана = "+mana);
        if(mana == 0){
            Skills.Run();
        }
    }
    @Override
    public void Use_Skill_Earth(){
        System.out.println(name+": Что за скилл я сейчас кастонул?");
    }

}
