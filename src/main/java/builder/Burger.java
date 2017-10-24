package builder;

/**
 * Created by schiduvasile on 10/24/17.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}