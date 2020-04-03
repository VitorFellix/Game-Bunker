package com.classes.map;

import java.util.Scanner;

public class Map_Status{
    Map_Bunker bunker;
    Scanner kb;
    int PreviousTurn;
    boolean GotoNextStage; 
    int GridToDisplay;

    public Map_Status(Map_Bunker bunker, Scanner kb, int previousTurn, boolean gotoNextStage, int gridToDisplay) {
        this.bunker = bunker;
        this.kb = kb;
        PreviousTurn = previousTurn;
        GotoNextStage = gotoNextStage;
        GridToDisplay = gridToDisplay;
    }

    public Map_Bunker getBunker() {
        return bunker;
    }

    public void setBunker(Map_Bunker bunker) {
        this.bunker = bunker;
    }

    public Scanner getKb() {
        return kb;
    }

    public void setKb(Scanner kb) {
        this.kb = kb;
    }

    public int getPreviousTurn() {
        return PreviousTurn;
    }

    public void setPreviousTurn(int previousTurn) {
        PreviousTurn = previousTurn;
    }

    public boolean isGotoNextStage() {
        return GotoNextStage;
    }

    public void setGotoNextStage(boolean gotoNextStage) {
        GotoNextStage = gotoNextStage;
    }

    public int getGridToDisplay() {
        return GridToDisplay;
    }

    public void setGridToDisplay(int gridToDisplay) {
        GridToDisplay = gridToDisplay;
    }

}