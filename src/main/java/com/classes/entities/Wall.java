package main.java.com.classes.entities;

import main.java.com.classes.variables.Vector2;

public class Wall extends Entity {
    private String textureWall = "▒";
    private String textureEntry = "Ω"; // "∏Ω"
    private boolean isEntry = false;

    public Wall(int id, String name, Vector2 position) {
        super(id, name, position);
        Wall.super.setSolid(true);
        Wall.super.setTexture(textureWall);
    }

    public void setEntry() {
        Wall.super.setSolid(false);
        Wall.super.setTexture(textureEntry);
        this.isEntry = true;
    }

    public boolean isEntry() {
        return this.isEntry;
    }

}