package com.company;

import CityName.ChooseCity;

public class Activity {
    ChooseCity cities = new ChooseCity();

    public void print() {
        System.out.println(cities.getCity());
    }
}
