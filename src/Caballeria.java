public class Caballeria extends UnidadCombate{
    public Caballeria(int posicionX, int posicionY, int energia) {
        super(posicionX, posicionY, energia);
    }

    @Override
    public void moverse(int nuevaX, int nuevaY) {
        System.out.println("Caballeria moviendosé a una posición...");
        this.posicionX = nuevaX;
        this.posicionY = nuevaY;
        this.energia -= 20;
        System.out.println("Posicion actual: " + posicionX +", " + posicionY + "|Energia: " + energia );
    }

    @Override
    public void atacar() {
        System.out.println("Caballeria realizando cargas con lanzas.");
    }
}
