package adapter.farm.duck;

import adapter.farm.duck.Duck;

public class WhiteDuck implements Duck {

    @Override
    public void layEggs() {
        System.out.println("Белая утка снесла яйцо");
    }
}
