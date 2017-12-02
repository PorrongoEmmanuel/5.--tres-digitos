import java.util.Scanner;
public class entero {

    public void invertir(){
        int numero, centena, decena, unidad;

        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un numero. de 3 digitos: ");
        numero = in.nextInt();

        centena = numero / 100;
        decena = (numero % 100) / 10;
        unidad = (numero % 100) % 10;

        System.out.printf("%d%d%d\n", unidad, decena,centena);
    }
}
