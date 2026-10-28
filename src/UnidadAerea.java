public class UnidadAerea extends UnidadCombate{
    public UnidadAerea(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {
        System.out.println("Unidad aérea moviendosé a una posición...");
        this.posicionX = nuevaX;
        this.posicionY = nuevaY;
        this.energia -= 35;
        System.out.println("Posicion actual: " + posicionX +", " + posicionY + "|Energia: " + energia );
    }

    @Override
    public void atacar() {
        System.out.println("Unidad aérea realizando bombardeo estrategico.");
    }
}
