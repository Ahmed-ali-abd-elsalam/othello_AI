package game;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow(int op1,int op2){
        GamePanel gp = new GamePanel(op1,op2);
        this.add(gp);
        this.setTitle("othello v0.1");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        //this.setSize(500,500);

    }

    public static void main(String[] args) {
        new Options();
//        new GameWindow();
    }

}
