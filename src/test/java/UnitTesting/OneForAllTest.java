package UnitTesting;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.Assert.*;
import org.junit.jupiter.params.provider.CsvSource;
public class OneForAllTest {
    @ParameterizedTest
    @CsvSource({"1,-2,-3,TRUE","-6,0,5,TRUE","0,-5,78,TRUE"})
    public void ifOnlyOnePositiveThenTrue(int a, int b, int c, String expectedResult){
        String actualResult = OneForAll.checkPositive(a,b,c);
        assertEquals(expectedResult, actualResult);
    }
    @ParameterizedTest
    @CsvSource({"2,10,7,FALSE","2,3,5,FALSE", "-4, 0, -15,FALSE"})
    public void IfNeitherOrMoreThenOnePositiveThenFalse(int a, int b, int c, String expectedResult){
        String actualResult = OneForAll.checkPositive(a,b,c);
        assertEquals(expectedResult, actualResult);

    }
}
