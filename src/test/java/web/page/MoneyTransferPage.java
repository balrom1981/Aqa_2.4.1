package web.page;

import com.codeborne.selenide.SelenideElement;
import web.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MoneyTransferPage {
    //    private SelenideElement amount = $("[data-test-id='amount' input]");
    private SelenideElement amount = $("[type='text']");
    private SelenideElement from = $("[data-test-id='from'] input");
    private SelenideElement buttonTransfer = $("[data-test-id='action-transfer']");
    private SelenideElement buttonCancel = $("[data-test-id='action-cancel']");

    public MoneyTransferPage() {

    }

    public DashboardPage transferMoney(int amountTransfer, DataHelper.Card card) {
        amount.setValue(String.valueOf(amountTransfer));
        from.setValue(card.getNumber());
        buttonTransfer.click();
        return new DashboardPage();
    }
}
