public class Item<E extends Object> {
    private E key;

    public Item(E key)
    {
        this.key = key;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }
}
