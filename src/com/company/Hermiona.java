package com.company;

import java.util.Scanner;

/**
 * Created by mrhri on 16.10.2016.
 */
public class Hermiona extends Main implements Skills{

    String name = "Гермиона";
    int power_fire = 500;
    int power_ice = 700;
    int mana = 1000;

    public static void main(String[] args) {

        Hermiona hermiona = new Hermiona();
        HarryPotter Harry = new HarryPotter();

        hermiona.Use_Skill_Fire();
        hermiona.Use_Skill_Ice();

    }

    @Override
    public void Use_Skill_Fire() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***Анонс: Гермиона собирается ушатать Владку! Осторожно");
        System.out.println("Введите желаемую защиту Лорда Волан Де Морта против Гермионы");
        try{
            int Volandemort_Deff = sc.nextInt();
            int b = power_fire / Volandemort_Deff;
            if(b < 0){
                System.out.println("Я просто прелесть, а ты Волан мертв! хихи :Р");
            }else {
                System.out.println(name+ " нанесла " + b + " урона огнём");
            }
        }
        catch (ArithmeticException e){
            System.out.println(name+" нанесла "+power_fire+" чистого урона огнём");;
        }
        catch (Exception e){
            System.out.println("Какая то ошибка при вводе Брони Лорда");
        }
    }

    @Override
    public void Use_Skill_Ice() {
        int mana_coast = 500;
        System.out.println(name + " ударила Волан Де Морта льдиной прямо в ногу на "+power_ice+" урона и затратила "+mana_coast+" маны");
        mana = mana - mana_coast;
        System.out.println("Оставшаяся мана = "+mana);
        if(mana == 0){
            Skills.Run();
        }else if(mana > 0){
            System.out.println("Гарри! я могу еще что то кастонуть!");
        }
    }
    @Override
    public void Use_Skill_Earth(){
        System.out.println(name+": Гарри, я тоже что то не понятное кастонула (*_-) ");
    }
}
