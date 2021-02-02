package Products;

import Events.Events;

public class Paint extends Product implements State{
    public Paint(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }

    @Override
    public void ChangeState(Events e) {

    }
}
