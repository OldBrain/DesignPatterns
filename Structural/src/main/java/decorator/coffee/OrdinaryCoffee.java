package decorator.coffee;

public class OrdinaryCoffee implements Coffee {

    @Override
    public int getCast() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Обычный кофе";
    }
}
