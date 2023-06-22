// Classe principal
public class Main {
    public static void main(String[] args) {
        Application app = new Application();

        // Usando a Estratégia 1
        app.setStrategy(new Strategy1());
        app.executeStrategy();

        // Usando a Estratégia 2
        app.setStrategy(new Strategy2());
        app.executeStrategy();

        // Usando a Estratégia 3
        app.setStrategy(new Strategy3());
        app.executeStrategy();

        // Usando a Estratégia 4
        app.setStrategy(new Strategy4());
        app.executeStrategy();
    }
}
