package UnitTesting;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.*;
public class ChocolateTest {
    @ParameterizedTest
    @CsvSource({"4,2,6,YES","7,2,10,YES"})
    public void checkIfPossibleSplitThenYes(int n, int m, int k, String expectedResult){
        String actualResult = Chocolate.splitChocolate(n,m,k);
        assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @CsvSource({"2,10,7,NO","2,3,5,NO"})
    public void checkIfNotPossibleSplitThenNo(int n, int m, int k, String expectedResult){
        String actualResult = Chocolate.splitChocolate(n,m,k);
        assertEquals(expectedResult, actualResult);

    }
}
