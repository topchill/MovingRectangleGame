package cegepst;

import cegepst.engine.Buffer;

import java.awt.*;

public class Player {

    private int x;
    private int y;
    private int width = 30;
    private int height = 60;
    private int speed = 4;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update(InputHandler inputHandler) {
        if(inputHandler.isDownPressed()) {
            y += speed;
        } else if (inputHandler.isUpPressed()) {
            y -= speed;
        } else if (inputHandler.isLeftPressed()) {
            x -= speed;
        } else if (inputHandler.isRightPressed()) {
            x += speed;
        }
    }

    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.red);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
