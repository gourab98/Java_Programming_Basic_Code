package brick_break;

import javax.swing.JFrame;

/**
 *
 * @author gourab
 */
public class Main {

    public static void main(String[] args) {
        JFrame obj =new JFrame();
        Gameplay gamePlay =new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick_Break");
        obj.setResizable(true);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    
    }
}
