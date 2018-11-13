package ava

import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.js.Promise

internal fun <T> toPromise(coroutine: suspend () -> T): Promise<T> {
    return Promise { resolve, reject ->
        coroutine.startCoroutine(object : Continuation<T> {
            override val context = EmptyCoroutineContext
            override fun resumeWith(result: Result<T>) {
                if (result.isSuccess) {
                    resolve(result.getOrThrow())
                } else if (result.isFailure) {
                    reject(result.exceptionOrNull()!!)
                }
            }
        })
    }
}