// "Create annotation 'bar'" "true"
// ERROR: Unresolved reference: foo

[foo(1, "2", bar("3", 4))] fun test() {

}

annotation class bar(val s: String, val i: Int)