class Quadrado implements Figura, Colorida{
    float lado, x, y;
    String tipo = "Colorido";
    String cor;

    Quadrado(float lado){
        this.lado = lado;
        this.x = 0F;
        this.y = 0F;
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
    
    public void desenhar(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public float calcularArea(){
        return this.lado * this.lado;
    }
}