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
        System.out.println(comprobarSexo(sexo));
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        System.out.println(comprobarSexo(sexo));
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calcularIMC(){
        double imc = peso/ (altura*altura);
        if(imc < 18.5){
            return -1; // bajo peso
        }
        else if(imc > 25){
            return 1; // sobrepeso
        }
        else{
            return 0; // peso ideal
        }
    }
    public boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;        
        }
        else{
            return false;
        }
    }
    private String comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            return "Sexo correcto";
        }
        else{
            return "Sexo incorrecto, se asigna H por defecto";
        }
    }
    public String toString(){
        return "Nombre: " + nombre + " Edad: " + edad + " Sexo: " + sexo + " Peso: " + peso + " Altura: " + altura;
    }


    
}