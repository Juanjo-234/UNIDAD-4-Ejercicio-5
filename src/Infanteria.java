public class Infanteria extends  UnidadCombate{
    public Infanteria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {
        System.out.println("Infanteria moviendosé a una posición...");
        this.posicionX = nuevaX;
        this.posicionY = nuevaY;
        this.energia -= 10;
        System.out.println("Posicion actual: " + posicionX +", " + posicionY + "|Energia: " + energia );
    }

    @Override
    public void atacar() {
        System.out.println("Disparando con rifles de asalto a corta/media distancia.");
    }
}
