public class Main{
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Funcionario gerente = new Gerente("Alice", 5000);      
        Funcionario estagiario = new Estagiario("Bob", 2000);
        Funcionario desenvolvedor = new Funcionario("Charlie", 3000);    
        

        empresa.calcularFolhaDePagamento(gerente);  
        empresa.calcularFolhaDePagamento(estagiario);  
         empresa.calcularFolhaDePagamento(desenvolvedor);  
        
    }
}