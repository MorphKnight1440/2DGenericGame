import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    //Screen Settings
    final int originalTileSize = 16;//16x16 pixels
    final int scale = 3; //16x3=48

    final int tileSize = originalTileSize * scale; //actual tile size = 48;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int ScreenWidth = tileSize * maxScreenCol; //768 pixels
    final int ScreenHeight = tileSize * maxScreenRow; //576 pixels
    //ratio is 4/3

    Thread gameThread; //


    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); //improves rendering performance
    }

    public void startGameThread(){
        gameThread = new Thread(this); //this here means the GamePanel class
        gameThread.start();
    }

    @Override
    public void run() {
        //creating the game loop
        while(gameThread != null){

            // System.out.println("The game loop is running");
            // update character position
            update();
            //draw the screen with the updated information
            repaint();//to call the paint component
        }
    }
    public void update(){

    }
    public void paintComponent(Graphics g) { //paint component is a part of jpanel, graphics is a class

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(100, 100, tileSize, tileSize);
        g2d.dispose();//good practice to save memory
    }
}
