private void ejecuta() {
    int tipo;
    do {
        menu();
        tipo = pideOpcion();
        filtraOpcion(tipo);
    } while(true);
}

private void menu() {
    System.out.println("0.- Contador ascendente.");
    System.out.println("1.- Contador descendente.");
}
private void filtraOpcion(int tipo) {
    Contador contador = fabrica.getContadorAscendente();
    switch(tipo) {
        case 0:
            break;
        case 1:
            contador = fabrica.getContadorDescendente();
            break;
    }
    System.out.println(contador.cuenta());
