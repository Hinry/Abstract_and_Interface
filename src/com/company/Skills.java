package com.company;

/**
 *Написать интерфейс с двумя абстрактными (один кидает ошибку),
 * одним дефолтным методами и статической функцией (тема любая).
 * Создать два класса реализующих его, вызвать методы каждого, и статическую функцию.
 */
public interface Skills {


    void Use_Skill_Fire();


    void Use_Skill_Ice();

    default void Use_Skill_Earth(){
        System.out.println("Что за скилл я сейчас кастонул?");
    }

    static void Run (){
        System.out.println("Мана кончилась! Бежим!");
    }

}
