class Quadrado extends Figura{
    float lado;
    Quadrado(float x, float y, String tipo, float lado){
        super(x, y, tipo);
        this.lado = lado;
    }

    float calcularArea(){
        return this.lado * this.lado;
    }

}