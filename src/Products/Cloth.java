package Products;

import Events.*;

public class Cloth extends Product implements State{


    public Cloth(String name, double price, State state, double weight) {
        super(name, price, state, weight);
    }


    @Override
    public void ChangeState(Events e) {

    }
}
