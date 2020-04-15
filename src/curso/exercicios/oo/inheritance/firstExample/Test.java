package curso.exercicios.oo.inheritance.firstExample;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Player hero = new Hero(10,10);
        Player monster = new Monster(15,15);

        for(int i =0; i < 5; i++){
            hero.walk(Direction.NORTH);
        }
        for(int i =0; i < 4; i++){
            hero.walk(Direction.EAST);
        }
        System.out.println(Arrays.toString(hero.getPosition()));
        System.out.println("LifePoints:\n  Hero: " + hero.getLife() + "\n  Monster: " + monster.getLife());

        System.out.println("\nThe attack was effective? " + hero.attack(monster));

        System.out.println("\nLifePoints:\n  Hero: " + hero.getLife() + "\n  Monster: " + monster.getLife()+ "\n");
    }
}
