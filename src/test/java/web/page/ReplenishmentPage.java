package web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ReplenishmentPage {
    private SelenideElement heading = $("[data-test-id=dashboard] h1");
    private SelenideElement amount = $("[data-test-id='amount']");
    private SelenideElement from = $("[data-test-id='from'] input");
    private SelenideElement buttonTransfer = $("[data-test-id='action-transfer']");
    private SelenideElement buttonCancel = $("[data-test-id='action-cancel']");

    public ReplenishmentPage() {
        heading.shouldBe(visible);
    }

    public DashboardPage transferMoney (String amountTransfer, String fromBill) {
        amount.setValue(amountTransfer);
        from.setValue(fromBill);
        buttonTransfer.click();
        return new DashboardPage();
    }
}
