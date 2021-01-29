package main.java.com.classes;

public class Dungeon {

    int size;
    String[][] strings;
    String basic_texture = "[ ]";

    public Dungeon(int size) {
        this.size = size;
        strings = new String[size][size];
        
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                strings[i][j] = basic_texture;
            }
        }

        //set_corners();
    }

    public String[][] give_me_dungeon(){
        return strings;
    }

    public String give_me_dungeon_Inline(){
        String s = "";
        for (String[] strings2 : strings) {
            for (String string : strings2) {
                s = s.concat(string);
            }
            s = s.concat("\n");
        }
        return s;
    }
    
    private void set_corners(){
        strings[0][0] = "[lu]";
        strings[size - 1][0] = "[ld]";
        strings[0][size - 1] = "[ru]";
        strings[size - 1][size - 1] = "[rd]";

        /*
        [lu][ ][ ][ ][ ][ ][ru]
        [  ][ ][ ][ ][ ][ ][  ]
        [  ][ ][ ][ ][ ][ ][  ]
        [  ][ ][ ][ ][ ][ ][  ]
        [  ][ ][ ][ ][ ][ ][  ]
        [  ][ ][ ][ ][ ][ ][  ]
        [ld][ ][ ][ ][ ][ ][rd] 
        */
    }
}
