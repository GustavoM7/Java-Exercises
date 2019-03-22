class LeiDeMorgan{
    public static void main(String[] args) {
        System.out.println("==Questão 5 - Demonstração da Lei de Morgan==");
        System.out.println("*Conjunto universo:");
        Conjunto u = new Conjunto(50);
        //Inserindo 50 primeiros inteiros no conjunto universo:
        for(int i = 0; i < 50; i++){
            u.inserir(i);
        }

        System.out.println("\n");
        System.out.println("*Conjunto A:");
        Conjunto a = new Conjunto(10);
        //Inserindo 10 primeiros naturais no conjunto A:
        for(int i = 0; i < 10; i++){
            a.inserir(i);
        }

        System.out.println("\n");
        System.out.println("*Conjunto B:");
        Conjunto b = new Conjunto(10);
        //Inserindo 5 primeiros pares no conjunto B:
        b.inserir(2);
        b.inserir(4);
        b.inserir(6);
        b.inserir(8);
        b.inserir(10);

        System.out.println("\n");
        System.out.println("*Conjunto união A e B:");

        Object uniaoAB[] = a.uniao(b);

        //Percorrendo vetor de strings a união a b e gerando novo conjunto
        Conjunto ab = new Conjunto(11);
        for(int i = 0; i < uniaoAB.length; i++){
            if(uniaoAB[i] != null){
                ab.inserir(uniaoAB[i]);
            }
        }

        System.out.println("\n");
        System.out.println("*Conjunto complementar a união A e B:");

        Object complabLista[] = u.diferenca(ab); //Diferença entre a união e o conjunto universo

        //Percorrendo vetor de strings do complementar de a b e inserir em novo conjunto
        Conjunto complab = new Conjunto(39);
        for(int i = 0; i < complabLista.length; i++){
            if(complabLista[i] != null){
                complab.inserir(complabLista[i]);
            }
        }

        System.out.println("\n");
        System.out.println("(Primeiro lado da primeira equação)");

        System.out.println("\n");
        System.out.println("*Conjunto complementar de A:");

        Object complaLista[] = u.diferenca(a); //Diferença entre conjunto A e o conjunto universo

        //Percorrendo vetor de strings do complementar de A e inserir em novo conjunto
        Conjunto compla = new Conjunto(40);
        for(int i = 0; i < complaLista.length; i++){
            if(complaLista[i] != null){
                compla.inserir(complaLista[i]);
            }
        }

        System.out.println("\n");
        System.out.println("*Conjunto complementar de B:");

        Object complbLista[] = u.diferenca(b); //Diferença entre conjunto B e o conjunto universo

        //Percorrendo vetor de strings do complementar de A e inserir em novo conjunto
        Conjunto complb = new Conjunto(45);
        for(int i = 0; i < complbLista.length; i++){
            if(complbLista[i] != null){
                complb.inserir(complbLista[i]);
            }
        }

        System.out.println("\n");
        System.out.println("*Interseção entre complementar de A e complementar de B:");

        Object interComplAComplB[] = compla.intersecao(complb); //Lista com elementos da interseção;
        //Percorrendo lista:

        System.out.print("{");
        for (int i = 0; i < interComplAComplB.length; i++){
            if(interComplAComplB[i] != null){
                System.out.print(interComplAComplB[i]);
                System.out.print(",");
            }
        }
        System.out.print("}\n\n");

        System.out.println("*Complementar da união de A e B:");

        //Percorrendo conjunto:
        System.out.print("{");
        for (int i = 0; i < complab.getUltimaPosicao(); i++){
            System.out.print(complab.conjunto[i]);
            System.out.print(",");
        }
        System.out.print("}\n\n");

        System.out.println("(Primeira equação provada)\n");

        System.out.println("*Interseção de A e B:");
        Object interABList[] = a.intersecao(b);

        //Percorrendo vetor de string e inserindo em novo conjunto:
        Conjunto interAB = new Conjunto(interABList.length);

        for(int i = 0; i < interABList.length; i++){
            if(interABList[i] != null){
                interAB.inserir(interABList[i]);
            }            
        }

        System.out.println("\n*Complementar da interseção de A e B:");
        Object complInterAB[] = u.diferenca(interAB);

        //Percorrendo vetor
        System.out.print("{");

        for(int i = 0; i < complInterAB.length; i++){
            if(complInterAB[i] != null){
                System.out.print(complInterAB[i]);
                System.out.print(",");
            }
        }

        System.out.print("}\n(esqueda da segunda equação)\n\n");

        System.out.println("\n*União do complemento de A e do complemento de B:");

        Object uniComplAComplB[] = compla.uniao(complb); //Lista com a união dos conjuntos criados acima

        //Percorrendo vetor
        System.out.print("{");

        for(int i = 0; i < uniComplAComplB.length; i++){
            if(uniComplAComplB[i] != null){
                System.out.print(uniComplAComplB[i]);
                System.out.print(",");
            }
        }

        System.out.print("}\n(Segunda equação demonstrada)\n\n");

    }
}