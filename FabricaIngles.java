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


Fabrica fabrica = new FabricaIngles();
Contador contador = fabrica.getContadorAscendente();
System.out.println(contador.cuenta());
contador = fabrica.getContadorDescendente();
System.out.println(contador.cuenta());
