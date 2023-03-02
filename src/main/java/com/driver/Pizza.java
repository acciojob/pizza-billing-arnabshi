package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    boolean extraChease;
    boolean extraTopping;
    boolean billCreated;
    boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.topping=70;
        }
        else{
            this.price=400;
            this.topping=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraChease){
            this.price+=80;
            this.extraChease=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraTopping){
            this.price+=this.topping;
            this.extraTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            this.price+=20;
            takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billCreated) {
            if (extraChease) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (extraTopping) {
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            }
            if (takeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price: " + this.price+"\n";
            billCreated=true;
            return this.bill;
        }
        return "";
    }
}
