package web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ReplenishmentPage {
    private SelenideElement amount = $("[data-test-id='amount']");
    private SelenideElement from = $("[data-test-id='from'] input");
    private SelenideElement buttonTransfer = $("[data-test-id='action-transfer']");
    private SelenideElement buttonCancel = $("[data-test-id='action-cancel']");


}
