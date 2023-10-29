import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class PrintTXT extends JFrame
{
    JFrame mensaje = new JFrame("Error");
    JPanel fondo = new JPanel();
    JLabel print = new JLabel("Aqui tienes");
    JLabel print1 = new JLabel("Aqui tienes");
    JLabel print2 = new JLabel("este es tu ultimo registro");
    JLabel print3= new JLabel("este es tu ultimo registro");
    Jugador jugador = new Jugador();
    APP_GUI gui = new APP_GUI();
    Font fuente = new Font("Calibri",1,40);
    Font fuente2 = new Font("Calibri",1,30);
    Font fuente3 = new Font("Calibri",1,30);
    Font fuente4 = new Font("Calibri",1,20);
    public PrintTXT(Jugador player){

        //Jframe(pantalla)
        setBounds(300,200,0,0);
        setLayout(null);
        setContentPane(fondo);
        setSize(700, 250);
        setVisible(true);

        //JPanel(fondo)
        fondo.setLayout(null);
        fondo.setBackground(new Color (0x6F9F58));
        fondo.setVisible(true);

        //JLabel(mensaje print)
        fondo.add(print);
        print.setBounds(130,25,190,70);
        print.setVisible(true);
        print.setFont(fuente);
        print.setForeground(new Color(0xFFFFFF));

        //JLabel(mensaje print1)
        fondo.add(print1);
        print1.setBounds(132,28,190,70);
        print1.setVisible(true);
        print1.setFont(fuente);
        print1.setForeground(new Color(0x000000));

        //JLabel(mensaje print2)
        fondo.add(print2);
        print2.setBounds(140,70,800,70);
        print2.setVisible(true);
        print2.setFont(fuente);
        print2.setForeground(new Color(0xFFFFFF));

        //JLabel(mensaje print3)
        fondo.add(print3);
        print3.setBounds(143,73,800,70);
        print3.setVisible(true);
        print3.setFont(fuente);
        print3.setForeground(new Color(0x000000));

        this.jugador=player;
        PrintJugador();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evento) {
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
        });

    }
    public void PrintJugador()
    {

        APP_GUI logica = new APP_GUI();
        JLabel nombre = new JLabel();
        JLabel nombre2 = new JLabel();
        JLabel apellido = new JLabel();
        JLabel apellido2 = new JLabel();
        JLabel porcentajes = new JLabel();
        JLabel porcentajes2 = new JLabel();

        //Label nombre
        fondo.add(nombre);
        nombre.setBounds(325,41,150,40);
        nombre.setVisible(true);
        nombre.setFont(fuente);
        nombre.setBackground(new Color(0x6F9F58));
        nombre.setForeground(new Color(0x5353B2));
        nombre.setText(jugador.getName());


        //Label nombresombra
        fondo.add(nombre2);
        nombre2.setBounds(327,43,150,40);
        nombre2.setVisible(true);
        nombre2.setFont(fuente);
        nombre2.setBackground(new Color(0x6F9F58));
        nombre2.setForeground(new Color(0x383875));
        nombre2.setText(jugador.getName());

        //Label apellidonombre2
        fondo.add(apellido);
        apellido.setBounds(437,41,150,40);
        apellido.setVisible(true);
        apellido.setFont(fuente);
        apellido.setBackground(new Color(0x6F9F58));
        apellido.setForeground(new Color(0x5353B2));
        apellido.setText(jugador.getSurname());


        //Label apellidosombra2
        fondo.add(apellido2);
        apellido2.setBounds(439,43,150,40);
        apellido2.setVisible(true);
        apellido2.setFont(fuente);
        apellido2.setBackground(new Color(0x6F9F58));
        apellido2.setForeground(new Color(0x383875));
        apellido2.setText(jugador.getSurname());



        //porcentajes.setText(String.valueOf(gui.writerReader(porcentaje);))
        File file = new File("Database.txt");
        try {
            List<String> linias = Files.readAllLines(file.toPath());
            if(linias.size()>0)
            {
                for (int i = 0; i < linias.size(); i++)
                {
                    //Label porcentajes
                    fondo.add(porcentajes);
                    porcentajes.setBounds(110,100,600,100);
                    porcentajes.setVisible(true);
                    porcentajes.setFont(fuente3);
                    porcentajes.setBackground(new Color(0x6F9F58));
                    porcentajes.setForeground(new Color(0x5353B2));
                    porcentajes.setText(porcentajes.getText()+linias.get(i)+"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //porcentajes2.setText(String.valueOf(gui.porcentaje));
        try {
            List<String> linias = Files.readAllLines(file.toPath());
            if(linias.size()>0)
            {
                for (int i = 0; i < linias.size(); i++)
                {
                    //Label porcentajes2
                    fondo.add(porcentajes2);
                    porcentajes2.setBounds(112,100,600,600);
                    porcentajes2.setVisible(true);
                    porcentajes2.setFont(fuente4);
                    porcentajes2.setBackground(new Color(0x6F9F58));
                    porcentajes2.setForeground(new Color(0x383875));
                    porcentajes.setText(String.valueOf(gui.dinero));
                    porcentajes.setText(porcentajes.getText()+linias.get(i)+"\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

