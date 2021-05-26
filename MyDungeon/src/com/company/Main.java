package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int point=10;
	    System.out.println("WELCOME TO MY DUNGEON!");
	    Thread.sleep(1000);
	    System.out.println("SELECT HERO!");
        Thread.sleep(500);
        System.out.println("1. Warrior");
        System.out.println("2. Wizard");
        System.out.println("3. Giant");
        System.out.println("4. Orc");
	    Scanner scanner = new Scanner(System.in);
	    int choose = scanner.nextInt();
	    Characters hero = new Characters();
	    switch (choose){
            case 1:
                Characters warrior = new Characters();
                CharacterManager warriorManager = new CharacterManager();
                warriorManager.addHero(warrior,"Warrior",65,15,70,10,100);
                hero = warrior;
                break;
            case 2:
                Characters wizard = new Characters();
                CharacterManager wizardManager = new CharacterManager();
                wizardManager.addHero(wizard,"Wizard",75,80,45,20,80);
                hero = wizard;
                break;
            case 3:
                Characters giant = new Characters();
                CharacterManager giantManager = new CharacterManager();
                giantManager.addHero(giant,"Giant",80,40,70,5,125);
                hero = giant;
                break;
            case 4:
                Characters orc = new Characters();
                CharacterManager orcManager = new CharacterManager();
                orcManager.addHero(orc,"Orc",70,65,55,3,100);
                hero = orc;
                break;
        }
        Characters enemy = new Characters();
	    while(point>=0&&hero.health>0){
            RandomEnemy randomEnemy = new RandomEnemy();
            Random rand = new Random();
            int random = rand.nextInt(4);
            FightManager fightManager = new FightManager();
            enemy = randomEnemy.callEnemy(random);
	        point=point+fightManager.fightStarts(hero,enemy);
	        System.out.println("Score: "+point);
        }
	    System.out.println("GAME OVER!!");
    }
}
