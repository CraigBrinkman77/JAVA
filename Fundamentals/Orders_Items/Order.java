import java.util.ArrayList;

class Order{
    String name;
    Double total = 0.0;
    Boolean isReady;
    ArrayList<Item> items;
    
    
    public Order(){
        this.items = new ArrayList<Item>();
    }
}