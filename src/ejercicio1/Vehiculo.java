package ejercicio1;

import java.util.Scanner;

enum MarcaDeVehiculo {BMW, MERCEDES, AVENSIS, TOYOTA, SEAT, NISSAN, AUDI, NULL}

public class Vehiculo {
    private String matricula;
    private MarcaDeVehiculo marca;

    //Constructor con con atributos por defecto
    public Vehiculo() {
        this.matricula = "";
        this.marca = MarcaDeVehiculo.NULL;
    }

    //Constructor ordinario para rellenar
    public Vehiculo(String matricula, MarcaDeVehiculo marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    //Constructor copia
    public Vehiculo(Vehiculo vehiculo) {
        this.matricula= vehiculo.matricula;
        this.marca = vehiculo.marca;
    }

    //Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public MarcaDeVehiculo getMarcaString() {
        return marca;
    }

    public MarcaDeVehiculo getMarca() {
        return marca;
    }

    public void setMarca(MarcaDeVehiculo marca) {
        Scanner s = new Scanner(System.in);
        while (this.marca == MarcaDeVehiculo.NULL) {
            marca = s.next()MarcaDeVehiculo;
            switch (marca) {
                case "BMW" -> this.marca = MarcaDeVehiculo.BMW;
                case "Mercedes" -> this.marca = MarcaDeVehiculo.MERCEDES;
                case "Avensis" -> this.marca = MarcaDeVehiculo.AVENSIS;
                case "Toyota" -> this.marca = MarcaDeVehiculo.TOYOTA;
                case "Seat" -> this.marca = MarcaDeVehiculo.SEAT;
                case "Nissan" -> this.marca = MarcaDeVehiculo.NISSAN;
                case "Audi" -> this.marca = MarcaDeVehiculo.AUDI;
                default -> System.out.println("No es correcto, introduzca de nuevo la marca de su coche");
            }
        }
    }

    public void setMarcaString(String marca) {
        Scanner s = new Scanner(System.in);
        while (this.marca == MarcaDeVehiculo.NULL) {
            marca = s.next();
            switch (marca) {
                case "BMW" -> this.marca = MarcaDeVehiculo.BMW;
                case "Mercedes" -> this.marca = MarcaDeVehiculo.MERCEDES;
                case "Avensis" -> this.marca = MarcaDeVehiculo.AVENSIS;
                case "Toyota" -> this.marca = MarcaDeVehiculo.TOYOTA;
                case "Seat" -> this.marca = MarcaDeVehiculo.SEAT;
                case "Nissan" -> this.marca = MarcaDeVehiculo.NISSAN;
                case "Audi" -> this.marca = MarcaDeVehiculo.AUDI;
                default -> System.out.println("No es correcto, introduzca de nuevo la marca de su coche");
            }
        }
    }

    //Método toString propio
    @Override
    public String toString() {
        return "Vehiculo: " + System.lineSeparator() +
                "Matricula: " + matricula + System.lineSeparator() +
                "Marca: " + marca;
    }

    /*Método para crear nuevas personas pidiendo matrícula y marca, verificando la marca mediante un switch y
    almacenando los datos en el objeto vehiculo*/
    public void introducirDatos() {
        Scanner s = new Scanner(System.in);
        String marca;
        System.out.println("Introduzca la matrícula de su coche:");
        this.matricula=s.next();
        System.out.println("Introduzca la marca de su coche:");
        setMarca(marca=s.next());
    }
}

