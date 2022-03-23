package chain_of_responsibility.clothes;

public class Sweater extends Clothes {


    public Sweater(int priority) {
        super(priority);
    }

    @Override
    protected void dress() {
        System.out.println("Одеваем свитер: ");
    }
}
