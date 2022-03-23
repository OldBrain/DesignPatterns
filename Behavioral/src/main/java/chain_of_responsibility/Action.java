package chain_of_responsibility;

import chain_of_responsibility.clothes.*;

public class Action {
    public static void main(String[] args) {
        DressExecution dressExecution = new DressExecution();
        System.out.println("Холодно:");
        dressExecution.dress(Weather.COLDLY);

        System.out.println("Прохладно:");
        dressExecution.dress(Weather.CHILLY);

        System.out.println("Жарко:");
        dressExecution.dress(Weather.HOT);

    }
}
