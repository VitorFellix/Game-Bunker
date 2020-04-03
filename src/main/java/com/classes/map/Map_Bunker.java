package main.java.com.classes.map;

import main.java.com.classes.entities.Entity;

public class Map_Bunker {
    private Map_List map_List;

    // Constructor
    public Map_Bunker(int AmountOfGrids, int DimensionOfGrid) {
        this.map_List = new Map_List();

        for (int i = 0; i < AmountOfGrids; i++) {
            map_List.Add(new Map_Nod());
        }
    }

    public void PrintOutGrid(int Index) {
        Entity[][] map_grid_out = map_List.GetByIndex(Index).GetOutput_Map_Grid();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("\n");
        for (int i = 0; i < map_grid_out.length; i++) {
            for (int j = 0; j < map_grid_out.length; j++) {
                System.out.print(map_grid_out[i][j].getTexture());
            }
            System.out.print("\n");
        }
    }

    public void PrintListSize() {
        System.out.println(map_List.GetSize());
    }
}
