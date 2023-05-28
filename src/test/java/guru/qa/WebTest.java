package guru.qa;

import com.codeborne.selenide.Condition;
import guru.qa.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTest extends TestBase {

    @Test
    void githubTest() {
        open("");
        $(".header-search-input").shouldBe(Condition.visible);
    }
}
