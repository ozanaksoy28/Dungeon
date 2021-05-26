package com.company;

public class CharacterManager extends Characters{
    void addHero(Characters characters,String race,int power,int stamina,int armor,int critical,int health){
        characters.race=race;
        characters.power=power;
        characters.stamina=stamina;
        characters.armor=armor;
        characters.critical=critical;
        characters.health=health;
        characters.damage=power/8;
    }
    void addEnemies(Characters characters,String race,int power,int armor,int critical,int health){
        characters.race=race;
        characters.power=power;
        characters.armor=armor;
        characters.critical=critical;
        characters.health=health;
        characters.damage=power/10;
    }
}
