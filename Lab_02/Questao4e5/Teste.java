class Teste {
  public static void main(String[] args) {
      System.out.println("==Testes para questões 4 e 5==");
      System.out.println("-Questão 4, Produto Cartesiano-");
      System.out.println("*Conjunto A:");
      Conjunto a = new Conjunto();
      a.inserir("1");
      a.inserir("2");
      a.inserir("3");
      a.inserir("4");

      System.out.print("\n");
      System.out.println("*Conjunto B:");
      Conjunto b = new Conjunto();
      b.inserir("5");
      b.inserir("6");
      b.inserir("7");
      b.inserir("8");

      System.out.print("\n");
      System.out.println("*Produto Cartesiano de A e B:");
      String produto[][] = a.produtoCartesianto(b);

      System.out.print("{");
      //Percorrendo matriz do produto cartesiano:
      for(int i = 0; i < a.getUltimaPosicao() * b.getUltimaPosicao(); i++){
          System.out.print("(");
          System.out.print(produto[0][i]);
          System.out.print(",");
          System.out.print(produto[1][i]);
          System.out.print(")");
          System.out.print(",");
      }

      System.out.print("}");
      System.out.print("\n\n");

  }
}