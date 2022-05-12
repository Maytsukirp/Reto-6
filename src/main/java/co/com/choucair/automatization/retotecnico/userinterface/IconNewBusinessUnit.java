package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IconNewBusinessUnit {

    public static final Target ICON_NEWBUSINESSUNIT= Target.the("Icon new bussiness unit")
            .locatedBy(".add-button");

    public static final Target TEXTNAMEBUSINESSUNIT = Target.the("Text new business unit")
            .locatedBy("[name='Name']");

    public static final Target CONTAINER_PARENTUNIT = Target.the("Parent Unit")
            .locatedBy(".select2-chosen");

    public static final Target PARENTUNIT = Target.the("Parent Unit")
            .locatedBy(".select2-input");

    public static final Target APPLYCHANGES = Target.the("Apply changes")
            .locatedBy(".apply-changes-button");

    public static final Target SAVE = Target.the("Save Changes")
            .locatedBy("//span[contains(.,'Save')]");

    public static final Target TEXT_SEARCH_BUSINESS  = Target.the("Text Search")
            .locatedBy(".s-Serenity-QuickSearchInput");

    public static final Target TEXT_TABLE_BUSINESS = Target.the("Text Table")
            .locatedBy(".grid-canvas-left.grid-canvas-top > div:nth-of-type(1) > .l1");
}

