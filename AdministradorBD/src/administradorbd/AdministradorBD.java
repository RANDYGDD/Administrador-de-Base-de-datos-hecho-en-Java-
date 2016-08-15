
package administradorbd;

import static java.awt.Frame.MAXIMIZED_BOTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class AdministradorBD 
{
    public static void main(String[] args) 
    {
        IDE ap = new IDE();
        ap.setVisible(true);
        ap.setTitle("Administrador BD Shinobis");
        //ap.setExtendedState(MAXIMIZED_BOTH);
        ap.setLocationRelativeTo(null);
        ap.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
}
