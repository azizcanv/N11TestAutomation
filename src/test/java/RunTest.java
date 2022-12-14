import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        plugin = "pretty",
        glue = {"steps"},
        tags = "@n11addproduct"
)

public class RunTest {
}