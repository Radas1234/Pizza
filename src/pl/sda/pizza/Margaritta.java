package pl.sda.pizza;

import java.util.List;

public class Margaritta implements Pizza, Ingredients {

    private List<String> ingrets;
    private PizzaDough pizzaDough;

    public Margaritta(){}
    public Margaritta(List<String>ingrets, PizzaDough pizzaDough){
        this.ingrets = ingrets;
        this.pizzaDough = PizzaDough;
    }
    @Override
    public void preparePizza(){



    }
}
