package game;//package game;
//import player.*;
//import player.ai.*;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//public class Options extends JFrame {
//
//    public Options(){
//        JButton P1_VS_P2 = new JButton("P1 VS P2");
//        this.add(P1_VS_P2);
//        JButton P1_VS_AI = new JButton("P1 VS AI");
//        this.add(P1_VS_AI);
//        JButton AI_VS_AI = new JButton("AI VS AI");
//        this.add(AI_VS_AI);
//        this.setTitle("Options");
//        this.setDefaultCloseOperation(JButton.);
//        this.pack();
//        this.setVisible(true);
//        //this.setSize(500,500);
//
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Options extends JFrame implements ActionListener {
    private JButton P1_VS_P2, P1_VS_AI, AI_VS_AI, Easy, Hard;
    private boolean topSelected = false;
    private boolean bottomSelected = false;
    static public int Option1;
    static public int Option2;


    public Options() {
        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setTitle("My GUI");

        // Set up the buttons
        P1_VS_P2 = new JButton("P1_VS_P2");
        P1_VS_AI = new JButton("P1_VS_AI");
        AI_VS_AI = new JButton("AI_VS_AI");
        Easy = new JButton("Easy");
        Hard = new JButton("Hard");

        // Add action listeners to the buttons
        P1_VS_P2.addActionListener(this);
        P1_VS_AI.addActionListener(this);
        AI_VS_AI.addActionListener(this);
        Easy.addActionListener(this);
        Hard.addActionListener(this);

        // Set up the layout
        setLayout(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 columns, 10 pixels horizontal and vertical gap

        // Add the buttons to the frame
        add(P1_VS_P2);
        add(P1_VS_AI);
        add(AI_VS_AI);
        add(Easy);
        add(Hard);

        // Make the buttons in the first row centered
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.add(P1_VS_P2);
        panel1.add(P1_VS_AI);
        panel1.add(AI_VS_AI);
        add(panel1);

        // Make the buttons in the second row centered
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.add(Easy);
        panel2.add(Hard);
        add(panel2);

        // Show the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check which button is clicked
        if (e.getSource() == P1_VS_P2 || e.getSource() == P1_VS_AI || e.getSource() == AI_VS_AI) {
            // A button from the top row is clicked
            if(e.getSource() ==P1_VS_P2){
                Option1 = 1;
            }else if(e.getSource() ==P1_VS_AI){
                Option1 = 2;
            }else if(e.getSource() ==AI_VS_AI){
                Option1 =3;
            }
            topSelected = true;
        } else if (e.getSource() == Easy || e.getSource() == Hard) {
            // A button from the bottom row is clicked
            if(e.getSource() ==Easy){
                Option2 = 1;
            }else if(e.getSource() ==Hard){
                Option2 = 2;
            }
            bottomSelected = true;
        }

        // Check if a button from each row is selected at the same time
        if (topSelected && bottomSelected) {
            // Close the window
            dispose();
            new GameWindow(Option1,Option2);
        }
    }
}