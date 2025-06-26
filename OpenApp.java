import javax.swing.*;
import java.io.IOException;

public class OpenApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("External App Launcher");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        try {
            Process p = new ProcessBuilder("").start(); //path of the .exe file
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}