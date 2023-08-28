// IGNORE_BACKEND: WASM
// FILE: test.kt

fun foo(shouldThrow: Boolean) {
    try {
        if (shouldThrow) throw Exception()
    } catch (e: Exception) {
        "OK"
    }
    "OK"
}

fun box() {
    foo(false)
    foo(true)
}

// EXPECTATIONS JVM JVM_IR
// test.kt:14 box
// test.kt:5 foo
// test.kt:6 foo
// test.kt:10 foo
// test.kt:11 foo
// test.kt:15 box
// test.kt:5 foo
// test.kt:6 foo
// test.kt:7 foo
// test.kt:8 foo
// test.kt:10 foo
// test.kt:11 foo
// test.kt:16 box

// EXPECTATIONS JS_IR
// test.kt:14 box
// test.kt:6 foo
// test.kt:11 foo
// test.kt:15 box
// test.kt:6 foo
// test.kt:6 foo
// test.kt:7 foo
// test.kt:7 foo
// test.kt:11 foo
// test.kt:16 box
