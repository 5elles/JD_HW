package com.academy.burtsevich.lesson20.store;


public class Task3 {

    public static void main(String[] args) {

        Category stationery = new Category("Канцелярия");
        Category food = new Category("Продукты");
        Category cookware = new Category("Посуда");

        Product[] stationeryArray = {
                new Product("Ножницы", 230.4, 3, stationery),
                new Product("Ручка", 53.2, 5, stationery)};

        Product[] foodsArray = {
                new Product("Хлеб", 20.7, 10, food),
                new Product("Молоко", 25.34, 8, food)};

        Product[] cookwaresArray = {
                new Product("Стакан", 350.7, 9, cookware),
                new Product("Тарелка", 430.2, 2, cookware)};

        stationery.setProducts(stationeryArray);
        food.setProducts(foodsArray);
        cookware.setProducts(cookwaresArray);

        Basket basket = new Basket(new Product[]{
                stationery.getProducts()[0],
                stationery.getProducts()[1],
                cookware.getProducts()[0],
                food.getProducts()[0],
                food.getProducts()[1]
        });

        basket.getCheck();
    }
}
