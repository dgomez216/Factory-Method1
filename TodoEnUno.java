public enum FabricaEnumeracion {
    ASCENDETE("Contador ascendente", new Ascendente()),
    SALIR("Salir", new Salir());

    private String descripcion;
    private Contador contador;

    private FabricaEnumeracion(String descripcion, Contador contador) {
        this.descripcion = descripcion;
        this.contador = contador;
    }

    public Contador getContador() {
        return contador;
    }
    .....
}

public class Salir implements Contador {
    @Override
    public String cuenta() {
        return "Adios.";
    }
}

//El Bucle 

FabricaEnumeracion opcion;
do {
    menu();
    opcion = pideOpcion();
    filtraOpcion(opcion);
} while(opcion != FabricaEnumeracion.SALIR);

private void filtraOpcion(FabricaEnumeracion tipo) {
    System.out.println(tipo.getContador().cuenta());
}
