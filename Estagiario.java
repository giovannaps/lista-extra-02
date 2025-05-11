public class Estagiario extends Funcionario {
    
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }   
    
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public Estagiario() {
        super();
    }
    
}
