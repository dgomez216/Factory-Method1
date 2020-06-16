Fabrica fabrica = new FabricaCastellano();
Contador contador = fabrica.getContadorAscendente();
System.out.println(contador.cuenta());
contador = fabrica.getContadorDescendente();
System.out.println(contador.cuenta());
