package bridje.farm.bird;

import bridje.farm.color.Color;

public class Duck implements Bird {
    @Override
    public void say() {
        System.out.println("Я утка.");
    }

    @Override
    public void setColor(Color color) {
        color.getColor();
    }
}
