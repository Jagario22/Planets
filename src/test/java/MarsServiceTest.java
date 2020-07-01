
import com.nix.annotation.Service;
import com.nix.builder.AbstractBuilder;
import com.nix.builder.impl.EarthBuilder;
import com.nix.builder.impl.MarsBuilder;
import com.nix.config.Application;
import com.nix.config.ApplicationContext;
import com.nix.service.PlanetService;
import com.nix.service.impl.EarthService;
import com.nix.service.impl.MarsService;
import com.nix.view.PlanetReporter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

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
