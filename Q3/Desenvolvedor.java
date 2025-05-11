public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public Desenvolvedor() {
        super();
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }   
    
}
