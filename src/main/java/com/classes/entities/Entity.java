package main.java.com.classes.entities;

import main.java.com.classes.variables.Vector2;

public class Entity{

    private int id;
    private String name;
    private String texture = "x";
    private Vector2 position;
    private boolean isSolid = true;

    public Entity(int id){
        this.id = id;
    }

    public Entity(int id, String name, Vector2 position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Vector2 Move(Vector2 direction, int range){
        direction.Multiply(range);
        Vector2 temp = new Vector2(direction.x, direction.y);
        temp.Add(position);
        return temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public boolean isSolid() {
        return isSolid;
    }

    public void setSolid(boolean isSolid) {
        this.isSolid = isSolid;
    }
}