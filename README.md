# Bridge Pattern em Java

Este projeto demonstra a implementação do **padrão de projeto Bridge** em Java, separando a **abstração** (Veículos) da **implementação** (Combustíveis).  
O objetivo é mostrar como desacoplar hierarquias de classes para permitir maior flexibilidade e extensibilidade.

---

## 📂 Estrutura do Projeto



src/
└── bridge/
├── abstraction/
│   ├── Veiculo.java
│   ├── Carro.java
│   ├── Moto.java
│   └── Caminhao.java
│
├── implementor/
│   ├── Combustivel.java
│   ├── Gasolina.java
│   ├── Etanol.java
│   └── Diesel.java
│
└── app/
└── Main.java
