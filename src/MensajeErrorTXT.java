import javax.swing.*;
import java.awt.*;

public class MensajeErrorTXT extends JFrame
{
    JFrame mensaje = new JFrame("Error");
    JPanel fondo = new JPanel();
    JLabel error = new JLabel("Error TXT");
    JLabel error1 = new JLabel("Error TXT");
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    public MensajeErrorTXT(){

        //Jframe(pantalla)
        setBounds(485,250,0,0);
        setLayout(null);
        setContentPane(fondo);
        setSize(300, 180);
        setVisible(true);

        //JPanel(fondo)
        fondo.setLayout(null);
        fondo.setBackground(new Color (0x6F9F58));
        fondo.setVisible(true);

        //JLabel(ganar)
        fondo.add(error);
        error.setBounds(65,35,300,70);
        error.setVisible(true);
        error.setFont(fuente);
        error.setForeground(new Color(0xFF0000));

        //JLabel(ganar1)
        fondo.add(error1);
        error1.setBounds(67,38,300,70);
        error1.setVisible(true);
        error1.setFont(fuente);
        error1.setForeground(new Color(0x000000));




    }
}

