package bridge.abstraction;

import bridge.implementor.Combustivel;

public abstract class Veiculo {
    protected Combustivel combustivel;

    public Veiculo(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public abstract void mover();
}
