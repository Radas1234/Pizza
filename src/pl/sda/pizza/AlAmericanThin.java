package pl.sda.pizza;

public class AlAmericanThin implements PizzaDough {
    @Override
    public void preparePizzaDough(){
        System.out.println("Przygotowanie ciasta : "+ getClass());
    }
}
