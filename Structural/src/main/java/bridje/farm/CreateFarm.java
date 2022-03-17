package bridje.farm;

import bridje.farm.bird.Bird;
import bridje.farm.bird.Chicken;
import bridje.farm.bird.Duck;
import bridje.farm.bird.Goose;
import bridje.farm.color.Black;
import bridje.farm.color.Color;
import bridje.farm.color.Gray;
import bridje.farm.color.White;

public class CreateFarm {
    public static void main(String[] args) {
        Color white = new White();
        Color black = new Black();
        Color gray = new Gray();


        Bird whiteChicken = new Chicken();
        whiteChicken.say();
        whiteChicken.setColor(white);

        Bird blackChicken = new Chicken();
        blackChicken.say();
        blackChicken.setColor(black);

        Bird grayGoose = new Goose();
        grayGoose.say();
        grayGoose.setColor(gray);

        Bird blackDuck = new Duck();
        blackDuck.say();
        blackDuck.setColor(black);

    }
}
