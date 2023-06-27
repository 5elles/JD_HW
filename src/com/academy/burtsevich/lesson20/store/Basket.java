package com.academy.burtsevich.lesson20.store;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Basket {
    private Product[] products;


    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void getCheck() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("\nДата: %34s\n\n", formatter.format(LocalDate.now()));
        System.out.printf("%-10s %-12s %-8s %-6s\n",
                "Продукты",
                "Категория",
                "Рейтинг",
                "Цена");
        System.out.println("-----------------------------------------");

        Arrays.stream(products)
                .forEach(product -> System.out.printf("%-10s %-12s %-8s %-5s \n",
                        product.getName(),
                        product.category.getCategoryName(),
                        product.getRating(),
                        currencyFormat.format(product.getPrice())));
        System.out.println("-----------------------------------------");

        Double sum = Arrays.stream(products)
                .mapToDouble(Product::getPrice)
                .reduce(Double::sum)
                .orElse(0);

        String formattedMoney = currencyFormat.format(sum);
        System.out.printf("Итого: %34s\n\n", formattedMoney);

    }

}
