package Products;

import Events.Events;

public class Corn extends Product implements State{

    public Corn(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }


    @Override
    public void ChangeState(Events e) {

    }
}
