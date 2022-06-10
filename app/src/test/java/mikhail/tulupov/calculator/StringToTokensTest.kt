package mikhail.tulupov.calculator

import mikhail.tulupov.calculator.extension.expressionToTokens
import org.junit.Assert
import org.junit.Test

class StringToTokensTest {
    @Test
    fun expressionToTokensTest() {
        Assert.assertEquals(
            listOf("2", "+", "3", "*", "3", "/", "3"),
            String().expressionToTokens("2+3*3/3"))
    }
}