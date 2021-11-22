package com.GUISwing;

import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        // J Frame = a GUI window to add components to

        JFrame frame = new JFrame(); // creates a frame

        frame.setTitle("J Frame Title Goes Boom"); // sets title of frame
        // creates an image icon
        ImageIcon image = new ImageIcon("resources/potion.png");
        frame.setIconImage(image.getImage()); // change icon of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // prevents frame from being resized

        frame.setSize(420, 420); // sets x and y dimensions
        frame.setVisible(true); // make frame visible

        frame.getContentPane().setBackground(new Color(204,204,255));
    }

}
