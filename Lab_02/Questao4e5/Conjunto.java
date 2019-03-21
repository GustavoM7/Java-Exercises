class Conjunto {
    String conjunto[]; //Alterando vetor de inteiros para strings, assim conjunto aceitará não somente elementos do tipo inteiro
    int ultimaposicao = 0; //marca a ultima posição preenchida do conjunto

    //Método construtor

    Conjunto(int tamanho){
        this.conjunto = new String[tamanho]; //Tamanho variável
    }

    Conjunto(){
        this.conjunto = new String[100]; //Tamanho default
    }

    void inserir(String elem) {

        if(this.ultimaposicao == 100){
            System.out.println("Conjunto cheio!");
        } else if(pertence(elem)){
            System.out.println("Elemento já foi inserido ao conjunto!");
        } else {
            System.out.println("inserindo elemento: " + elem);
            this.conjunto[this.ultimaposicao] = elem;
            ++this.ultimaposicao;
        }

    }

    boolean pertence(String elem) { //verifica se o elem pertence ao conj
        for (int i = 0; i < this.ultimaposicao; ++i) {
            if (this.conjunto[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    boolean subconjunto(Conjunto c) { //verifica se o conj c eh subconj
        //compara cada elemento do conj c com o this
        
        for (int i = 0; i < c.ultimaposicao; ++i){
            if(!pertence(c.conjunto[i])){
                return false;
            }
        }
        
        return true;
    }

    String[] uniao(Conjunto c){
        String uniaoconj[] = new String[this.ultimaposicao + c.ultimaposicao]; //Vetor com tamanho máximo do conjunto união
        int p = 0;
        for (int i = 0; i < c.ultimaposicao; ++i) { 
            if(!pertence(c.conjunto[i])){ //Verificando se cada elemento do conjunto c já está no this para evitar repetição
                uniaoconj[p] = c.conjunto[i];
                ++p;
            }
        }
        for (int i = 0; i < this.ultimaposicao; ++i) { 
            uniaoconj[p] = this.conjunto[i];
            ++p;
        }
        return uniaoconj;
    }

    String[] intersecao(Conjunto c){
        String intersecaoconj[] = new String[c.ultimaposicao]; //Vetor com tamanho máximo do conjunto de interseção (supondo c o menor conjunto)
        int p = 0;

        for (int i = 0; i < c.ultimaposicao; ++i) {
            //Se elemento de c pertence ao this, pertence a interseção 
            if (pertence(c.conjunto[i])) {
                intersecaoconj[p] = c.conjunto[i];
                ++p;
            }
        }
        return intersecaoconj;
    }

    String[] diferenca(Conjunto c){ // A - B
    
        String diferencaconj[] = new String[this.ultimaposicao]; //Vetor com o tamanho máximo do conjunto diferença
        int p = 0;
        //Percorrendo todos os elementos de this
        for (int i = 0; i < this.ultimaposicao; ++i){
            //Se elemento pertece a c e a this, ele não estará na diferença
            if(!c.pertence(this.conjunto[i])){
                diferencaconj[p] = this.conjunto[i];
                ++p;
            }
        }
        return diferencaconj;
    }

    String[][] produtoCartesianto(Conjunto c){

        int tamanho = this.ultimaposicao * c.ultimaposicao; //Tamanho do conjunto gerado
        int p = 0; //Contador para conjunto gerado;
        String produto[][] = new String[2][tamanho]; //Matriz de partes do produto

        //Percorrendo conjunto this
        for(int i = 0; i < this.ultimaposicao; i++){
            //Percorrendo conjunto c
            for(int j = 0; j < c.ultimaposicao; j++){
                //Inserindo pares na matriz
                produto[0][p] = this.conjunto[i];
                produto[1][p] = c.conjunto[j];
                p++;
            }
        }

        return produto;
    }

    String[] getConjunto(){
        return this.conjunto;
    }
    int getUltimaPosicao(){
        return this.ultimaposicao;
    }

}