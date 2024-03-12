import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int eleccion;
        int valor1;
        int valor2;
        int bace;
        int altura;
        int suma;
        int multiplicacion;
        String nombre;
        int edad;
        int valorAgregado;
        int area;


        System.out.println("por favor escoja una de 4 opciones");
        System.out.println("opcion 1 para cadturar dos volores, sumarlos y multiplicarlos");
        System.out.println("opcion 2 determinar si es mayor de edad y darle un cobro");
        System.out.println("opcion 3 para hallar el area de un triangulo");
        System.out.println("opcion 4 para instruir para que dijite las demas opciones ");
        eleccion = entrada.nextInt();


        switch (eleccion) {

            case 1:
                System.out.println("por favor dijite dos valores");
                valor1 = entrada.nextInt();
                valor2 = entrada.nextInt();

                suma = valor1 + valor2;
                multiplicacion = valor1 * valor2;

                System.out.println("el resultado de la suma es: " + suma);
                System.out.println("el resultado de la multiplicacion es: " + multiplicacion);

                break;

            case 2:
            System.out.println("por favor dijite su nombre y su edad");
            nombre = entrada.next();
            edad = entrada.nextInt();

            if (edad >= 18){
                System.out.println("usted es mayor de edad");
                System.out.println(nombre + " ya que es mayor de edad se le hara un cobro de 10mil * su edad");

                valorAgregado= edad*10000;

                System.out.println("su valor agregado es de: " + valorAgregado);

            }
            else {
                System.out.println(nombre + " usted es menor de edad no genera cobro");
            }
            break;

            case 3:
                System.out.println("por favor dijite la base y la altura de un triangulo");
                bace = entrada.nextInt();
                altura = entrada.nextInt();

                area= (bace*altura)/2;

                System.out.println("el area de el triangulo es: " + area);

                break;

            case 4:

                System.out.println("por favor escoja una de las anteriores opciones 1,2,3");

                break;

            default:
                System.out.println("la opcion o los datos que ingresaste no son validos por favor verifique");

        }
    }
}