package com;

import java.util.Scanner;

import com.classes.map.Map_Bunker;
import com.classes.map.Map_Status;

public class App {

    public static void main(String[] args) {
        // System.out.println( "Hello THERE!" );
        Map_Bunker bunker = new Map_Bunker(3, 9);
        Scanner kb = new Scanner(System.in);
        Map_Status status = new Map_Status(bunker, kb, 0, false, 1);
        turn(status);
    }

    public static void turn(Map_Status status) {
        int ActualTurn = status.getPreviousTurn() + 1;
        status.getBunker().PrintOutGrid(status.getGridToDisplay());
        String input = status.getKb().next();
        switch (input) {
            case "y":
                status.setPreviousTurn(ActualTurn);
                turn(status);
                break;
            case "n":
                break;
            default:
                break;
        }
    }

    public static int NewId() {
        int idCount = 0;
		return idCount ++;
    }
}
