public class Computador extends Produto{

    public Computador(String nome, double preco) {
        super(nome, preco);
    }
    
    public Computador() {
        super();
    }

    @Override   
    public int calcularGarantia(){
        return 1 * 3;
    }
}
