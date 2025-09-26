import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Giao diện đẹp hơn (Nimbus Look and Feel)
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new Login_Frame();
        //new Home_Frame();
    }
}
