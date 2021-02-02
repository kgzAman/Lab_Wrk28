package CityName;

public class Cities {
    private String name;
    private int Distance;

    public Cities(String name, int distance) {
        this.name = name;
        Distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    @Override
    public String toString() {
        return
                "City name: " + name + "."+"\n"+
                "Distance :" + Distance +" лиг.";
    }
}
