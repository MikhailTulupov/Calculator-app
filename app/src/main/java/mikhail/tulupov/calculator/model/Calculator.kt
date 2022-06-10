package mikhail.tulupov.calculator.model

import kotlin.properties.Delegates

/**
 * Class [Calculator] calculate expressions.
 */
class Calculator {

    companion object {

        private const val OPERATOR_PLUS = "+"
        private const val OPERATOR_MINUS = "-"
        private const val OPERATOR_MULTIPLY = "*"
        private const val OPERATOR_DIVIDE = "/"

        /**
         * List of numbers and math operations.
         */
        private lateinit var tokens: List<String>

        /**
         * Pointer on current token.
         */
        private var position by Delegates.notNull<Int>()


        /**
         * This method calculate expression and returning calculation result.
         * @param tokens list of numbers and operations.
         * @return calculation result.
         */
        fun calculate(tokens: List<String>): Double {
            this.tokens = tokens
            position = 0
            return expression()
        }

        /**
         * This function recursive adds or subtracts the first and second term until
         * then pointer reaches the end of the list.
         */
        private fun expression(): Double {
            var first = term()
            while (position < tokens.size) {
                val operator = tokens[position]
                if (operator != OPERATOR_PLUS && operator != OPERATOR_MINUS)
                    break
                else
                    position++

                val second = term()
                if (operator == OPERATOR_PLUS)
                    first += second
                else if (operator == OPERATOR_MINUS)
                    first -= second
            }

            return first
        }

        /**
         *  This function recursive multiplies or divides the first and second term until
         *  then pointer reaches the end of the list.
         */
        private fun term(): Double {
            var first = factor()
            while (position < tokens.size) {
                val operator = tokens[position]
                if (operator != OPERATOR_MULTIPLY && operator != OPERATOR_DIVIDE)
                    break
                else
                    position++

                val second = factor()
                if (operator == OPERATOR_MULTIPLY)
                    first *= second
                else if (operator == OPERATOR_DIVIDE)
                    first /= second
            }

            return first
        }

        /**
         * This function return a number.
         */
        private fun factor(): Double {
            val result = tokens[position]
            position++
            return result.toDouble()
        }

        fun toPercent(number: Double): Double = number / 100.0
    }
}