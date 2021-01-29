package main.java.com;

import java.util.Scanner;

import main.java.com.classes.Dungeon;
import main.java.com.classes.Player;

public class TurnSystem {
    int turn_count = 0;
    Scanner sc = null;
    String last_input;
    Dungeon dungeon;

    public TurnSystem() {
        sc = new Scanner(System.in);

        /*
        Input
            ask for input
            receive the input

        Calculations
            go through every entity
                define who you go first
            go through every entity in order of doing
                call methods in each object to do inputs

        Output
            clear console
            print dungeon
        */

    }

    public void do_turn(){
        sc.nextLine();
        turn_count++;
        print_message("Turn: " + String.valueOf(turn_count));
        print_dungeon();
    }

    private boolean move_player(Player player){
        
        return true;
    }

    private void print_dungeon(){
        System.out.println(dungeon.give_me_dungeon_Inline());
    }

    public void print_message(String message){
        System.out.println("\n[ " + message + " ]");
    }

    public int get_input_int(){
        return sc.nextInt();
    }

    public String get_input_string(){
        return sc.nextLine();
    }

    public boolean set_dungeon(){
        try {
            dungeon = App.dungeon;
            return true;
        } catch (Exception e) {
            print_message("Error 01: " + e.getMessage());
            return false;
        }
    }
    
}
