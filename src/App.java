package src;

// khi nào xong thì hẳn xóa comment, do save lại thì vscode lại cho mất
import javax.swing.JFrame;

public class App {

    public static void main(String[] args) throws Exception {
        int rowCount = 21;                                  // tổng số dòng
        int columnCount = 19;                               // tổng số cột
        int tileSize = 32;                                  // kích cỡ của 1 ô
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("DSA - IU - PacMan"); // hiện tên lên khung hình
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
