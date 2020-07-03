
import com.nix.builder.impl.EarthBuilder;
import com.nix.service.impl.EarthService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

public class EarthServiceTest {
    private EarthService earthService = new EarthService();
    private static EarthBuilder earthBuilder = new EarthBuilder();

    @BeforeAll
    static void before() {
        earthBuilder.build();
    }
    @Test
    void getAccelerationOfGravity() {
        assertEquals("9.8", new BigDecimal(earthService.getAccelerationOfGravity()).setScale(1,RoundingMode.DOWN).toString());
    }

}
