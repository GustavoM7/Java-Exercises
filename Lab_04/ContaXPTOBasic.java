class ContaXPTOBasic extends Conta{
    ContaXPTOBasic(int id){
        super(id, "ContaXPTOBasic");
    }

    void creditar(float val) {
        this.saldo = this.saldo + val;
    }

    void debitar(float val) {
        this.saldo = this.saldo - val;
    }
}