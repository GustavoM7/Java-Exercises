class Sistema {
    Conta vetor[] = new Conta[10];

    void criarContaXPTOBasic(){
        int i = 0;
        while(i < 10 && this.vetor[i] != null) i++;
        this.vetor[i] = new ContaXPTOBasic(i);
    }

    void criarContaXPTOBasic(int posi){
        if(posi < 10 && posi > 0){
            this.vetor[posi] = new ContaXPTOBasic(posi);
        }
    }

    void criarContaXPTOBasic(int posi, int id){
        if(posi < 10 && posi > 0){
            this.vetor[posi] = new ContaXPTOBasic(id);
        }
    }

    void criarContaXPTOPlus(){
        int i = 0;
        while(i < 10 && this.vetor[i] != null) i++;
        this.vetor[i] = new ContaXPTOPlus(i);
    }

    void criarContaXPTOPlus(int posi){
        if(posi < 10 && posi >= 0){
            this.vetor[posi] = new ContaXPTOPlus(posi);
        }
    }

    void criarContaXPTOPlus(int posi, int id){
        if(posi < 10 && posi >= 0){
            this.vetor[posi] = new ContaXPTOPlus(id);
        }
    }

    void criarContaXPTOExtreme(){
        int i = 0;
        while(i < 10 && this.vetor[i] != null) i++;
        this.vetor[i] = new ContaXPTOPlus(i);
    }

    void criarContaXPTOExtreme(int posi){
        if(posi < 10 && posi > 0){
            this.vetor[posi] = new ContaXPTOExtreme(posi);
        }
    }

    void criarContaXPTOExtreme(int posi, int id){
        if(posi < 10 && posi > 0){
            this.vetor[posi] = new ContaXPTOExtreme(id);
        }
    }

    void creditar(int posi, float val){
        if(this.vetor[posi] != null){
            this.vetor[posi].creditar(val);
        }
    }

    void debitar(int posi, float val){
        if(this.vetor[posi] != null){
            this.vetor[posi].debitar(val);
        }
    }

    float consultarSaldo(int posi){
        if(posi >= 0 && posi < 10){
            return this.vetor[posi].saldo;
        }
        return (float)0;
    }

    public static void main (String args[]) {
        Sistema s = new Sistema();

        s.criarContaXPTOBasic(1);
        s.criarContaXPTOPlus(2);
        s.criarContaXPTOExtreme(3);

        for(int i = 1; i<=3; i++){
            s.creditar(i,1000);
        }
         
        for(int i = 1; i<=3; i++){
            s.debitar(i,10);
        }

        if(s.consultarSaldo(2) == (float)995){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(s.consultarSaldo(1) == (float)990){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(s.consultarSaldo(3) == (float)992.02){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        for(int i = 1; i<=3; i++){
            System.out.println(s.vetor[i].toString());
        }
    }
}

/*
 Comentário para Questão 5:

 - aplicação de coerção: 
        Linhas 85 e 89, onde valores inteiros são coergidos para reais.

 - aplicação de inclusão:
        Classes ContaXPTOBasic, ContaXPTOPlus e ContaXPTOExtreme extendem a classe Conta.

 - aplicação de sobrecarga:
        sobrecarga das funções criarContaXPTOBasic, criarContaXPTOPlus e criarContaXPTOExtreme na classe Sistema, com assinatura () para tratar vetor com pseudo pilha, assinatura (int) com posição no vetor e id de Conta iguais, e assinatura (int , int) para posição no vetor e id de Conta diferentes.
*/