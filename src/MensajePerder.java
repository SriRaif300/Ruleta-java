import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;


public class MensajePerder extends JFrame
{
    JFrame mensaje = new JFrame("Has Perdido");
    JPanel fondo = new JPanel();
    JLabel perder = new JLabel("Has Perdido");
    JLabel perder1 = new JLabel("Has Perdido");
    JLabel descdinero = new JLabel("-"+"0");
    JLabel descdinero1 = new JLabel("-"+"0");
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    int diners;
    int descuento;
    public MensajePerder(){

        //Jframe(pantalla)
        setBounds(485,250,0,0);
        setLayout(null);
        setContentPane(fondo);
        setSize(400, 180);
        setVisible(true);

        //JPanel(fondo)
        fondo.setLayout(null);
        fondo.setBackground(new Color (0x6F9F58));
        fondo.setVisible(true);

        //JLabel(ganar)
        fondo.add(perder);
        perder.setBounds(95,5,300,70);
        perder.setVisible(true);
        perder.setFont(fuente);
        perder.setForeground(new Color(0xFF0000));

        //JLabel(ganar1)
        fondo.add(perder1);
        perder1.setBounds(98,8,300,70);
        perder1.setVisible(true);
        perder1.setFont(fuente);
        perder1.setForeground(new Color(0x000000));



    }
}

