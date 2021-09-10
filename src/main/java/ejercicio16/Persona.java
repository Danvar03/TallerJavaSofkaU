package ejercicio16;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String dni = generaDNI();
    private String sexo = "";
    private int peso = 0;
    private int altura = 0;

    public Persona() {
        super();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public String getDni() {
        return generaDNI();
    }

    public String getGenero() {
        return sexo;
    }

    public void setGenero(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String calcularIMC() {
        double indicador = (this.peso / Math.pow(this.altura * 0.01, 2));
        return estadoIMC(indicador);
    }

    private String estadoIMC(double indicador) {
        final String SOBREPESO = "Esta por encima de su peso ideal";
        final String PESO_IDEAL = "Esta en su peso ideal";
        final String INFRAPESO = "Esta por debajo de su peso ideal";
        String imc = (indicador >= 20 && indicador <= 25) ? PESO_IDEAL : (indicador > 25 ? SOBREPESO : INFRAPESO);
        return imc;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18 ? true : false;
    }

    public String comprobarSexo() {
        switch (this.sexo.toLowerCase()) {
            case "h":
                return "H";
            case "m":
                return "M";
            default:
                return "H";
        }
    }

    public String generaDNI() {
        long dni = (long) Math.floor(Math.random() * (99999999 - 10000000 + 1) + 10000000);
        char letra = calcularLetra(dni);
        return (letra + String.valueOf(dni));
    }

    private char calcularLetra(long dni) {
        int indicador = (int) (dni % 23);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[indicador];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}