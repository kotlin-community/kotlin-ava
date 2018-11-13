package ava

import kotlin.js.Promise
import ava.js.after as _after
import ava.js.afterEach as _afterEach
import ava.js.before as _before
import ava.js.beforeEach as _beforeEach
import ava.js.failing as _failing
import ava.js.only as _only
import ava.js.skip as _skip
import ava.js.test as _test
import ava.js.todo as _todo

object test {
    operator fun invoke(name: String?, implementation: (TestContext) -> Unit) {
        _test(name, implementation)
    }

    fun async(name: String?, implementation: (TestContext) -> suspend () -> Unit) {
        _test(name, fun(context: TestContext): Promise<Unit> = toPromise(implementation(context)))
    }

    fun only(name: String? = null, implementation: (TestContext) -> Unit) {
        _only(name, implementation)
    }

    fun skip(name: String? = null, implementation: (TestContext) -> Unit) {
        _skip(name, implementation)
    }

    fun todo(name: String) {
        _todo(name)
    }

    fun failing(name: String? = null, implementation: (TestContext) -> Unit) {
        _failing(name, implementation)
    }

    fun before(name: String? = null, implementation: (TestContext) -> Unit) {
        _before(name, implementation)
    }

    fun after(name: String? = null, implementation: (TestContext) -> Unit) {
        _after(name, implementation)
    }

    fun beforeEach(name: String? = null, implementation: (TestContext) -> Unit) {
        _beforeEach(name, implementation)
    }

    fun afterEach(name: String? = null, implementation: (TestContext) -> Unit) {
        _afterEach(name, implementation)
    }
}