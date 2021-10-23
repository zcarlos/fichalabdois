package Factory;

import IDenominator.IDenominator;
import IDenominator.IDenominatorEN;
import IPrefixator.IPrefixator;
import IPrefixator.IPrefixatorEN;

public class FactoryEN implements Factory{

    private final IDenominator iDenominator = new IDenominatorEN();
    private final IPrefixator iPrefixator = new IPrefixatorEN();

    @Override
    public String getPrefixName() {
        return iPrefixator.getPrefix() + " " + iDenominator.getName();
    }
}
