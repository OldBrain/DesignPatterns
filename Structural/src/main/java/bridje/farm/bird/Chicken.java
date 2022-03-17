package bridje.farm.bird;

import bridje.farm.color.Color;

public class Chicken implements Bird{
    @Override
    public void say() {
        System.out.println("Я курица.");
    }

    @Override
    public void setColor(Color color) {
        color.getColor();
    }
}
