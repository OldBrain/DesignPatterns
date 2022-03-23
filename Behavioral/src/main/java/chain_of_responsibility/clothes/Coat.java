package chain_of_responsibility.clothes;

public class Coat extends Clothes {


    public Coat(int priority) {
        super(priority);
    }

    @Override
    protected void dress() {
        System.out.println("Одеваем пальто: ");
    }
}
