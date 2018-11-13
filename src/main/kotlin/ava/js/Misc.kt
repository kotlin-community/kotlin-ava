@file:JsModule("ava")

package ava.js

import ava.TestContext

// TODO: missing API

external fun only(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun skip(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun todo(name: String): Unit = definedExternally

external fun failing(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun before(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun after(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun beforeEach(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

external fun afterEach(name: String?, implementation: (TestContext) -> Unit): Unit = definedExternally

