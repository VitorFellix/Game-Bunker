package main.java.com.classes.map;

public class Map_List {

    private Map_Nod inicial_map_nod = null;
    private Map_Nod last_map_nod = null;
    private int size = 0;

    // #region constructors
    public Map_List() {

    }

    public Map_List(Map_Nod Inicial) {
        SetInicial(Inicial);
    }

    public Map_List(Map_Nod Inicial, Map_Nod Final) {
        SetInicial(Inicial);
        SetLast(Final);
    }
    // #endregion

    // #region Basic Methods

    public void Add(Map_Nod Nod_to_add) {
        if (inicial_map_nod == null) {
            SetInicial(Nod_to_add);
            SetLast(Nod_to_add);
        } else {
            Map_Nod temp = inicial_map_nod;
            temp = GetLast();
            temp.SetNext(Nod_to_add);
            SetLast(Nod_to_add);
            /*
             * if (last_map_nod == null) { while (temp.GetNext() != null) { temp =
             * temp.GetNext(); } SetLast(temp); } else { temp = GetLast(); }
             */
        }
        SetSize(GetSize() + 1);
    }

    public Map_Nod GetByIndex(int index) {
        Map_Nod temp = inicial_map_nod;
        index--;
        // Index fora do List
        if (index > GetSize()) {
            System.out.println("ERROR :: Index fora do List");
            return null;
        }
        while (index != 0) {
            temp = temp.GetNext();
            index--;
            if (index < 0) {
                return null;
            }
        }
        return temp;
    }

    // #endregion

    // #region gets e sets
    public Map_Nod GetInicialNod() {
        return this.inicial_map_nod;
    }

    public Map_Nod GetLast() {
        return this.last_map_nod;
    }

    public int GetSize() {
        return this.size;
    }

    private void SetSize(int Size) {
        this.size = Size;
    }

    private void SetInicial(Map_Nod New_inicial_nod) {
        this.inicial_map_nod = New_inicial_nod;
    }

    private void SetLast(Map_Nod New_last_nod) {
        this.last_map_nod = New_last_nod;
    }

    // #endregion
}