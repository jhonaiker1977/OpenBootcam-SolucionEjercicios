public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre="Jose";
        cliente.edad=46;
        cliente.credito="Aprobado";
        cliente.telefono=65646546;

        Trabajador trabajador = new Trabajador();
        trabajador.edad=50;
        trabajador.nombre="Carlos";
        trabajador.telefono=898985;
        trabajador.salario=50000;

        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.credito);
        System.out.println(cliente.telefono);

        System.out.println("\n");

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }

}