import javax.swing.*;

public class main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setResizable(false);
        window.setTitle("Java Adventure Game");
        window.setVisible(true);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();//this is used to set the window size i.e. game panel

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
