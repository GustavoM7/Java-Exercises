class Teste {
  public static void main(String[] args) {

    /*Teste Tudo OKKKK
    Conjunto a = new Conjunto();
    a.inserir(1);
    a.inserir(2);
    a.inserir(3);
    a.inserir(4);
    a.inserir(5);

    Conjunto b = new Conjunto();
    b.inserir(1);
    b.inserir(9);
    b.inserir(3);

    //teste de pertence
    if(a.pertence(3)){
      System.out.println("o elemento pertence");
    }
    else{
      System.out.println("o nao elemento pertence");
    }

    //teste de subconjunto
    if(a.subconjunto(b)){
      System.out.println("eh subconjunto");
    }
    else{
      System.out.println("nao eh subconjunto");
    }

    //teste uniao
    int vetoruniao[] = a.uniao(b);
    System.out.println("essa eh a uniao dos conjuntos");
    for(int i = 0; i < vetoruniao.length; ++i){
      System.out.println(vetoruniao[i]);
    }

    //teste intersecao
    int vetorintersecao[] = a.intersecao(b);
    System.out.println("essa eh a intersecao dos conjuntos");
    for(int i = 0; i < vetoruniao.length; ++i){
      System.out.println(vetorintersecao[i]);
    }

    //teste diferença a - b
    int vetordiferenca[] = a.diferenca(b);
    System.out.println("essa eh a diferenca A - B dos conjuntos");
    for(int i = 0; i < vetordiferenca.length; ++i){
      System.out.println(vetordiferenca[i]);
    }*/

    //Questao 2
    Conjunto a = new Conjunto(); //naturais
    a.inserir(1);
    a.inserir(2);
    a.inserir(3);
    a.inserir(4);
    a.inserir(5);
    a.inserir(6);
    a.inserir(7);
    a.inserir(8);
    a.inserir(9);
    a.inserir(10);

    Conjunto b = new Conjunto(); //pares
    b.inserir(2);
    b.inserir(4);
    b.inserir(6);
    b.inserir(8);
    b.inserir(10);
    
    Conjunto c = new Conjunto(); //impares
    c.inserir(1);
    c.inserir(3);
    c.inserir(5);
    c.inserir(7);
    c.inserir(9);
  
    Conjunto d = new Conjunto(); //primos
    d.inserir(2);
    d.inserir(3);
    d.inserir(5);
    d.inserir(7);
    d.inserir(11);
    d.inserir(13);
    d.inserir(17);
    d.inserir(19);
    d.inserir(23);
    d.inserir(29);

    //item a

    System.out.println("item A: Testando se o conjunto 4 eh subconjunto se si mesmo");
    if(d.subconjunto(d)){
      System.out.println("eh subconjunto");
    }
    else{
      System.out.println("nao eh subconjunto");
    }

    //item b 
    System.out.println("item B: Testando a pertinencia dos conjuntos 2, 3 e 4 no conjunto 1");
    if(a.subconjunto(b)){
      System.out.println("b eh subconjunto de a");
    }
    else{
      System.out.println("b nao eh subconjunto de a");
    }

    if(a.subconjunto(c)){
      System.out.println("c eh subconjunto de a");
    }
    else{
      System.out.println("c nao eh subconjunto de a");
    }

    if(a.subconjunto(d)){
      System.out.println("d eh subconjunto de a");
    }
    else{
      System.out.println("d nao eh subconjunto de a");
    }

    //item c 
    System.out.println("item C: Testando se a uniao de 2 e 3 eh igual ao conjunto 1");
    int vetoruniao[] = b.uniao(c);
    boolean igualdade = true;
    if(a.getUltimaPosicao() == vetoruniao.length){
      for(int i = 0; i < vetoruniao.length; ++i){
        if(a.pertence(vetoruniao[i])){
          continue;
        }
        else{
          igualdade = false;
          break;
        }
      }
      if(igualdade){
        System.out.println("a uniao dos conjuntos b e c eh igual ao conjunto a");
      }
      else{
        System.out.println("a uniao dos conjuntos b e c nao eh igual ao conjunto a");
      }
    }
    else{
      System.out.println("a uniao dos conjuntos b e c nao eh igual ao conjunto a");
    }
    
    //item d
    System.out.println("item D: Testando se a intersecao dos conjuntos 1 e 2 eh vazia");
    int interAeB[] = a.intersecao(b);
    //Imprimindo interseção:
    for(int i = 0; i < interAeB.length; i++){
      System.out.println(interAeB[i]);
    }

    //Testando se é um vetor vazio (zeros repetidos, visto q não há repetição nos conjuntos);
    if(interAeB[0] == 0 && interAeB[1] == 0){
      System.out.println("intersecao esta vazia");
    } else {
      System.out.println("intersecao nao esta vazia");
    }

    //item e
    System.out.println("item E: Qual diferenca entre os conjunto 1 e 2");
    int vetordiferenca[] = a.diferenca(b);
    System.out.println("essa eh a diferenca A - B dos conjuntos");
    for(int i = 0; i < vetordiferenca.length; ++i){
      System.out.println(vetordiferenca[i]);
    }
    

  }
}
