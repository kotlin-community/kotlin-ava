# `kotlin-ava`

A kotlin wrapper for Ava test runner.

## Installation

Download package from npm:
```bash
yarn add -D ava kotlin-ava babel-plugin-module-resolver
```

Then in your `settings.gradle` add:
```groovy
include ':kotlin-ava'
project(':kotlin-ava').projectDir = new File(rootProject.projectDir, './node_modules/kotlin-ava')
```

And finally in `build.gradle` add:
```groovy
dependencies {
    // ...
    testCompile project(":kotlin-ava")
}

compileTestKotlin2Js {
    kotlinOptions {
        outputFile = "${projectDir}/build/test.js"
        moduleKind = "commonjs"
        sourceMap = true
        sourceMapEmbedSources = "always"
    }
}
```

You also need to configure Ava, to do so edit Ava config, if you use `package.json` it should look like this:
```json
"ava": {
    "require": [
      "kotlin-ava/bootstrap"
    ],
    "babel": {
      "plugins": [
        ["module-resolver", {
          "alias": {
            "^main$": "./build/main"
          }
        }]
      ]
    }
  }
```

## Running tests

```bash
yarn ava ./build/test.js
```

## Example

```kotlin
package Some.Package

import ava.Suite
import ava.test
import kotlinx.coroutines.delay
import kotlin.test.Test

class SomeTest : Suite {
    @Test
    override fun run() {
        test("something should be truthy") {
            it.truthy(Some.thing)
        }

        test("something should equal") {
            it.equal("something", "something")
        }

        test.async("something should be true") {
            suspend {
                delay(10000)
                it.isTrue(something)
            }
        }
    }
}
```
