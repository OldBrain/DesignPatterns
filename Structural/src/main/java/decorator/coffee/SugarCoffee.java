package decorator.coffee;

public class SugarCoffee implements Coffee {

    private Coffee coffee;

    public SugarCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getCast() {
        return this.coffee.getCast() + 8;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " + сахар";
    }
}
