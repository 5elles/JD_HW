package com.academy.burtsevich.lesson13;

import java.util.Objects;

public class FoodChecker {

    public boolean isVegetarian(FoodType... foodTypes) {
        boolean flag = true;
        for (FoodType foodType : foodTypes) {
            if (
                    foodType == FoodType.FISH ||
                            foodType == FoodType.MEAT ||
                            foodType == FoodType.UNKNOWN
            ) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
