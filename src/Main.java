import Factory.AbstractFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println(new AbstractFactory().getFactory("PT").getPrefixName());
        System.out.println(new AbstractFactory().getFactory("EN").getPrefixName());

    }
}
