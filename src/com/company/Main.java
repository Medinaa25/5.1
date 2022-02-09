package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1 = new Boss();
        b1.setBossHealth(500);
        b1.setBossDamage(50);
        b1.setBossDefenceType("Magic");
        System.out.println("Boss- " + b1.getBossHealth() +  " Health  " + b1.getBossDamage() + " Damage " + b1.getBossDefenceType());

    }
    public static void createHero() {
        Hero h1 = new Hero(230, 30, "magical");
        Hero h2 = new Hero(250, 25);
        Hero h3 = new Hero(210, 20, "kinetic");
    }
}