import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.awt.Font;
import java.util.concurrent.TimeUnit;


public class Mensaje extends JFrame
{
    JFrame mensaje = new JFrame("Has ganado");
    JPanel fondo = new JPanel();
    JLabel ganar = new JLabel("Has Ganado");
    JLabel ganar1 = new JLabel("Has Ganado");
    JLabel dinero = new JLabel("0");
    JLabel dinero1 = new JLabel("0");
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    public Mensaje(){

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
        fondo.add(ganar);
        ganar.setBounds(95,5,300,70);
        ganar.setVisible(true);
        ganar.setFont(fuente);
        ganar.setForeground(new Color(0xFFFFFF));

        //JLabel(ganar1)
        fondo.add(ganar1);
        ganar1.setBounds(98,8,300,70);
        ganar1.setVisible(true);
        ganar1.setFont(fuente);
        ganar1.setForeground(new Color(0x000000));





    }
}

