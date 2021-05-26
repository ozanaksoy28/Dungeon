package com.company;

public class RandomEnemy extends Characters{
    Characters callEnemy(int x){
        Characters ennemy = new Characters();
        switch (x){
            case 0:
                Characters zombie = new Characters();
                CharacterManager zombieManager = new CharacterManager();
                zombieManager.addEnemies(zombie,"Zombie",90,30,30,120);
                ennemy = zombie;
                return ennemy;
            case 1:
                Characters skeleton = new Characters();
                CharacterManager skeletonManager = new CharacterManager();
                skeletonManager.addEnemies(skeleton,"Skeleton",120,30,35,130);
                ennemy= skeleton;
                return ennemy;
            case 2:
                Characters witch = new Characters();
                CharacterManager witchManager = new CharacterManager();
                witchManager.addEnemies(witch,"Witch",150,60,45,110);
                ennemy= witch;
                return ennemy;
            case 3:
                Characters bunny = new Characters();
                CharacterManager bunnyManager = new CharacterManager();
                bunnyManager.addEnemies(bunny,"Killer Bunny",15000,60,450,110);
                ennemy= bunny;
                return ennemy;
        }
        return ennemy;
    }

}
