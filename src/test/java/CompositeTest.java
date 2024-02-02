import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CompositeTest {
@Test
public void compositeTest() {
    Shape circle1 = new Circle();

    Composite composite1 = new Composite();

    composite1.addShapes(circle1);

    String result = composite1.draw();

    Assertions.assertEquals("Круг", result);
}
}
