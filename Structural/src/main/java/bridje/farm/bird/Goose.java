package bridje.farm.bird;

import bridje.farm.color.Color;

public class Goose implements Bird{
    @Override
    public void say() {
        System.out.println("Я гусь.");
    }

    @Override
    public void setColor(Color color) {
        color.getColor();
    }
}
