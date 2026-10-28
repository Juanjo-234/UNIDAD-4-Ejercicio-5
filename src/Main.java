//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<UnidadCombate> ejercito = new ArrayList<>();


    ejercito.add(new Infanteria(2, 3, 100));
    ejercito.add(new Caballeria(5, 5, 150));
    ejercito.add(new UnidadAerea(10, 20, 250));
    ejercito.add(new Infanteria(1, 1, 90));

    SimuladorBatalla simulador = new SimuladorBatalla();


    simulador.ejecutarAccionesTacticas(ejercito, 25, 30);
}
