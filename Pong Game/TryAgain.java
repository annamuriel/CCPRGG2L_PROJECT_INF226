import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {
    TryAgain() {
        super("Pong Game");
        this.setLayout(new FlowLayout());

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("TRY AGAIN");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 30));
     
        // TryAgainEventHandler tryHandler = new TryAgainEventHandler();
        // tryAgainButton.addActionListener(tryHandler);

        JButton exitButton = new JButton();
        exitButton.setText("EXIT");
        exitButton.setFont(new Font("Arial", Font.BOLD, 30));
      
        // ExitEventHandler exitHandler = new ExitEventHandler();
        // exitButton.addActionListener(exitHandler);

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Pong Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //this.setContentPane(new JLabel(new ImageIcon("BG.jpg")));
        this.setResizable(false);
    }

    // private class TryAgainEventHandler implements ActionListener {

    //     public void actionPerformed(ActionEvent event) {
    //         PongGame.main(null);
    //         dispose();
    //     }
    // }

    // private class ExitEventHandler implements ActionListener {

    //     public void actionPerformed(ActionEvent event) {
    //         dispose();
    //     }
    // }
}