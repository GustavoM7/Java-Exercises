public class Main {
    public static void main(String[] args) {
        System.out.println("## Questão 3 ##");
        System.out.println("-- Istanciando quadrado de lado 4 --");
        Quadrado q1 = new Quadrado(0, 0, "Quadrado", 4);
        System.out.println("- Movendo quadro em 7 unidades em x e 16 unidades em y (função mover)");
        q1.mover(16,7);
        float xQ1 = q1.getX();
        float yQ1 = q1.getY();
        System.out.println("- Novo centro: ("+xQ1+","+yQ1+")");
        System.out.println("-- Desenhando quadrado (função desenhar):");
        String desenhoQ1 = q1.desenhar();
        System.out.println(desenhoQ1);
        float aQ1 = q1.calcularArea();
        System.out.println("-- Área do quadrado: "+aQ1);
        
        

        System.out.println("-- Istanciando quadrado de lado 12 --");
        Quadrado q2 = new Quadrado(0, 0, "Quadrado", 12);
        System.out.println("- Movendo quadro em 6 unidades em x e 3 unidades em y (função mover)");
        q2.mover(3, 6);
        float xQ2 = q2.getX();
        float yQ2 = q2.getY();
        System.out.println("- Novo centro: ("+xQ2+","+yQ2+")");
        System.out.println("-- Desenhando quadrado (função desenhar):");
        String desenhoQ2 = q2.desenhar();
        System.out.println(desenhoQ2);
        float aQ2 = q2.calcularArea();
        System.out.println("-- Área do quadrado: "+aQ2);
        
        

        System.out.println("-- Istanciando circulo de raio 5 --");
        Circulo c1 = new Circulo(0, 0, "Circulo", 5);
        System.out.println("- Movendo circulo em 1 unidades em x e 2 unidades em y (função mover)");
        c1.mover(2,1);
        float xC1 = c1.getX();
        float yC1 = c1.getY();
        System.out.println("- Novo centro: ("+xC1+","+yC1+")");
        System.out.println("-- Desenhando circulo (função desenhar):");
        String desenhoC1 = c1.desenhar();
        System.out.println(desenhoC1);
        float aC1 = c1.calcularArea();
        System.out.println("-- Área do quadrado: "+aC1);

        System.out.println("-- Istanciando circulo de raio 9,87654321 --");
        Circulo c2 = new Circulo(0, 0, "Circulo", 9.876f);
        System.out.println("- Movendo circulo em 1 unidades em x e 2 unidades em y (função mover)");
        c2.mover(4,13);
        float xC2 = c2.getX();
        float yC2 = c2.getY();
        System.out.println("- Novo centro: ("+xC2+","+yC2+")");
        System.out.println("-- Desenhando circulo (função desenhar):");
        String desenhoC2 = c2.desenhar();
        System.out.println(desenhoC1);
        float aC2 = c2.calcularArea();
        System.out.println("-- Área do quadrado: "+aC2);
    }
    
}