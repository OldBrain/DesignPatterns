package chain_of_responsibility.clothes;

public class DressExecution {
    private Clothes dress = new SummerClothes(Weather.HOT);
    private Clothes autumn = new Sweater(Weather.CHILLY);
    private Clothes winter = new Coat(Weather.COLDLY);

    public DressExecution() {
        dress.setNext(autumn);
        autumn.setNext(winter);
    }

    public void dress(int weather) {
        dress.clothesManager(weather);
    }
}
