package main.java.com;

import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import main.java.com.classes.Dungeon;

public class TurnSystem {
    int turn_count = 0;
    Scanner sc = null;
    String last_input;
    Dungeon dungeon;
    Random rng = new Random(Date.from(Instant.now()).getTime());

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

    private void spawn_player(int x, int y){
        if(x >= 0 && y >= 0){
            if(x < dungeon.size && y < dungeon.size){
                player_position[0] = x;
                player_position[1] = y;
            }
        }
    }

    public void do_turn(){
        input_controller(sc.nextLine());
        turn_count++;
        print_message("Turn: " + String.valueOf(turn_count));
        print_dungeon();
    }

    private void input_controller(String input){
        if(input.equals("w") | input.equals("a") | input.equals("s") | input.equals("d"))
        {
            if(input.equals("w")){
                player_position[2] = player_position[0] + 1;
            }else if(input.equals("a")){
                player_position[3] = player_position[1] - 1;
            }else if(input.equals("s")){
                player_position[2] = player_position[0] - 1;            
            }else if(input.equals("d")){
                player_position[3] = player_position[1] + 1;            
            }
            move_player();
        }
    }

    private boolean move_player(){
        player_position = dungeon.move(player_position);
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
