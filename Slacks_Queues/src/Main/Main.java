package Main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List pila = new List();
        List cola = new List();

        int opcion = 0, dato = 0;

        while(opcion != 7)
        {
            System.out.println("""
                               Ingresar la opcion:
                               ========= Pilas ==========
                               1) Agregar dato
                               2) Borrar dato
                               3) Mostrar pila
                               ========= Colas ==========
                               4) Agregar cola
                               5) Borrar cola
                               6) Mostrar Cola
                               ========= salir ==========
                               7) Salir
                               """);
            opcion = scan.nextInt();

            switch(opcion)
            {
                case 1:
                    System.out.println("Ingresa el dato: ");
                    dato = scan.nextInt();

                    pila.push(dato);
                    break;

                case 2:
                    pila.pop("stack");
                    break;

                case 3:
                    pila.display_data("pila");
                    break;

                case 4:
                    System.out.println("Ingresa el dato: ");
                    dato = scan.nextInt();

                    cola.push(dato);
                    break;

                case 5:
                    cola.pop("queue");
                    break;

                case 6:
                    cola.display_data("cola");
                    break;
            }
        }
    }
}
