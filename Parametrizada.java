public interface FabricaParametrizada {
    Contador getContador(TipoContador tipo);
}


public enum TipoContador {
    ASCENDENTE("Contador ascendente"),
    DESCENDENTE("Contador descendente");
    private String descripcion;
    private TipoContador(String descripcion) {
        this.descripcion = descripcion;
    }
    public static String opciones() {
        StringBuilder sb = new StringBuilder();
        for(TipoContador tipo: values())
            sb.append(tipo.ordinal() + ".- " + tipo.descripcion + "\n");
        return sb.toString();
    }
    public static TipoContador enteroATipo(int posicion) {
        return values()[posicion];
    }
}


public class FabricaCastellanoParametrizada
       implements FabricaParametrizada {
    public Contador getContador(TipoContador tipo) {
        Contador contador = new ContadorAscendente();
        switch (tipo) {
            case DESCENDENTE:
                contador = new ContadorDescendente();
                break;
        }
        return contador;
    }
}
