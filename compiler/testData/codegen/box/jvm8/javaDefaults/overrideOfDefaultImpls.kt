// TARGET_BACKEND: JVM
// FILE: J.java

public interface J extends I<String> {
    default String foo(String x) { return x; }
}

// FILE: main.kt
// JVM_TARGET: 1.8
interface I<T> {
    fun foo(x: T): T = x
}

class K : J

fun box(): String {
    return K().foo("OK")
}
