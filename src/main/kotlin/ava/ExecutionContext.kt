package ava

// TODO: add context
interface ExecutionContext {
    @JsName("title")
    val title: String

    @JsName("plan")
    fun plan(count: Int)

    @JsName("log")
    fun log(vararg values: Any)
}