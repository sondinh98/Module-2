package anime_interface.animal;

import anime_interface.animal.Animal;
import anime_interface.animal.Chicken;
import anime_interface.animal.Tiger;
import anime_interface.animal.edible.Edible;
import anime_interface.animal.fruit.Apple;
import anime_interface.animal.fruit.Fruit;
import anime_interface.animal.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof  Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
