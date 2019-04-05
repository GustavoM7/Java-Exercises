class Circulo implements Figura{
    float raio, x, y;
    String tipo = "Circulo";

    Circulo(float raio){
        this.raio = raio;
        this.x = 0;
        this.y = 0;
    }

    public String desenhar(){
        return toString();
    }
 
    @Override public String toString(){
        return this.tipo;
    }

    public void mover(float dy, float dx){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public float calcularArea(){
        float x = 2.0f * this.raio;
        return (float)(x * Math.PI);
    }
}