package ejercicio17;


public class Televisor extends Electrodomestico{
    private static int RESOLUCION_DEFAULT = 20;
    private static boolean SINTONIZADOR_DEFAULT = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor(int precioBase, String color, char consumo, int peso, int resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int precio, int peso){
        super(precio, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    public Televisor(){
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.sintonizadorTDT = SINTONIZADOR_DEFAULT;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public boolean getSintonizadorTDT(){
        return this.sintonizadorTDT;
    }

    private int precioSintetizador(){

        int precio = 0;

        if(getSintonizadorTDT()){
            precio = 50;
        }

        return precio;
    }

    @Override
    public int precioFinal() {

        int precio = super.precioFinal() + precioSintetizador();

        if(getResolucion() > 40){
            precio *= 0.3;
        }

        return precio;
    }
}
