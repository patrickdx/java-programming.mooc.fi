package mooc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
class ExceriseManagementTest {

	@Test
    public void calculatorInitialValueZero() {
		ExceriseManagement calculator = new ExceriseManagement();
        assertEquals(0, calculator.getValue());
    }
}
