package IDenominator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IDenominatorEN implements IDenominator{

    private final List<String> firstName = Arrays.asList("John", "Michael", "Charles");
    private final List<String> lastName = Arrays.asList("William", "Nottingham", "Wilson");
    private final Random randomGenerator = new Random();

    @Override
    public String getFirstName() {
        int index = randomGenerator.nextInt(firstName.size());
        return firstName.get(index);
    }

    @Override
    public String getLastName() {
        int index = randomGenerator.nextInt(lastName.size());
        return lastName.get(index);
    }

    @Override
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
}
