public class Main {
    public static void main(String[] args){
        suma(100, 20, 30);
        Coche miCoche = new Coche();
        miCoche.PonerPuertas();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a,int b,int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    public static class Coche{
        static int puertas = 4;
        public void PonerPuertas(){
            this.puertas++;
        }
    }

}








