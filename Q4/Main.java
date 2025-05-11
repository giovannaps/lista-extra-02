public class Main{
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Computador("Computador", 2000);
        produtos[1] = new Smartphone("Smartphone", 1500);
        produtos[2] = new Tablet("Tablet", 1000);
        
        Loja loja = new Loja();
        loja.listarGarantia(produtos);
    }
}   