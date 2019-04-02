public abstract class Figura {
    float centroX;
    float centroY;
    Object tipo;

    Figura(float x, float y, Object t){
        this.centroX = x;
        this.centroY = y;
        this.tipo = t;
    }

    String desenhar(){
        return this.tipo.toString();
    }

    void mover(float dy, float dx){
        this.centroX = this.centroX + dx;
        this.centroY = this.centroX + dy;
    }

    abstract float calcularArea();
}