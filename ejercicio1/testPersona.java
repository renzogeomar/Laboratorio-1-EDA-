package ejercicio1;
import java.util.Scanner;
public class testPersona {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Persona persona1 = new Persona("Juan", 25, 'H', 70.0, 1.75);
        Persona persona2 = new Persona("Maria", 30, 'M', 60.0, 1.65);
        Persona persona3 = new Persona("Pedro", 16, 'H', 80.0, 1.80);
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = scan.nextInt();
        System.out.println("Ingrese el sexo de la persona (H/M): ");
        char sexo = scan.next().charAt(0);
        System.out.println("Ingrese el peso de la persona: ");
        double peso = scan.nextDouble();
        System.out.println("Ingrese la altura de la persona: ");
        double altura = scan.nextDouble();
        Persona persona4 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println(persona4);
        //Calcular el IMC de la persona4
        if(persona4.calcularIMC() == 1) {
            System.out.println(persona4.getNombre() + " tiene un peso ideal.");
        } else if (persona4.calcularIMC() == -1) {
            System.out.println(persona4.getNombre() + " tiene sobrepeso.");
        } else {
            System.out.println(persona4.getNombre() + " tiene bajo peso.");
        }
        //Comprobar si la persona4 es mayor de edad
        if(persona4.esMayorDeEdad()) {
            System.out.println(persona4.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona4.getNombre() + " es menor de edad.");
        }

    }
}
