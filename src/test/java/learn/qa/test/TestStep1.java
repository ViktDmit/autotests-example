package learn.qa.test;

import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StoreReport")
public class TestStep1 {

  @Test
  void TestIT_() {
    System.out.println(Map.of(
        "1", 1,
        "2", 2
    ));
  }
}