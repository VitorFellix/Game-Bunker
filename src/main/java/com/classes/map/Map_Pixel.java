package main.java.com.classes.map;

import main.java.com.classes.entities.Entity;

public class Map_Pixel {
    private String texture = "x";
    private Entity entity = null; 

    public Map_Pixel(){}
    public Map_Pixel(Entity entity){
        this.texture = entity.getTexture();
    }

    public Entity GetEntity(){
        return entity;
    }
    public String GetTexture(){
        return texture;
    }
}