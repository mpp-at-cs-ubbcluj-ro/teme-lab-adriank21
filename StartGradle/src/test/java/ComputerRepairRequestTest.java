import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")
    public void testFirst() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("", computerRepairRequest.getOwnerName());
        assertEquals("", computerRepairRequest.getOwnerAddress());
        computerRepairRequest.setOwnerName("test");
        computerRepairRequest.setOwnerAddress("test");
        assertEquals("test", computerRepairRequest.getOwnerName());
        assertEquals("test", computerRepairRequest.getOwnerAddress());
    }

    @Test
    @DisplayName("Second Test")
    public void testSecond() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("", computerRepairRequest.getPhoneNumber());
        assertEquals("", computerRepairRequest.getModel());
        computerRepairRequest.setPhoneNumber("test");
        computerRepairRequest.setModel("test");
        assertEquals("test", computerRepairRequest.getPhoneNumber());
        assertEquals("test", computerRepairRequest.getModel());
    }
    

      
}
