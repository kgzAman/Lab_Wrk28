package Products;

import Events.Events;

public class Meat extends Product implements State {


    public Meat(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }
    @Override
    public void ChangeState(Events e) {

    }
}
