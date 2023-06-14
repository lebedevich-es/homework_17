package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {

    @Test
    void githubTest() {
        open("");
        $(".header-search-input").shouldBe(Condition.visible);
    }
}
