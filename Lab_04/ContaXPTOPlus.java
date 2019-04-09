class ContaXPTOPlus extends Conta{
    ContaXPTOPlus(int id){
        super(id, "ContaXPTOPlus");
    }

    void creditar(float val) {
        this.saldo = this.saldo + (val * (float)1.005);
    }

    void debitar(float val) {
        this.saldo = this.saldo - val;
    }
}