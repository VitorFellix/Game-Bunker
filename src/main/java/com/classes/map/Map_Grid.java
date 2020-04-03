package main.java.com.classes.map;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import main.java.com.App;
import main.java.com.classes.entities.Entity;
import main.java.com.classes.entities.Wall;

public class Map_Grid {
    // private int enemy_spawn_max = 0;
    // private int enemy_spawn_min = 0;
    // private Enemy_type enemy_spawn_type;
    private Entity Spaces[][];
    private int Dimension = 10;
    private int MaxNum_Exits = 4;
    private int MinNum_Exits = 1;

    // new Random(LocalTime.now().toNanoOfDay()));
    // MAP_GRID INICIAL,
    // NÃO POSSUI DIMENSÃO ANTERIOR
    // NÃO POSSUI ENTRADA ANTERIOR
    public Map_Grid() {
        // Creates a Space that can be filled up with entities
        this.Spaces = new Entity[Dimension][Dimension];

        // Build Walls
        WallIt();

        // Generate Random Exits
        LETMEOUT();
    }

    private void LETMEOUT() {
        // Creates Exits inside walls

        int counter = 0;
        List<Entity> Sides = GetAllSides(false);
        // Bug proof
        if (MaxNum_Exits < MinNum_Exits) {
            MaxNum_Exits = MinNum_Exits;
        }
        // Create Entry until reaches the maxNum of exits
        while (counter <= MaxNum_Exits) {
            Random rng = new Random(LocalTime.now().toNanoOfDay());
            // Generates a random int inside the List and see if it is a wall
            int index = rng.nextInt(Sides.size());
            if (Sides.get(index).getClass() == Wall.class) {
                // Gets that wall
                Wall wall = (Wall) Sides.get(index);
                // If is not a Entry yet
                if (wall.isEntry() == false) {
                    // Transforms it into a Entry
                    wall.setEntry();
                    // Less one entry to create
                    counter++;
                }
            }
        }

    }

    private void WallIt() {
        for (Entity entity : GetAllSides(true)) {
            // Creates a new wall for every side
            Wall wall = new Wall(App.NewId(), "Wall", entity.getPosition());
            entity = wall;
        }
    }

    private List<Entity> GetAllSides(boolean withCorners) {
        List<Entity> AllSides = new ArrayList<Entity>();
        for (int i = 1; i < 5; i++) {
            // Adds all Entitys returned from each side
            AllSides.addAll(GetSide(i, withCorners));
            if (withCorners) {
                // Removes the last index so that the corners are not duplicated
                AllSides.remove(AllSides.size() - 1);
            }
        }
        return AllSides;
    }

    // 1 to 4 are the sides
    private List<Entity> GetSide(int side, boolean withCorners) {
        List<Entity> Side = new ArrayList<Entity>();
        for (int k = 0; k < Spaces.length;) {
            if (withCorners == false) {
                if (k == 0 || k == Spaces.length - 1)
                    break;
            }
            switch (side) {
                case 1:// Top Side
                    Side.add(Spaces[0][k]);
                    break;
                case 2:// Right Side
                    Side.add(Spaces[k][Spaces.length - 1]);
                    break;
                case 3:// Bottom Side
                    Side.add(Spaces[Spaces.length - 1][k]);
                    break;
                case 4:// Left Side
                    Side.add(Spaces[k][0]);
                    break;
                default:
                    break;
            }
        }
        return Side;
    }

    public Entity[][] OutputMap_Grid() {
        return Spaces;
    }

    public int GetDimension() {
        return Spaces.length;
    }
}