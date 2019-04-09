class ContaXPTOExtreme extends Conta{
    ContaXPTOExtreme(int id){
        super(id, "ContaXPTOExtreme");
    }

    void creditar(float val) {
        this.saldo = this.saldo + (val * (float)1.002);
    }

    void debitar(float val) {
        this.saldo = this.saldo - val + (val * (float)0.002);
    }
}