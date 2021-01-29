package main.java.com.classes;

import main.java.com.App;

public class Player{

    int id;
    float health;
    float damage;
    Item[] inventory;
    int move_range = 5;
    int view_range = move_range;

    public Player() {
        this.id = App.new_id();
        this.inventory = new Item[6];
    }

    public boolean add_to_inventory(Item item_to_add){
        for (Item item : inventory) {
            if(item == null){
                item = item_to_add;
                return true;//"item was added to the inventory";
            }
        }
        return false;//"there is no space in your inventory";
    }

    @Override
    public String toString() {
        return "Player: [ ]";
    }
    
}