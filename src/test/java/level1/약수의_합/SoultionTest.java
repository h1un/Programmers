package level1.약수의_합;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoultionTest {

    Soultion soultion = new Soultion();
    @Test
    void solution() {

        Assert.assertEquals(soultion.solution(12),28);
    }
}
