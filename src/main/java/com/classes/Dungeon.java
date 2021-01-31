package main.java.com.classes;

public class Dungeon {

    public int size;
    public String[][] strings;
    String basic_texture = "[ ]";
    Player player;
    int[] player_position = new int[4]; 

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

    public boolean spawn_player(int x, int y){
        player = new Player();
        if(strings[x][y].equals("[ ]")){
            strings[x][y] = player.texture;
            return true;
        }
        return false;
    }

    public int[] move(int[] positions){
        //The first two ints are the object to move, the rest is the position where it should go
        strings[positions[2]][positions[3]] = strings[positions[0]][positions[1]];
        strings[positions[0]][positions[1]] = basic_texture;
        return new int[]{positions[2],positions[3],positions[2],positions[3]};
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

    private boolean is_inside_dungeon(int x, int y){
        if(x >= 0 && y >= 0){
            if(x < size && y < size){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
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
