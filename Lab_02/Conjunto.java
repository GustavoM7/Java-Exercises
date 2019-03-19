class Conjunto {
    int conjunto[] = new int[100]; //professor falou que podia ser um vetor de 100
    int ultimaposicao = 0; //marca a ultima posição preenchida do conjunto

    void inserir(int elem) {

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

    boolean pertence(int elem) { //verifica se o elem pertence ao conj
        for (int i = 0; i < this.ultimaposicao; ++i) {
            if (this.conjunto[i] == elem) {
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

    int[] uniao(Conjunto c){
        int uniaoconj[] = new int[this.ultimaposicao + c.ultimaposicao]; //Vetor com tamanho máximo do conjunto união
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

    int[] intersecao(Conjunto c){
        int intersecaoconj[] = new int[c.ultimaposicao]; //Vetor com tamanho máximo do conjunto de interseção (supondo c o menor conjunto)
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

    int[] diferenca(Conjunto c){ // A - B
    
        int diferencaconj[] = new int[this.ultimaposicao]; //Vetor com o tamanho máximo do conjunto diferença
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

}