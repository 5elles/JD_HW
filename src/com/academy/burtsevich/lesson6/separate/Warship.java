package com.academy.burtsevich.lesson6.separate;

abstract class Warship {
   private int displacement, range;
   private String type;

   public Warship(){

   }
    public Warship(int displacement, int range, String type) {
        this.displacement = displacement;
        this.range = range;
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
