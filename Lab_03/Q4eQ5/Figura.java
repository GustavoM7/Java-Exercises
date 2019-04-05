interface Figura{
    String desenhar();
    @Override public String toString();
    void mover(float dy, float dx);
    float getX();
    float getY();
    float calcularArea();
}