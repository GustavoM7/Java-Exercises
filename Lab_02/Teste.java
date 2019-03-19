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

    //item a ------- OK

    System.out.println("item a -------------------------------");
    if(d.subconjunto(d)){
      System.out.println("eh subconjunto");
    }
    else{
      System.out.println("nao eh subconjunto");
    }

    //item b ------- OK
    System.out.println("item b -------------------------------");
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
    System.out.println("item c -------------------------------");
    int vetoruniao[] = b.uniao(c);
    System.out.println("essa eh a uniao dos conjuntos b e c");
    for(int i = 0; i < vetoruniao.length; ++i){
      System.out.println(vetoruniao[i]);
    }
    //falta a igualdade com o conj 1

    //item d
    
    

    
  }
}
