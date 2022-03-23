package chain_of_responsibility.clothes;

public abstract class Clothes {
    private int priority;
    private Clothes next;

    public Clothes(int priority) {
        this.priority = priority;
    }

    public void setNext(Clothes next) {
        this.next = next;
    }

    public void clothesManager(int layers) {
        if (layers >= priority) {
            dress();
        }
        if (next != null) {
            next.clothesManager(layers);
        }
    }

    protected abstract void dress();

}
