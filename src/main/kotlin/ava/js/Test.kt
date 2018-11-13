package ava.js

import ava.TestContext
import kotlin.js.Promise

@JsModule("ava")
external fun test(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

@JsModule("ava")
external fun test(name: String?, implementation: (TestContext) -> Promise<Unit>): Unit = definedExternally