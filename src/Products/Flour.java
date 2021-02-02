package Products;

import Events.Events;

public class Flour extends Product implements State {
    public Flour(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }

    @Override
    public void ChangeState(Events e) {

    }
}
