public class FabricaCastellano implements Fabrica {
    public FabricaCastellano() {
        super();
    }
    @Override
    public Contador getContadorAscendente() {
        return new ContadorAscendente();
    }
    @Override
    public Contador getContadorDescendente() {
        return new ContadorDescendente();
    }
}
