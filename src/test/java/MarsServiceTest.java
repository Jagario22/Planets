
import com.nix.builder.impl.MarsBuilder;
import com.nix.service.impl.MarsService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class MarsServiceTest {
    private MarsService marsService = new MarsService();
    private static MarsBuilder marsBuilder = new MarsBuilder();

    @BeforeAll
    static void before() {
        marsBuilder.build();
    }
    @Test
    void getAccelerationOfGravity() {
        assertEquals("3.7", new BigDecimal(marsService.getAccelerationOfGravity()).setScale(1,RoundingMode.DOWN).toString());
    }

}
