public class Carro extends Veiculo{
    private int numPortas;


    @Override
    public void infoVeiculo(){
        System.out.println("---------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Número de portas: " + getNumPortas());  
        System.out.println("---------------------"); 
    }
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
public Carro(String marca, String modelo, int ano, int numPortas) {
    super(marca, modelo, ano);
    this.numPortas = numPortas;
    
}
public Carro(){}



}