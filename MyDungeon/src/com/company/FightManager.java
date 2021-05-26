package com.company;
import java.util.Scanner;
import java.util.Random;

public class FightManager extends Characters {
    //------------> Fight Starts
    int fightStarts(Characters hero,Characters enemy) throws InterruptedException {
        int point=0;
        System.out.println(enemy.race+" SHOWS UP!!!");
        Thread.sleep(1000);
        while (hero.health>0 && enemy.health>0){
            Random rand = new Random();
            int random1 = rand.nextInt(99);
            int random2 = rand.nextInt(99);
            int random3 = rand.nextInt(99);
            int random4 = rand.nextInt(99);
            if(hero.health>0){
                System.out.println("Enemy's health : "+enemy.health);
                System.out.println("Hero's health : "+hero.health+" || Stamina : "+hero.stamina);
                System.out.println("--------------------------------------------");
                Thread.sleep(1000);
                System.out.println("Choose action...");
                System.out.println("1.Attack");
                System.out.println("2.Use health potion(health+20)");
                System.out.println("3.Use stamina potion(stamina+10)");
                System.out.println("4.Run!(-120 points)");
                Scanner scanner = new Scanner(System.in);
                int operator = scanner.nextInt();
                Thread.sleep(1000);
                switch (operator){
                    case 1:
                        int damage;
                        if(hero.stamina>=10){
                            if(0<=random1 && random1<=hero.critical-1){
                                damage = hero.damage*2;
                                System.out.println(hero.race + ": Critical hit!");
                            }else{
                                damage = hero.damage;
                            }
                            hero.stamina= hero.stamina-10;
                            enemy.health = enemy.health-damage;
                        }else{
                            System.out.println("Insufficient stamina!!");
                        }
                        break;
                    case 2:
                        hero.health=hero.health+20;
                        break;
                    case 3:
                        hero.stamina=hero.stamina+20;
                        break;
                    case 4:
                        point = point-120;
                        return point;
                }
                Thread.sleep(1000);
                System.out.println("Enemy's turn!");
                Thread.sleep(1000);
            }
            if(enemy.health>0){
                int damage;
                if(0<=random2 && random2<= enemy.critical-1){
                    damage = enemy.damage*2;
                    System.out.println(enemy.race + ": Critical hit!");
                }else{
                    damage = enemy.damage;
                }
                hero.health = hero.health-damage;
                Thread.sleep(1000);
            }else if(enemy.health<=0){
                System.out.println(enemy.race + " is dead.");
            }
            Thread.sleep(1000);
        }
        if(hero.health<=0){
            System.out.println("YOU ARE DEAD!");
        }else if(enemy.health<=0){
            point = point +100;
            return point;
        }
        return 0;
    }



    //------------> Fight Ends
}
