abstract class Conta {
    int id;
    float saldo;
    String tipo;

    Conta(int id, String tipo){
        this.id = id;
        this.saldo = (float) 0;
        this.tipo = tipo;
    }
    
    @Override public String toString(){
        return ("@" + this.tipo + "ID" + this.id + "Saldo" + this.saldo);
    }

    abstract void creditar(float val);
    abstract void debitar(float val);
    
}