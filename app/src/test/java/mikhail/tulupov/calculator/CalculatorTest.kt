package mikhail.tulupov.calculator

import mikhail.tulupov.calculator.model.Calculator
import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    @Test
    fun addsTest() {
        Assert.assertEquals(5.0, Calculator.calculate(listOf("2", "+", "3")), 0.1)
    }

    @Test
    fun subtractionTest() {
        Assert.assertEquals(7.0, Calculator.calculate(listOf("10", "-", "3")), 0.4)
    }

    @Test
    fun multiplyTest() {
        Assert.assertEquals(35.0, Calculator.calculate(listOf("5", "*", "7")), 0.1)
    }

    @Test
    fun divideTest() {
        Assert.assertEquals(1.0, Calculator.calculate(listOf("2.5", "/", "2.5")), 0.1)
    }

    @Test
    fun getPercentTest() {
        Assert.assertEquals(0.09, Calculator.toPercent(9.0), 0.1)
    }

    @Test
    fun hardExpressionTest() {
        Assert.assertEquals(
            5.0, Calculator.calculate(
                listOf("2", "+", "3", "*", "3", "/", "3")
            ), 0.1
        )
    }
}