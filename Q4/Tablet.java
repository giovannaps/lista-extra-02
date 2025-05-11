public class Tablet extends Produto{
    
    public Tablet(String nome, double preco) {
        super(nome, preco);
    }
    
    public Tablet() {
        super();
    }
    
    @Override
    public int calcularGarantia(){
        return 1;
    }
    
    
}
