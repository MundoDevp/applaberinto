package com.applaberinto.model;

public class Pupu {
    private int x;
    private int y;

    public  Pupu(){
        x=0;
        y = 0;
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

    public void moverArriba(){
        x -=1;
    }

    public void moverAbajo(){
        x+=1;
    }
    public void moverIzquierda(){
        y-=1;
    }
    public void moverDerecha(){
        y+=1;
    }

}
