package com.company;

/**
 * Created by mrhri on 16.10.2016.
 */
/**
 *Написать интерфейс с двумя абстрактными (один кидает ошибку),
 * одним дефолтным методами и статической функцией (тема любая).
 * Создать два класса реализующих его, вызвать методы каждого, и статическую функцию.
 */
public class Main {

    public static void main(String[] args){

        Hermiona hermiona = new Hermiona();
        HarryPotter Harry = new HarryPotter();

        Harry.Use_Skill_Earth();
        hermiona.Use_Skill_Earth();

        Harry.Use_Skill_Fire();
        Harry.Use_Skill_Ice();

        hermiona.Use_Skill_Fire();
        hermiona.Use_Skill_Ice();
    }
}
