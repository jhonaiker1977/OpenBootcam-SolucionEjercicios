public class Main {
    public static void main(String[] args) {

        // Condicional if

        int numeroif = 3;

        if (numeroif >= 0){
            System.out.println("Es Positivo");
        }else if (numeroif <= 0){
            System.out.println("Es Negativo");

        }

        // Condicional while

        int numeroWhile = 1;

        while (numeroWhile <= 8){
            System.out.println(numeroWhile);
            numeroWhile+= 1;
        }

        // Condicional Do While

        int i = 1;

        do {
            System.out.println(i);
            i+=1;
        }while (i>=8);

        // Condicional For

        int numeroFor= 0;
        for(int NumeroFor=0 ; numeroFor<=3 ; numeroFor++){
            System.out.println(numeroFor);
        }

        // Condicional Switch

        var estacion = "Invierno";

        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("Ninguna de las anteriores");


        }

    }
}