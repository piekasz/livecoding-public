package pl.ppiekarski.vcoding;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SetupTest {

    @Test
    void testWorks(){
        var x = 5;

        x = 4;

        assertThat(x).isEqualTo(4);
    }
}
