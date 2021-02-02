package CityName;


import java.util.Random;

public class ChooseCity {
        private Cities[] cities= new Cities[6];
        private Cities city = chooseCityDestination();

    public Cities getCity() {
        return city;
    }

    public Cities chooseCityDestination(){
        Random rnd = new Random();
        int randomCity = rnd.nextInt(6);
            cities[0]= new Boston("Boston",rnd.nextInt(50)+50);
            cities[1]= new Chicago("Chicago",rnd.nextInt(50)+50);
            cities[2]= new NewYork("New York", rnd.nextInt(50)+50);
            cities[3]= new LasVegas("Las Vegas",rnd.nextInt(50)+50);
            cities[4]= new Philadelphia("Philadelphia",rnd.nextInt(50)+50);
            cities[5]= new SanFrancisco("SanFrancisco",rnd.nextInt(50)+50);
        Cities chooseCity = cities[randomCity ];
        return chooseCity;
        }

    @Override
    public String toString() {
        return "ChooseCity{" +
                "city=" + city +
                '}';
    }
}
