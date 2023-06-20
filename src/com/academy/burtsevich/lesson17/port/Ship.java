package com.academy.burtsevich.lesson17.port;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Ship {
    public final String name;

    public Ship(String name){
        this.name = name;
        loadTheShip();
    }

    ArrayList<String> cargoType = new ArrayList<>(){
        {
            add("Car");
            add("Wheat");
            add("Gold");
            add("Gas");
            add("Oil");
            add("Silver");
        }
    };

    private final Map<String, Integer> cargo = new HashMap<>();

    public Map<String, Integer> getCargo() {
        return cargo;
    }

    private void loadTheShip(){
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            cargo.put(cargoType.get(random.nextInt(cargoType.size())), random.nextInt(20)+1);
        }
    }

}
