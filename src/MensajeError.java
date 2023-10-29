import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class MensajeError extends JFrame
{
    JFrame mensaje = new JFrame("Error");
    JPanel fondo = new JPanel();
    JLabel error = new JLabel("Hay un Error");
    JLabel error1 = new JLabel("Hay un Error");
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    public MensajeError(){

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
        error.setBounds(40,35,300,70);
        error.setVisible(true);
        error.setFont(fuente);
        error.setForeground(new Color(0xFF0000));

        //JLabel(ganar1)
        fondo.add(error1);
        error1.setBounds(43,38,300,70);
        error1.setVisible(true);
        error1.setFont(fuente);
        error1.setForeground(new Color(0x000000));




    }
}

