public class Main{
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Motocicleta moto = new Motocicleta();
       

        veiculo.setMarca("Fusca");   
        veiculo.setModelo("Volkswagen");
        veiculo.setAno(1970);   

        veiculo.infoVeiculo();  

        carro.setMarca("Civic");    
        carro.setModelo("Honda");   
        carro.setAno(2020);
        carro.setNumPortas(4);
        carro.infoVeiculo();
        moto.setMarca("CB500");
        moto.setModelo("Honda");
        moto.setAno(2021);
        moto.setTipoGuidao("Esportivo");
        moto.infoVeiculo();
    
    }
}