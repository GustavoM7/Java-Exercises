class Conjunto {
    int conjunto[] = new int[100]; //professor falou que podia ser um vetor de 100
    int ultimaposicao = 0; //marca a ultima posição preenchida do conjunto

    void inserir(int elem) {
        this.conjunto[this.ultimaposicao] = elem;
        ++this.ultimaposicao;
        System.out.println("inserindo elemento: " + elem);
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
        //obs: não deu certo chamar o metodo pertence acima
        boolean teste = false;
        for (int i = 0; i < c.ultimaposicao; ++i) { 
            for (int j = 0; j < this.ultimaposicao; ++j) {
                if (c.conjunto[i] == this.conjunto[j]) {
                    teste = true;
                } else {
                    continue;
                }
            }
            if(teste == false){
                return false;
            }
            teste = false;
        }
        return true;
    }
    int[] uniao(Conjunto c){ //falta ajeitar a repetição de elementos
        int uniaoconj[] = new int[20]; //200
        int p = 0;
        for (int i = 0; i < c.ultimaposicao; ++i) { 
            uniaoconj[p] = c.conjunto[i];
            ++p;
        }
        for (int i = 0; i < this.ultimaposicao; ++i) { 
            uniaoconj[p] = this.conjunto[i];
            ++p;
        }
        return uniaoconj;
    }

    int[] intersecao(Conjunto c){
        int intersecaoconj[] = new int[20]; //100
        int p = 0;
        for (int i = 0; i < c.ultimaposicao; ++i) { 
            for (int j = 0; j < this.ultimaposicao; ++j) {
                if (c.conjunto[i] == this.conjunto[j]) {
                    intersecaoconj[p] = this.conjunto[j];
                    ++p;
                } else {
                    continue;
                }
            }
        }
        return intersecaoconj;
    }

    int[] diferenca(Conjunto c){ // A - B
        int diferencaconj[] = new int[20]; //100
        int p = 0;
        boolean teste = true;
        for (int i = 0; i < this.ultimaposicao; ++i) { 
            for (int j = 0; j < c.ultimaposicao; ++j) {
                if (this.conjunto[i] == c.conjunto[j]) {
                    teste = false;
                } else {
                    continue;
                }
            }
            if(teste){
                diferencaconj[p] = this.conjunto[i];
                ++p;
            }
            teste = true;
        }
        return diferencaconj;
    }

}