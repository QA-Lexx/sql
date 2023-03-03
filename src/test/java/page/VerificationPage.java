package page;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class VerificationPage {
    private static SelenideElement codeField;
    private static SelenideElement verifyButton;
    private static SelenideElement errorNotification;

    public static void verifyVerificationPageVisibility() {
        codeField.shouldBe(visible);
    }

    public static void verifyErrorNotificationVisibility() {
        errorNotification.shouldBe(visible);
    }

    public static DashboardPage validVerify(String verificationCode) {
        verify(verificationCode);
        return page(DashboardPage.class);
    }

    public static void verify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
    }
}