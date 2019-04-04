public abstract class Figura {
    float centroX = 0;
    float centroY;
    String tipo;

    Figura(float x, float y, String t){
        this.centroX = x;
        this.centroY = y;
        this.tipo = t;
    }

    String desenhar(){
        return toString();
    }

    @Override
    public String toString(){
        return this.tipo;
    }

    void mover(float dy, float dx){
        this.centroX = this.centroX + dx;
        this.centroY = this.centroY + dy;
    }

    float getX(){
        return this.centroX;
    }

    float getY(){
        return this.centroY;
    }

    abstract float calcularArea();
}