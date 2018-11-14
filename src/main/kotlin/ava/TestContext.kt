package ava

// TODO: throwsAsync, notThrowsAsync
interface TestContext : ExecutionContext {
    @JsName("fail")
    fun fail(message: String? = null)

    @JsName("pass")
    fun pass(message: String? = null)

    @JsName("truthy")
    fun truthy(value: Any, message: String? = null)

    @JsName("falsy")
    fun falsy(value: Any, message: String? = null)

    @JsName("true")
    fun isTrue(value: Any, message: String? = null)

    @JsName("false")
    fun isFalse(value: Any, message: String? = null)

    @JsName("is")
    fun equal(value: Any, expected: Any, message: String? = null)

    @JsName("not")
    fun notEqual(value: Any, expected: Any, message: String? = null)

    @JsName("deepEqual")
    fun deepEqual(value: Any, expected: Any, message: String? = null)

    @JsName("notDeepEqual")
    fun notDeepEqual(value: Any, expected: Any, message: String? = null)

    @JsName("throws")
    fun throws(fn: () -> Any, expected: Any? = null, message: String? = null)

    @JsName("notThrows")
    fun notThrows(fn: () -> Any, message: String? = null)

    @JsName("regex")
    fun regex(contents: String, regex: Regex, message: String? = null)

    @JsName("notRegex")
    fun notRegex(contents: String, regex: Regex, message: String? = null)

    // TODO: support options parameter
    @JsName("snapshot")
    fun snapshot(expected: Any, message: String? = null)

}