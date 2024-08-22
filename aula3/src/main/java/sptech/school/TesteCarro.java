package sptech.school;

public class TesteCarro {
    public static void main(String[] args) {
        Carro marquinhos = new Carro();

        marquinhos.fabricante = "Volks";
        marquinhos.modelo = "Gol quadrado";
        marquinhos.cor = "amarelo";
        marquinhos.placa = "123456HJKU";

        marquinhos.acelerar();


        Carro carro2 = new Carro();

        carro2.fabricante = "Fiat";
        carro2.modelo = "Pálio com aerofólio";
        carro2.cor = "Dourado";
        carro2.placa = "GHTYUK3245";

        carro2.acelerar();
        carro2.acelerar();

        marquinhos.exibirInfo();
        carro2.exibirInfo();
    }
}
