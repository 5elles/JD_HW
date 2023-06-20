package com.academy.burtsevich.lesson17.store;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Buyer {
    private String name;

    public String getName() {
        return name;
    }

    private static final Map<String, Integer> map = new HashMap<>() {
        {
            put("Bread", 12);
            put("Milk", 2);
            put("Fish", 52);
            put("Butter", 11);
            put("Apple", 6);
            put("Agg", 6);
            put("Beef", 6);
        }
    };
    private Map<String, Integer> bucket = new HashMap<>();

    public Map<String, Integer> getBucket() {
        return bucket;
    }

    public void setBucket(Map<String, Integer> bucket) {
        this.bucket = bucket;
    }

    public Buyer(int i) {
        this.name = "Buyer № " + i;
        generateBucket();
    }

    private void generateBucket(){
        Random random = new Random();
        int goodsNumber = random.nextInt(3) + 3;
        while (bucket.size() != goodsNumber) {
            for (Map.Entry<String, Integer> entry : map.entrySet()){
                if (Math.random() > 0.5) continue;
                bucket.put(entry.getKey(), entry.getValue());
                break;
            }
        }
    }

}
