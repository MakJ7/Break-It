import javax.swing.JFrame;

/**
 * Write a description of class Main here.
 *
 * @author MakJ7
 * @version 04/09/2020
 */

public class Main
{
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        obj.add(gamePlay);

    }
}
