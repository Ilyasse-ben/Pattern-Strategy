package net.ilyasse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Context context=new Context();
        Map<String,IStrategy> strategyMap=new HashMap<>();
        IStrategy strategy;
        while(true){
            try {
                System.out.println("Quelle stratyge: ");
                String strategyClassName=scanner.nextLine();
                strategy=strategyMap.get(strategyClassName);
                if(strategy==null){
                    strategy=(IStrategy) Class.forName("net.ilyasse.StrategyImp"+strategyClassName).newInstance();
                    strategyMap.put(strategyClassName,strategy);
                }

                context.setStrategy(strategy);
                context.effectuerOperation();
            }catch (Exception e){
                System.out.printf("errure de type "+e.getMessage());
            }

        }


    }
}