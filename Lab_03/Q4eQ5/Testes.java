public class Testes {
    public static void main(String[] args) {
        System.out.println("## Questão 5 ##");
        System.out.println("-- Criando vetor com 10 figuras concretas --");

        Figura vetor[] = new Figura[10];

        System.out.println("- v0: Circulo de raio 3");

        vetor[0] = new Circulo(3);

        System.out.println("- v1: Quadrado de lado 3");

        vetor[1] = new Quadrado(3);

        System.out.println("- v2: Quadrado de raio 6");

        vetor[2] = new Quadrado(6);

        System.out.println("- v3: Circulo de raio 2");

        vetor[3] = new Circulo(2);

        System.out.println("- v4: Circulo de raio 8");

        vetor[4] = new Circulo(8);

        System.out.println("- v5: Quadrado de raio 1");

        vetor[5] = new Quadrado(1);

        System.out.println("- v6: Circulo de raio 9");

        vetor[6] = new Circulo(9);

        System.out.println("- v7: Circulo de raio 5");

        vetor[7] = new Circulo(5);

        System.out.println("- v8: Quadrado de raio 4");

        vetor[8] = new Quadrado(3);

        System.out.println("- v9: Quadrado de raio 7");

        vetor[9] = new Quadrado(3);

        System.out.println("-- Imprimindo área apenas das figuras colorias:");

        float area;

        for(int i = 0; i < 10; i++){
            if(vetor[i].desenhar().equals("Colorido")){
                area = vetor[i].calcularArea();
                System.out.println("Area de v"+i+": "+area);
            }
        }
    }
}