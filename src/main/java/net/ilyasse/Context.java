package net.ilyasse;

public class Context  {
    private IStrategy strategy;

    public Context(){
        strategy=new StrategyImpDefault();
    }
    public void effectuerOperation(){
        System.out.println("*******************************************");
        strategy.operation();
        System.out.println("============================================");

    }
    public void setStrategy(IStrategy strategy){
        this.strategy=strategy;
    }
}
