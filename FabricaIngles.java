public class FabricaIngles implements Fabrica {
    public FabricaIngles() {
        super();
    }
    @Override
    public Contador getContadorAscendente() {
        return new ContadorAscendenteIngles();
    }
    @Override
    public Contador getContadorDescendente() {
        return new ContadorDescendenteIngles();
    }
}
