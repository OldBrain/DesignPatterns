package decorator.coffee;

public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCast() {
        return this.coffee.getCast() + 5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + молоко";
    }
}
