import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    //Screen Settings
    final int originalTileSize = 16;//16x16 pixels
    final int scale = 3; //16x3=48

    final int tileSize = originalTileSize * scale; //actual tile size = 48;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int ScreenWidth = tileSize * maxScreenCol; //768 pixels
    final int ScreenHeight = tileSize * maxScreenRow; //576 pixels
    //ratio is 4/3




    public GamePanel() {
        this.setPreferredSize(new Dimension(ScreenWidth, ScreenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); //improves rendering performance
    }
}
