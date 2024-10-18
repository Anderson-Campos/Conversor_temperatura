import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);

        System.out.println("Temperatura em Celcius: ");
        double celc = temperatura.nextDouble();

        double calculo = (celc * 9 / 5) + 32 ;

        System.out.println("A temperatura em Celcius " + celc + ", em Fahrenheit: " + calculo);

        temperatura.close();
    }
}