package UnitTesting;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class CheckGivenNumbersTest {
    @Test
    public void checkIfDifferentThenTrue(){
        assertTrue(CheckGivenNumbers.checkGivenNumbers(5,6,7));
    }
    @Test
    public void checkIfNotDifferentThenFalse(){
        assertFalse(CheckGivenNumbers.checkGivenNumbers(5,5,7));
    }
    @ParameterizedTest
    @CsvSource({"1,2,3","4,5,6","7,8,9","100,194,256"})
    public void ifNumbersDifferentThenTrue(int a, int b, int c){
        assertTrue(CheckGivenNumbers.checkGivenNumbers(a,b,c));
    }
    @ParameterizedTest
    @CsvSource({"1,1,3","25,25,6","78,78,78","100,194,194"})
    public void ifNumbersNotDifferentThenFalse(int a, int b, int c){
        assertFalse(CheckGivenNumbers.checkGivenNumbers(a,b,c));
    }
}
