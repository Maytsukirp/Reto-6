package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;


public class SelectOrganizationPage {

    public static final Target ICON_ORGANIZATION= Target.the("Icon organization")
            .locatedBy("//span[.='Organization']");

    public static final Target BUSINESS_UNIT = Target.the("Icon business unit")
            .locatedBy("//span[.='Business Units']");
}
