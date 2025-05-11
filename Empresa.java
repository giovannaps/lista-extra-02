public class Empresa {

    public void calcularFolhaDePagamento(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.calcularSalario());
        System.out.println("--------------------------------------------------");   
    }   
    
}
