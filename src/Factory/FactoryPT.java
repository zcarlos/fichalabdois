package Factory;

import IDenominator.IDenominator;
import IDenominator.IDenominatorPT;
import IPrefixator.IPrefixator;
import IPrefixator.IPrefixatorPT;

public class FactoryPT implements Factory{

    private final IDenominator iDenominator = new IDenominatorPT();
    private final IPrefixator iPrefixator = new IPrefixatorPT();

    @Override
    public String getPrefixName() {
        return iPrefixator.getPrefix() + " " + iDenominator.getName();
    }
}
