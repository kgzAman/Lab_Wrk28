package Products;

import Events.Events;

public class Dried_Fruit extends Product implements State{

    public Dried_Fruit(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }

    @Override
    public void ChangeState(Events e) {

    }
}
