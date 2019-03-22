class Conjunto {
    Object conjunto[]; //Alterando vetor de inteiros para strings, assim conjunto aceitará não somente elementos do tipo inteiro
    int ultimaposicao = 0; //marca a ultima posição preenchida do conjunto

    //Método construtor

    Conjunto(int tamanho){
        this.conjunto = new Object[tamanho]; //Tamanho variável
    }

    Conjunto(){
        this.conjunto = new Object[100]; //Tamanho default
    }

    void inserir(Object elem) {

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

    boolean pertence(Object elem) { //verifica se o elem pertence ao conj
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

    Object[] uniao(Conjunto c){
        Object uniaoconj[] = new Object[this.ultimaposicao + c.ultimaposicao]; //Vetor com tamanho máximo do conjunto união
        int p = 0;
        for (int i = 0; i < c.ultimaposicao; ++i) { 
            if(!pertence(c.conjunto[i])){ //Verificando se cada elemento do conjunto c já está no this para enviar repetição
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

    Object[] intersecao(Conjunto c){
        Object intersecaoconj[] = new Object[c.ultimaposicao]; //Vetor com tamanho máximo do conjunto de interseção (supondo c o menor conjunto)
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

    Object[] diferenca(Conjunto c){ // A - B
    
        Object diferencaconj[] = new Object[this.ultimaposicao]; //Vetor com o tamanho máximo do conjunto diferença
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

    Object[] getConjunto(){
        return this.conjunto;
    }
    int getUltimaPosicao(){
        return this.ultimaposicao;
    }

}