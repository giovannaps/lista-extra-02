public class Loja {

    public void listarGarantia(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + ", Garantia: " + produto.calcularGarantia() + " anos");
        }
    }   
    
}
