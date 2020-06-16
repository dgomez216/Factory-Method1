private void menu() {
        System.out.println(TipoContador.opciones());
    }
    private void filtraOpcion(TipoContador tipo) {
        Contador contador = fabrica.getContador(tipo);
        System.out.println(contador.cuenta());
    }
    private void ejecuta() {
        TipoContador tipo;
        do {
            menu();
            tipo = pideOpcion();
            filtraOpcion(tipo);
        } while(true);
    }
