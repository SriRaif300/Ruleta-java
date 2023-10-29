import java.util.Scanner;

public class Jugador {
    private String name;
    private String surname;
    int money;
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Jugador(String nombre, String apellido, int dinero){
        name = nombre;
        surname = apellido;
        money = dinero;

    }
    public Jugador() {

    }

}


