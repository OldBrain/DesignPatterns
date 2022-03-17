package adapter.farm.chicken;

import adapter.farm.duck.Duck;

public class ChickenAdapter implements Duck {

    protected Chicken chicken;

    public ChickenAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void layEggs() {
        chicken.givEgg();
    }
}
