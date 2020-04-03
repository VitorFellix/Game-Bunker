package main.java.com.classes.map;

import main.java.com.classes.entities.Entity;

public class Map_Nod {

    private Map_Nod next_map_nod = null;
    private Map_Grid map_Grid = null;

    public Map_Nod() {
        this.map_Grid = new Map_Grid();
    }

    public Map_Nod(Map_Grid Grid) {
        this.map_Grid = Grid;
    }

    // #region set_e_gets
    public Map_Nod GetNext() {
        return next_map_nod;
    }

    public void SetNext(Map_Nod Next) {
        this.next_map_nod = Next;
    }

    public Entity[][] GetOutput_Map_Grid() {
        return map_Grid.OutputMap_Grid();
    }

    public Map_Grid GetGrid() {
        return map_Grid;
    }

    // #endregion
}