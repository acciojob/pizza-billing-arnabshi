package com.driver;

public class DeluxePizza extends Pizza {

    // this is a change
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        addExtraCheese();
        addExtraToppings();
    }
}