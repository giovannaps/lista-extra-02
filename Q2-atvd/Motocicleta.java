public class Motocicleta extends Veiculo{
    private String tipoGuidao;

    @Override
    public void infoVeiculo(){
        System.out.println("---------------------");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Tipo de guidão: " + getTipoGuidao()); 
        System.out.println("---------------------"); 
    }

    public String getTipoGuidao() {
        return tipoGuidao;
    }

    public void setTipoGuidao(String tipoGuidao) {
        this.tipoGuidao = tipoGuidao;
    }

    public Motocicleta(String marca, String modelo, int ano, String tipoGuidao) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }
    public Motocicleta() {
    }
    
    
}
