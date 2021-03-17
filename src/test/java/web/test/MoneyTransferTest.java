package web.test;

import lombok.val;
import org.junit.jupiter.api.Test;
import web.data.DataHelper;
import web.page.LoginPageV2;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTransferTest {

  @Test
  void shouldTransferMoneyBetweenOwnCardsV2() {
    open("http://localhost:9999");
    val loginPage = open("http://localhost:9999", LoginPageV2.class);
    val authInfo = DataHelper.getAuthInfo();
    val verificationPage = loginPage.validLogin(authInfo);
    val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
    val dashboardPage = verificationPage.validVerify(verificationCode);
    val balanceFirstBillBeforeTransfer = dashboardPage.getFirstCardBalance();
    val balanceSecondBillBeforeTransfer = dashboardPage.getSecondCardBalance();
    val moneyTransferPage = dashboardPage.firstBill();
    int amount = 1000;
    moneyTransferPage.transferMoney(amount, DataHelper.Card.getCardSecond());
    val balanceFirstBillAfterTransfer = dashboardPage.getFirstCardBalance();
    val balanceSecondBillAfterTransfer = dashboardPage.getSecondCardBalance();
    assertEquals((balanceFirstBillBeforeTransfer-amount),balanceFirstBillAfterTransfer);
  }

}

