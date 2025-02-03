import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class ContractTest {

    @Test
    void testContractCreation() {
        Date date = new Date();
        Contract contract = new Contract(date, "Software Development", "XYZ Corp", 10000.0);

        // Проверка равенства
        assertEquals("Software Development", contract.getTitle());
        assertEquals(date, contract.getDate());
        assertEquals("XYZ Corp", contract.getCounterparty());
        assertEquals(10000.0, contract.getAmount());

        // Проверка попадания значения в интервал
        assertTrue(contract.getAmount() > 5000 && contract.getAmount() < 15000);
    }

    @Test
    void testContractAmountChange() {
        Contract contract = new Contract(new Date(), "Software Development", "XYZ Corp", 10000.0);
        contract.setAmount(12000.0);

        // Проверка равенства после изменения
        assertEquals(12000.0, contract.getAmount());

        // Проверка попадания значения в интервал
        assertTrue(contract.getAmount() >= 10000 && contract.getAmount() <= 15000);
    }
}