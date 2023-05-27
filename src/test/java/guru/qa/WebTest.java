package guru.qa;

import com.codeborne.selenide.Condition;
import guru.qa.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTest extends TestBase {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @Test
    void githubTest() {
        open(config.getBaseUrl());
        $(".header-search-input").shouldBe(Condition.visible);
    }
}
