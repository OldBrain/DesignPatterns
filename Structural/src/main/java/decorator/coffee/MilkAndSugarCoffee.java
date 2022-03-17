package decorator.coffee;

public class MilkAndSugarCoffee implements Coffee {

    private Coffee coffee;

    public MilkAndSugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCast() {
        return this.coffee.getCast() + 13;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + молоко + сахар";
    }
}
