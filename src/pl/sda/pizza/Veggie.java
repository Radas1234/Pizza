package pl.sda.pizza;

import java.util.List;

public class Veggie implements Pizza, Ingredients {

    private List<String> ingrets;
    private PizzaDough pizzaDough;
    public Veggie(){ }

    public Veggie(List<String>ingrets, PizzaDough pizzaDough){
        this.ingrets = ingrets;
        this.pizzaDough = PizzaDough;
    }
    @Override
    public void preparePizza(){



    }
}
