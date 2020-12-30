package production.test.factory;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings= new ArrayList();

    void prepare(){
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for(int i=1; i< toppings.size(); i++){
            System.out.println("   "+ toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place the pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
