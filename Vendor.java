import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Vendor {

    //Vendor constructor with inventory list by default
    //When we instantiate an instance of Vendor, we can optionally pass in a list with the keyword argument inventory =>figure it out, constructor overloading???

    //add and remove method: 

    protected String name;
    public List<Item> inventory;

    public Vendor(String name){
        this.inventory = new ArrayList<>();
        this.name = name;
    }

    public Vendor(String name,List<Item> inventory){
        this.name = name;
        this.inventory = inventory; /// Use "this" to refer to the instance variable
    }

    public String toString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Item add(Item item){
        this.inventory.add(item);        
        return item;
    }

    //update to pass int itemID to remove item
    public Item remove(Item item){
        Iterator<Item> iterator = this.inventory.iterator();

        while (iterator.hasNext()){
            Item unit = iterator.next();
            if (unit.equals(item)){
                iterator.remove();
                return item; //update to String "Item has been removed from vendor {name}'s' inventory list"
            }
        }
        return null; //when item was not found //update to String "Item is not found in vendor {name}'s inventory list"
    }

    public List<Item> getByCategory(String category){
        List<Item> output = new ArrayList<Item>() ;
        
        for (Item item:this.inventory){
            if(item.category.equals(category)){
                output.add(item);
            }
        }
        return output;
        
    }
}