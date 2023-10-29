import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.WindowListener;
import java.awt.Window;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class APP_GUI extends JFrame implements ActionListener {
        JFrame APP_GUI = new JFrame("BCNrulet");
        JButton bot1 = new JButton("Negro");
        JButton bot2 = new JButton(("Rojo"));
        JButton par = new JButton("Par");
        JButton inpar = new JButton("Inpar");
        JButton labelwin = new JButton("0");
        JPanel pan1 = new JPanel();
        JTextField textField = new JTextField();
        JTextField textField2 = new JTextField();
        JLabel saldo = new JLabel("Saldo");
        JLabel apuesta = new JLabel("Apuesta");
        JMenuBar menu = new JMenuBar();
        JMenu menu1 = new JMenu("Jugador");
        JMenu menu2 = new JMenu("Dinero");
        JLabel info = new JLabel("Información Jugador");
        JLabel info2 = new JLabel("Depositar dinero");
        JLabel but = new JLabel("Nombre");
        JLabel but2 = new JLabel("Surname");
        JTextField textFielddeposito = new JTextField();

        JButton Actualizar = new JButton("Depositar");

        JButton apostar = new JButton("Jugar");
        JButton decoracion = new JButton();
        JButton decoracion1 = new JButton();
        JButton decoracion2 = new JButton();
        JButton decoracion3 = new JButton();
        Jugador jugador;

        int[] negro;
        int[] rojo;
        int[] pararray;
        int[] inpararray;

        int dinero;
        int moneys;
        int ingresar;
        int perdida;
        Random aleatorio = new Random();
        String numeroAle;
        Font fuente = new Font("Helvetica", 1, 70);
        boolean selector;
        boolean winner;
        boolean selectorparoinpar;


    public APP_GUI(Jugador player) {

            //Logica
            negro = new int[]{2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
            rojo = new int[]{1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
            pararray = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
            inpararray = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37};

            jugador = player;
            //textField2.setText(jugador.getMoney().toString);

            //Tipo de layout.
            pan1.setLayout(null);
            APP_GUI.setLayout(null);

            //Button(Negro).
            bot1.setBounds(100, 100, 200, 220);
            bot1.setBackground(new Color(0x2A2A2A));
            bot1.setForeground(Color.white);
            bot1.addActionListener(this);

            //Button(Rojo)
            bot2.setBounds(680, 100, 200, 220);
            bot2.setBackground(new Color(0xDC1B1B));
            bot2.setForeground(Color.white);
            bot2.addActionListener(this);

       /* //Button(Par)
        par.setBounds(100,350,200,120);
        par.setBackground(new Color (0x2E4F25));
        par.setVisible(true);
        par.setForeground(Color .WHITE);
        pan1.add(par);
        par.addActionListener(this);

        //Button(Inpar)
        inpar.setBounds(680,350,200,120);
        inpar.setBackground(new Color (0x2E4F25));
        inpar.setVisible(true);
        inpar.setForeground(Color .WHITE);
        pan1.add(inpar);
        inpar.addActionListener(this);*/

            //JButton(apostar)
            pan1.add(apostar);
            apostar.setBackground(new Color(0x3A5635));
            apostar.setBounds(420, 470, 130, 30);
            apostar.setForeground(new Color(0xFFFFFF));
            apostar.addActionListener(this);

            //Label(WinnerLabel).
            labelwin.setBounds(339, 60, 300, 300);
            labelwin.setBackground(new Color(0x2B6025));
            labelwin.setForeground(new Color(0xFFFFFF));
            labelwin.setVisible(true);
            labelwin.setEnabled(true);
            labelwin.setFont(fuente);
            //labelwin.getText();

            //MenuBar.
            APP_GUI.setJMenuBar(menu);
            menu.add(menu1);
            menu.add(menu2);
            menu1.add(info);
            menu2.add(info2);
            menu1.add(but);
            menu1.add(but2);
            menu2.add(textFielddeposito);

            menu2.add(Actualizar);
            Actualizar.addActionListener(this);
            but.setText(jugador.getName());
            but2.setText(jugador.getSurname());

            //Panel
            pan1.setBackground(new Color(114, 165, 105));
            pan1.setVisible(true);

            //LabelSaldo.
            saldo.setForeground(new Color(0x000000));
            saldo.setBounds(339, 410, 300, 20);
            pan1.add(saldo);


            //LabelApuesta.
            apuesta.setForeground(new Color(0x000000));
            apuesta.setBounds(339, 370, 300, 20);
            pan1.add(apuesta);

            //JTextField Saldo.
            textField.setBounds(339, 430, 300, 20);
            textField.setColumns(10);
            pan1.add(textField);
            textField.setEnabled(false);
            dinero = Integer.parseInt(String.valueOf((jugador.money)));
            moneys = jugador.money;
            textField.setText(String.valueOf(dinero));
            //textField.setText(Float.toString(jugador.getMoney()));
            textField.setBackground(Color.BLACK);

            //JTextField Apuesta.
            textField2.setBounds(339, 390, 300, 20);
            textField2.setColumns(10);
            pan1.add(textField2);

            //Decoracion(Decoracion)
            pan1.add(decoracion);
            pan1.add(decoracion1);
            pan1.add(decoracion2);
            pan1.add(decoracion3);
            decoracion.setBackground(new Color(0x000000));
            decoracion1.setBackground(new Color(0x000000));
            decoracion2.setBackground(new Color(0x000000));
            decoracion3.setBackground(new Color(0x000000));
            decoracion.setBounds(960, 10, 5, 520);
            decoracion1.setBounds(10, 10, 5, 520);
            decoracion2.setBounds(10, 10, 955, 5);
            decoracion3.setBounds(10, 525, 955, 5);
            decoracion.setEnabled(false);
            decoracion1.setEnabled(false);
            decoracion2.setEnabled(false);
            decoracion3.setEnabled(false);

            //APP_GUI(JFrame).
            APP_GUI.setBounds(150, 60, 0, 0);
            //APP_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            APP_GUI.setSize(1000, 600);
            APP_GUI.setVisible(true);
            APP_GUI.setContentPane(pan1);
            APP_GUI.add(bot1);
            APP_GUI.add(bot2);
            APP_GUI.add(labelwin);
            APP_GUI.setContentPane(pan1);
            APP_GUI.setResizable(true);


        //System.out.println(jugador.getName());
        //System.out.println(jugador.getSurname());
        APP_GUI.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evento) {

                writerReader();
                Printtxt(jugador);
            }
        });
        }
        public APP_GUI(){}
        @Override
        public void actionPerformed (ActionEvent e){
            //Boton Negro.
            if (e.getSource() == bot1) {
                selector = true;
            }
            //Boton Rojo
            if (e.getSource() == bot2) {
                selector = false;
            }
            if (e.getSource() == Actualizar) {

                ingresar = Integer.parseInt((textFielddeposito.getText()));
                dinero = dinero + ingresar;
                textField.setText(String.valueOf(dinero));
                textFielddeposito.setText(" ");
                moneys += ingresar;
            }
            //Boton Par.
            if (e.getSource() == par) {
                selectorparoinpar = true;

            }
            //Boton Inpar.
            if (e.getSource() == inpar) {
                selectorparoinpar = false;
            }
            //Boton Jugar.
            if (e.getSource() == apostar) {
                if (dinero > 0) {

                    int numrandom = aleatorio.nextInt(0, 38);
                    numeroAle = String.valueOf(numrandom);

                /*if (selectorparoinpar == true) {
                    for (int i = 0; i < pararray.length; i++) {
                        if (numrandom == pararray[i]) {

                        }
                    }
                } else if (selectorparoinpar == false) {
                    for (int i = 0; i < inpararray.length; i++) {
                        if (numrandom == inpararray[i]) {
                            //if()
                            {

                            }
                        }
                    }
                }*/

                    //Comparación del color con el valor random + cambio del color.

                    perdida = Integer.parseInt(textField2.getText());
                    if (dinero >= perdida) {
                        for (int i = 0; i < negro.length; i++) {
                            if (numrandom == negro[i]) {
                                labelwin.setText(numeroAle);
                                labelwin.setForeground(new Color(0x000000));
                                winner = true;
                                if (winner == true && selector == true) {
                                    Mensaje mensaje = new Mensaje();
                                    dinero = dinero + perdida;
                                    textField.setText(String.valueOf(dinero));
                                } else {
                                    MensajePerder mensajePerder = new MensajePerder();
                                    dinero = dinero - perdida;
                                    textField.setText(String.valueOf(dinero));
                                }
                            } else {
                                if (numrandom == rojo[i]) {
                                    labelwin.setText(numeroAle);
                                    labelwin.setForeground(new Color(0xFF0000));
                                    winner = false;
                                    if (winner == false && selector == false) {
                                        Mensaje mensaje = new Mensaje();

                                        dinero = dinero + perdida;
                                        textField.setText(String.valueOf(dinero));

                                    } else {
                                        MensajePerder mensajePerder = new MensajePerder();
                                        dinero = dinero - perdida;
                                        textField.setText(String.valueOf(dinero));
                                    }

                                }
                            }
                        }
                    } else {
                        MensajeNoDinero nomoney = new MensajeNoDinero();
                    }
                } else {
                    MensajeNoDinero nomoney = new MensajeNoDinero();
                }

            }

        }
    public void Printtxt(Jugador player)
    {
        PrintTXT print = new PrintTXT(jugador);

    }
    public void writerReader(){
            try{


                LocalDate horario = LocalDate.now();
                ArrayList<String> infor = new ArrayList<>();
                infor.add(jugador.getName());
                infor.add(jugador.getSurname());
                infor.add(dinero+"€");

                System.out.println(dinero);
                System.out.println(moneys);
                float porcentaje = (float)dinero/(float)moneys;
                float prueba = porcentaje * 100;
                float prueba2 = prueba - 100;
                System.out.println(prueba2);
                infor.add(prueba2+"%");


                String information = String.valueOf(infor);
                File file = new File("DataBase.txt");
                if(!file.exists())
                {
                    file.createNewFile();
                }
                FileWriter Escritor = new FileWriter(file, true );
                boolean Write = file.canWrite();
                BufferedWriter Texto = new BufferedWriter(Escritor);
                Texto.write("\n" + horario +" "+ information);
                Texto.close();

                }catch (IOException e){
                MensajeErrorTXT txterror = new MensajeErrorTXT();
                }
            }

        /*public void PrintConsole()
        {

                APP_GUI gui = new APP_GUI();
                Scanner reader = new Scanner(writerReader());

            }catch (FileNotFoundException e) {


        }*/
}
