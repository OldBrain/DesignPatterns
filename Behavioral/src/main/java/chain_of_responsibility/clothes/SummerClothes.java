package chain_of_responsibility.clothes;

public class SummerClothes extends Clothes {


    public SummerClothes(int priority) {
        super(priority);
    }

    @Override
    protected void dress() {
        System.out.println("Одеваем легкую одежду.");
    }
}
