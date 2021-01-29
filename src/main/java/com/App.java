package main.java.com;

import main.java.com.classes.Dungeon;

public class App {
    static int idCount = 0;
    static Dungeon dungeon = null;

    public static int new_id() {
		return idCount++;
    }

    public static void main(String[] args) {
        run_game();
    }

    public static void run_game() {
        TurnSystem turn_system = new TurnSystem();

        turn_system.print_message("What size will be your dungeon?");
        dungeon = new Dungeon(Integer.valueOf(turn_system.get_input_int()));
        turn_system.set_dungeon();
        
        while(true){
            turn_system.do_turn();
        }
    }
}
