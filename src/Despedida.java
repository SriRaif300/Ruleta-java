import javax.swing.*;
import java.awt.*;


public class Despedida extends JFrame
{
    JFrame mensaje = new JFrame("Has ganado");
    JPanel fondo = new JPanel();
    JLabel despedida = new JLabel("Vuelva pronto");
    JLabel despedida1 = new JLabel("Vuelva pronto");
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    public Despedida(){

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

        //JLabel(despedida)
        fondo.add(despedida);
        despedida.setBounds(70,35,300,70);
        despedida.setVisible(true);
        despedida.setFont(fuente);
        despedida.setForeground(new Color(0xFFFFFF));

        //JLabel(despedida1)
        fondo.add(despedida1);
        despedida1.setBounds(73,38,300,70);
        //despedida1.setVisible(true);
        despedida1.setFont(fuente);
        despedida1.setForeground(new Color(0x000000));





    }

}

