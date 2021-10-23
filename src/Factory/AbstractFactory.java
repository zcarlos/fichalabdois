package Factory;

public class AbstractFactory {

    public Factory getFactory(String language) {
        switch (language) {
            case "PT" :
                return new FactoryPT();
            default:
                return new FactoryEN();
        }
    }
}
