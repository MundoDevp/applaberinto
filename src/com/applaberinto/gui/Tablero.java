package com.applaberinto.gui;

import com.applaberinto.model.Pupu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tablero extends JPanel implements KeyListener {
    Pupu pupu;
    JLabel [][] elementos;
    GridLayout rejilla;

    public Tablero(){
        rejilla = new GridLayout(10,10);
        pupu = new Pupu();
        elementos = new JLabel[10][10];
        setLayout(rejilla);
        setSize(600,600);
        crearTablero();
        llenarTablero();
    }

    public void llenarTablero(){
        //removeAll();
        for (int i=0;i<elementos.length;i++){
            for(int j=0;j <elementos[i].length;j++){
                add(elementos[i][j]);
            }
        }
    }
    public void crearTablero(){

        for (int i=0;i<elementos.length;i++){
            for(int j=0;j <elementos[i].length;j++){
               elementos[i][j] = getLadrillo();
            }
        }
        elementos[pupu.getX()][pupu.getY()] = getPupu();
        elementos[0][1] = getCamino();
        elementos[0][3] = getCamino();
        elementos[0][6] = getCamino();
        elementos[0][9] = getCamino();
        //elementos[1][0] = getCamino();
        elementos[1][1] = getCamino();
        elementos[1][2] = getCamino();
        elementos[1][3] = getCamino();
        elementos[1][8] = getCamino();
        elementos[1][9] = getCamino();
        elementos[2][2] = getCamino();
        elementos[2][9] = getCamino();
        elementos[3][1] = getCamino();
        elementos[3][2] = getCamino();
        elementos[3][3] = getCamino();
        elementos[3][4] = getCamino();
        elementos[3][5] = getCamino();
        elementos[2][5] = getCamino();
        elementos[1][5] = getCamino();
        elementos[1][6] = getCamino();
        elementos[1][7] = getCamino();
        elementos[2][7] = getCamino();
        elementos[3][0] = getCamino();
        elementos[4][2] = getCamino();
        elementos[4][7] = getCamino();
        elementos[4][4] = getCamino();
        elementos[3][9] = getCamino();
        elementos[5][9] = getCamino();
        elementos[5][8] = getCamino();
        elementos[5][7] = getCamino();
        elementos[5][6] = getCamino();
        elementos[5][5] = getCamino();
        elementos[5][4] = getCamino();
        elementos[5][3] = getCamino();
        elementos[5][2] = getCamino();
        elementos[5][1] = getCamino();
        elementos[6][8] = getCamino();
        elementos[6][5] = getCamino();
        elementos[6][1] = getCamino();
        elementos[6][0] = getCamino();
        elementos[7][1] = getCamino();
        elementos[7][2] = getCamino();
        elementos[7][3] = getCamino();
        elementos[7][4] = getCamino();
        elementos[7][5] = getCamino();
        elementos[7][6] = getCamino();
        //elementos[7][8] = getCamino();
        //elementos[8][3] = getCamino();
        elementos[8][0] = getCamino();
        elementos[8][1] = getCamino();
        elementos[8][4] = getCamino();
        elementos[8][6] = getCamino();
        elementos[8][7] = getCamino();
        elementos[8][8] = getCamino();
        elementos[8][9] = getCamino();
        elementos[9][6] = getCamino();
        elementos[9][1] = getCamino();
        elementos[9][2] = getCamino();
        elementos[9][4] = getCamino();
        elementos[9][9] = getBubu();

    }

    public JLabel getLadrillo(){
        JLabel lblLadrillo= new JLabel("",JLabel.CENTER);
        lblLadrillo.setSize(60,60);
        ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/ladrillo.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblLadrillo.getWidth(),lblLadrillo.getHeight(),Image.SCALE_DEFAULT));
        lblLadrillo.setIcon(icono);
        return lblLadrillo;
    }

    public JLabel getCamino(){
        JLabel lblCamino = new JLabel("",JLabel.CENTER);
        lblCamino.setSize(60,60);
        ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/camino.gif");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblCamino.getWidth(),lblCamino.getHeight(),Image.SCALE_DEFAULT));
        lblCamino.setIcon(icono);
        return lblCamino;
    }

    public JLabel getPupu(){
        JLabel lblLadrillo= new JLabel("",JLabel.CENTER);
        lblLadrillo.setSize(60,60);
        ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/pupu.gif");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblLadrillo.getWidth(),lblLadrillo.getHeight(),Image.SCALE_DEFAULT));
        lblLadrillo.setIcon(icono);
        return lblLadrillo;
    }

    public JLabel getBubu(){
        JLabel lblLadrillo= new JLabel("",JLabel.CENTER);
        lblLadrillo.setSize(60,60);
        ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/bubu.gif");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblLadrillo.getWidth(),lblLadrillo.getHeight(),Image.SCALE_DEFAULT));
        lblLadrillo.setIcon(icono);
        return lblLadrillo;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if(e.getKeyCode()==39){
            pupu.moverDerecha();
            System.out.println(pupu.getX() + ","+ pupu.getY());
            ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/pupu.gif");
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(elementos[0][1].getWidth(),elementos[0][1].getHeight(),Image.SCALE_DEFAULT));
            elementos[pupu.getX()][pupu.getY()].setIcon(icono);
            llenarTablero();
            repaint();
        }else if(e.getKeyCode() == 40){
            pupu.moverAbajo();
            System.out.println(pupu.getX() + ","+ pupu.getY());
            ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/pupu.gif");
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(elementos[0][1].getWidth(),elementos[0][1].getHeight(),Image.SCALE_DEFAULT));
            elementos[pupu.getX()][pupu.getY()].setIcon(icono);
            llenarTablero();
            repaint();
        }else if(e.getKeyCode() == 38){
            pupu.moverArriba();
            System.out.println(pupu.getX() + ","+ pupu.getY());
            ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/pupu.gif");
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(elementos[0][1].getWidth(),elementos[0][1].getHeight(),Image.SCALE_DEFAULT));
            elementos[pupu.getX()][pupu.getY()].setIcon(icono);
            llenarTablero();
            repaint();
        }else if(e.getKeyCode() == 37){
            pupu.moverIzquierda();
            System.out.println(pupu.getX() + ","+ pupu.getY());
            ImageIcon imagen = new ImageIcon("src/com/applaberinto/images/pupu.gif");
            Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(elementos[0][1].getWidth(),elementos[0][1].getHeight(),Image.SCALE_DEFAULT));
            elementos[pupu.getX()][pupu.getY()].setIcon(icono);
            llenarTablero();
            repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
