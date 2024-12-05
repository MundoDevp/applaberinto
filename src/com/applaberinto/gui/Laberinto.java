package com.applaberinto.gui;

import javax.swing.*;
import java.awt.*;

public class Laberinto extends JFrame {


    public Laberinto(){
        setTitle("Rescate de Bubu");
        setSize(600,630);
        setLayout(null);
        setResizable(false);
        Tablero tablero= new Tablero();
        add(tablero);
        addKeyListener(tablero);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
