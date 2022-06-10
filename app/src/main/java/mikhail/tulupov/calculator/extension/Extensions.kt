package mikhail.tulupov.calculator.extension

/**
 * This static method extension a [String] class for tokenization mathematical expression
 *
 * @param expression mathematical expression
 * @return list of tokens
 */
fun String.expressionToTokens(expression: String): List<String> {
    val regex = Regex("([0-9.]+)|([+-/*])")
    val matchers = regex.findAll(expression)
    val tokens = mutableListOf<String>()

    for (matcher in matchers) {
        tokens.add(matcher.value)
    }

    return tokens
}