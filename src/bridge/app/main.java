package bridge.app;

import bridge.abstraction.*;
import bridge.implementor.*;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(new Gasolina());
        Veiculo moto = new Moto(new Etanol());
        Veiculo caminhao = new Caminhao(new Diesel());

        carro.mover();
        moto.mover();
        caminhao.mover();
    }
}
