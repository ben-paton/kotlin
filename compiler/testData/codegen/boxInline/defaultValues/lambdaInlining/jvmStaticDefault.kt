// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS_IR
// FILE: 1.kt
// SKIP_INLINE_CHECK_IN: inlineFun$default
// IGNORE_BACKEND: JS, NATIVE
//WITH_RUNTIME
package test

object X {
    @JvmStatic
    inline fun inlineFun(capturedParam: String, lambda: () -> String = { capturedParam }): String {
        return lambda()
    }
}

// FILE: 2.kt

import test.*

fun box(): String {
    return X.inlineFun("OK")
}
