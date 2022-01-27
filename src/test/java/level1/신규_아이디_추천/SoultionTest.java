package level1.신규_아이디_추천;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoultionTest {

    Soultion soultion = new Soultion();

    @Test
    void solution() {
        Assert.assertEquals(soultion.solution("...!@BaT#*..y.abcdefghijklm"), "bat.y.abcdefghi");

    }
}
