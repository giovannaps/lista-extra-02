public class Gerente extends Funcionario {    

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    public Gerente() {
        super();
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + 500;
    }   
    
}
