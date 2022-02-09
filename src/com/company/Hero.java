package com.company;

public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesAttackType;
    private Hero [] heroes = new Hero[2];
    private int hero = 0;
    


    public Hero (int heroesHealth, int heroesDamage, String heroesAttackType){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesAttackType = heroesAttackType;
    }
    public Hero (int heroesHealth, int heroesDamage){
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }
    public int getHeroesHealth(){
       return this.heroesHealth;
    }
    public int getHeroesDamage (int heroesDamage){
        return this.heroesDamage;
    }
    public String  getHeroesAttackType(String heroesAttackType){
        return this.heroesAttackType;
    }



}
