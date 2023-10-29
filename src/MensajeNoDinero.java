import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.*;
import java.awt.Font;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
public class MensajeNoDinero extends JFrame implements ActionListener
{
    JFrame mensaje = new JFrame("No tines dinero");
    JPanel fondo = new JPanel();
    JLabel denegar = new JLabel("No tienes dinero");
    JLabel denegar1 = new JLabel("No tienes dinero");
    JLabel pregunta = new JLabel("Quieres seguir jugando?");
    JLabel pregunta1 = new JLabel("Quieres seguir jugando?");
    JButton Si = new JButton("Si");
    JButton No = new JButton("No");
    Font fuente = new Font("Calibri",1,60);
    Font fuente2 = new Font("Calibri",1,40);
    Font fuente3 = new Font("Calibri", 1,20);
    public MensajeNoDinero(){



        //Jframe(pantalla)
        setBounds(485,250,0,0);
        setLayout(null);
        setContentPane(fondo);
        setSize(800, 380);
        setVisible(true);

        //JPanel(fondo)
        fondo.setLayout(null);
        fondo.setBackground(new Color (0x6F9F58));
        fondo.setVisible(true);

        //JLabel(denegar)
        fondo.add(denegar);
        denegar.setBounds(175,11,800,70);
        denegar.setVisible(true);
        denegar.setFont(fuente);
        denegar.setForeground(new Color(0xFFFFFF));

        //JLabel(denegar1)
        fondo.add(denegar1);
        denegar1.setBounds(178,14,800,70);
        denegar1.setVisible(true);
        denegar1.setFont(fuente);
        denegar1.setForeground(new Color(0x000000));

        //JLabel(pregunta)
        fondo.add(pregunta);
        pregunta.setBounds(185,80,600,100);
        pregunta.setVisible(true);
        pregunta.setFont(fuente2);
        pregunta.setForeground(new Color(0xE1E1E1));

        //JLabel(dinero1)
        fondo.add(pregunta1);
        pregunta1.setBounds(188,83,600,100);
        pregunta1.setVisible(true);
        pregunta1.setFont(fuente2);
        pregunta1.setForeground(new Color(0x000000));

        //JButton(Si)
        fondo.add(Si);
        Si.setBounds(220,200,150,40);
        Si.setForeground(new Color(0xFFFFFF));
        Si.setBackground(new Color(0x2F4F38));
        Si.addActionListener((ActionListener) this);
        Si.setFont(fuente3);

        //JButton(No)
        fondo.add(No);
        No.setBounds(405,200,150,40);
        No.setForeground(new Color(0xFFFFFF));
        No.setBackground(new Color(0x2F4F38));
        No.addActionListener(this);
        No.setFont(fuente3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==No) {

            Despedida despedida = new Despedida();
            despedida.setVisible(true);
            WindowListener listener = new WindowAdapter() {
                public void windowOpened(WindowEvent evt) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    System.exit(0);
                }
            };
            despedida.addWindowListener(listener);

        }
        if(e.getSource()==Si) {
            dispose();

        }
    }

}

