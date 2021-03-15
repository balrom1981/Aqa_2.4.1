package web.page;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
  private SelenideElement heading = $("[data-test-id=dashboard]");
  private SelenideElement buttonFirstBill = $("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0'] button");
  private SelenideElement buttonSecondBill = $("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d'] button");

  public DashboardPage() {
    heading.shouldBe(visible);
  }

  public ReplenishmentPage firstBill() {
    buttonFirstBill.click();
    return new ReplenishmentPage();
  }

  public ReplenishmentPage secondBill() {
    buttonFirstBill.click();
    return new ReplenishmentPage();
  }
}
