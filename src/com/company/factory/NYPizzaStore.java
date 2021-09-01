package com.company.factory;

public class NYPizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
