// SKIP_KT_DUMP
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6

class ObjectAssert<ACTUAL> {
    fun describedAs(description: String?, vararg args: Any?): ObjectAssert<ACTUAL>? = null
}

object Assertions {
    fun <S> assertThat(actual: S): ObjectAssert<S> = ObjectAssert()
}

fun <T : Any> T?.assertNotNull(description: String? = null) {
    val assert = Assertions.assertThat(this)
    description?.let(assert::describedAs)
}
