import java.util.List;

public class SimuladorBatalla {
    public void ejecutarAccionesTacticas(List<UnidadCombate> unidades, int destinoX, int destinoY ){
        System.out.println("==================================================");
        System.out.println("      INICIO DE ORDEN DE MOVIMIENTO Y ATAQUE      ");
        System.out.println("==================================================");

        for(UnidadCombate unidad : unidades){
            unidad.moverse(destinoX, destinoY);
            unidad.atacar();
        }
        System.out.println("==================================================");
        System.out.println("      FIN DE LA RONDA DE ACCIONES TÁCTICAS        ");
        System.out.println("==================================================");
    }
}
