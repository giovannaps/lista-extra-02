public class Smartphone extends Produto{
    public Smartphone(String nome, double preco) {
        super(nome, preco);
    }

    public Smartphone() {
        super();
    }

    @Override   
    public int calcularGarantia(){
        return 1 * 2;
    }
}
