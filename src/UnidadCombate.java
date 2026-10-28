public abstract class UnidadCombate{

protected int posicionX;
protected int posicionY;
protected int energia;

public UnidadCombate(int posicionX, int posicionY, int energia) {
    this.posicionX = posicionX;
    this.posicionY = posicionY;
    this.energia = energia;
}

public abstract void moverse(int nuevaX, int nuevaY);
public abstract void atacar();

public int getPosicionX() {
    return posicionX;
}

public int getPosicionY() {
    return posicionY;
}

public int getEnergia() {
    return energia;
}
}
