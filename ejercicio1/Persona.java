package ejercicio1;
public class Persona {
    private String nombre;
    private int edad;
    private char sexo; // 'H' para hombre, 'M' para mujer,
    private double peso;
    private double altura;
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    
}