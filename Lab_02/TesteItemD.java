class TesteItemD {
  public static void main(String[] args) {
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


    System.out.println("item D: Testando se a interseção dos conjuntos 1 e 2 é vazia");
    int interAeB[] = a.intersecao(b);
    //Imprimindo interseção:
    for(int i = 0; i < interAeB.length; i++){
      System.out.println(interAeB[i]);
    }

    //Testando se é um vetor vazio (zeros repetidos, visto q não há repetição nos conjuntos);
    if(interAeB[0] == 0 && interAeB[1] == 0){
      System.out.println("interseção está vazia");
    } else {
      System.out.println("interseção não está vazia");
    }

  }

}