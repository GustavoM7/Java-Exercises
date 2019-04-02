class Circulo extends Figura{
    float raio;

    Circulo(float x, float y, Object tipo, float raio){
        super(x, y, tipo);
        this.raio = raio;
    }

    float calcularArea(){
        float x = 2.0f * this.raio;
        return (float)(x * Math.PI);
    }

}