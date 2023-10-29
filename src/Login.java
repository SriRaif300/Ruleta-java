import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JFrame pantalla = new JFrame("Login");
    JPanel fondo = new JPanel();
    JTextField username = new JTextField();
    JTextField initSaldo = new JTextField();
    JLabel textusername = new JLabel("Username");
    JLabel textinitSaldo = new JLabel("Deposito Inicial");
    JButton login = new JButton("Login");
    JTextField surname = new JTextField();
    JLabel sur = new JLabel("Surname");

    public Login(){

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

        //JTextField(username)
        fondo.add(username);
        username.setVisible(true);
        username.setBounds(140,10,200,20);
        username.setColumns(10);

        //JTextField(initSaldo)
        fondo.add(initSaldo);
        initSaldo.setVisible(true);
        initSaldo.setBounds(140,70,200,20);
        initSaldo.setColumns(10);

        //JLabel(textusername)
        fondo.add(textusername);
        textusername.setBounds(70,-30,100,100);
        textusername.setVisible(true);

        //JLabel(textinitSaldo)
        fondo.add(textinitSaldo);
        textinitSaldo.setBounds(44,30,100,100);
        textinitSaldo.setVisible(true);

        //JButton(Login)
        fondo.add(login);
        login.setBounds(140,100,100,30);
        login.setForeground(new Color(0xFFFFFF));
        login.setBackground(new Color(0x2F4F38));
        login.addActionListener(this);

        //JTextfield(surname)
        fondo.add(surname);
        surname.setColumns(10);
        surname.setBounds(140,40,200,20);

        //JLabel(sur)
        fondo.add(sur);
        sur.setBounds(79,-1,100,100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==login){
            try{Jugador player = new Jugador(username.getText(), surname.getText(), Integer.parseInt(initSaldo.getText()));
            APP_GUI app = new APP_GUI(player);
            dispose();}catch (Exception exception){MensajeError error = new MensajeError();}
            }
    }
}

