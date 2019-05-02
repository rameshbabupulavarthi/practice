package com.designpattern.creational.abstractfactory;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by Sunil Golla on 5/2/2019.
 */


abstract class AbstractFood {
    public abstract String getItemName();
    public abstract boolean isDelivered();
    public abstract int getQuantity();


}

@Data
class ItalianFood extends AbstractFood {
    String itemName;
    int quantity;
    boolean delivered;

    public ItalianFood(String itemName,int quantity){
        this.itemName=itemName;
        this.quantity=quantity;
    }
}

@Data
class ChineseFood extends AbstractFood {
    String itemName;
    int quantity;
    boolean delivered;

    public ChineseFood(String itemName,int quantity){
        this.itemName=itemName;
        this.quantity=quantity;
    }
}

@Data
class MexicanFood extends AbstractFood {
    String itemName;
    int quantity;
    boolean delivered;

    public MexicanFood(String itemName,int quantity){
        this.itemName=itemName;
        this.quantity=quantity;
    }
}

abstract class AbstractFoodFactory {
    public abstract AbstractFood placeOrder(String itemName, int quantity) ;
}

class ItalianFoodFactory extends AbstractFoodFactory {

    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new ItalianFood(itemName,quantity);
    }

}

class ChineseFoodFactory extends AbstractFoodFactory {

    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new ChineseFood(itemName,quantity);
    }

}

class MexicanFoodFactory extends AbstractFoodFactory {
    @Override
    public AbstractFood placeOrder(String itemName, int quantity) {
        return new MexicanFood(itemName,quantity);
    }
}

class ConsumerClass {
    public AbstractFood placeOrder(String itemName,int quantity,String itemType) {
        AbstractFoodFactory a = null;
        if(itemType.equals("italian")) {
            a = new ItalianFoodFactory();
        }else if(itemType.equals("mexican")) {
            a = new MexicanFoodFactory();
        }else if(itemType.equals("chinese")) {
            a = new ItalianFoodFactory();
        }
        if(a!=null) {
            return a.placeOrder(itemName, quantity);
        }else {
            return null;
        }
    }
}

public class MenuApplication {

    ArrayList order;
    public static void main(String[] args) {
        MenuApplication m = new MenuApplication();
        m.createOrder();
    }
    public boolean createOrder() {
        boolean orderCreated = false;
        ConsumerClass c = new ConsumerClass();
        order = new ArrayList();
        order.add(c.placeOrder("Lazagne", 2, "italian"));
        order.add(c.placeOrder("Taco", 3, "mexican"));
        order.add(c.placeOrder("Noodles", 1, "chinese"));
        System.out.println(order);
        return orderCreated;
    }
}
