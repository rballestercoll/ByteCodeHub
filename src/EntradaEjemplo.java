import java.util.Scanner;

public class EntradaEjemplo {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);

        System.out.println("Tienes un Nombre Normal?  ");
        var respuesta = enterName.nextBoolean();

        if (respuesta){
            System.out.println("Interesante, no eres un robot");
        } else {
            System.out.println("Vaya Caca... Eres un Robot");
        }

        //System.out.println("Hola,  " + nombre + "  eres un Perro flauta!");

        enterName.close();
    }
}
