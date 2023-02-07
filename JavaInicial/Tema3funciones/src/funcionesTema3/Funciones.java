package funcionesTema3;

public class Funciones {

    public static double calcularIVA(double pc){
        double IVA;
        IVA = pc * 0.16;
        return IVA;
    }
    public static void main(String[] args){

        double precio;
        double IVA;
        precio = 10.20;

        IVA = calcularIVA(precio);

        System.out.println("El Precio con IVA incluido es: "+(precio + IVA));

    }
}


