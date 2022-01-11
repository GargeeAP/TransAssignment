import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {

    //1. create a basic junit test
    @Test
    public void addNum() {
        UnitTesting unit = new UnitTesting();
        int result = unit.addNum(2,4);
        System.out.println(result);
        assertEquals(6,result);
    }
}