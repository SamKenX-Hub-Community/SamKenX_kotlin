fun box(stepId: Int): String {
    val prop = testProp(B())
    if (prop != stepId) {
        return "Fail prop: $prop != $stepId"
    }

    val func = testFunc(B())
    if (func != stepId) {
        return "Fail func: $func != $stepId"
    }
    return "OK"
}
