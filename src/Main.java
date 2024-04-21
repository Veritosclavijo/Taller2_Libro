import Models.Libro;

import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String titulo1 = "";
        String autor1 = "";
        int annioPublicacion1 = 0;
        double precio1 = 0;


        //instanciacion de la clase libro

        Libro libro1 = new Libro();
        System.out.println("Ingrese el título del libro");
        titulo1 = keyboard.nextLine();
        libro1.setTitulo(titulo1);

        System.out.println("Ingrese el autor del libro");
        autor1=keyboard.nextLine();
        libro1.setAutor(autor1);

        System.out.println("Ingrese el año de publicación del libro");
        annioPublicacion1=keyboard.nextInt();
        libro1.setAnioPublicacion(annioPublicacion1);

        System.out.println("Ingrese el precio del libro");
        precio1=keyboard.nextDouble();
        libro1.setPrecio(precio1);

        System.out.println(libro1.toString());


    }
}