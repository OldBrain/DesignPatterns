package adapter.farm;

import adapter.farm.chicken.Chicken;
import adapter.farm.chicken.ChickenAdapter;
import adapter.farm.duck.BlackDuck;
import adapter.farm.duck.Duck;
import adapter.farm.duck.WhiteDuck;

public class WorkFarmerStart {


    public static void main(String[] args) {
        Duck bird = new ChickenAdapter(new Chicken());
        Duck whiteDuck = new WhiteDuck();
        Duck blackDuck = new BlackDuck();
        Farmer farmer = new Farmer();

        farmer.feed(blackDuck);
        farmer.feed(whiteDuck);
        farmer.feed(bird);

    }
}
