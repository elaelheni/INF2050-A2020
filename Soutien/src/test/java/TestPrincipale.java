
import com.github.stefanbirkner.systemlambda.SystemLambda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrincipale {
    @Test
    public void systemExitAvecCodeErreurArbitraire() throws Exception {
        SystemLambda.catchSystemExit(() -> {
            Principale.validationNbrArguments(3);
        });
    }

    @Test
    public void systemExitAvecCodeErreurSelectionne0() throws Exception {
        int status = SystemLambda.catchSystemExit(() -> {
            Principale.validationNbrArguments(-1);
        });

        assertEquals(0, status);
    }

}
