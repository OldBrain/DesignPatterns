package decorator;

import decorator.coffee.Coffee;
import decorator.coffee.MilkAndSugarCoffee;
import decorator.coffee.MilkCoffee;
import decorator.coffee.OrdinaryCoffee;

public class CoffeeHouse {
    public static void main(String[] args) {
        Coffee ordinaryCoffee = new OrdinaryCoffee();

        Coffee milkCoffee = new MilkCoffee(ordinaryCoffee);
        System.out.println(milkCoffee.getDescription()+" Цена: "+ milkCoffee.getCast());

        Coffee milkAndSugarCoffee = new MilkAndSugarCoffee(ordinaryCoffee);
        System.out.println(milkAndSugarCoffee.getDescription()+" Цена: "+ milkAndSugarCoffee.getCast());




    }
}
