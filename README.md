# kotlin-android-tests
Sample project to reproduce the issue with mockito, kotlin and android instrumentation tests, and try out possible solutions

Here's the issue and two alternatives to fix it:
https://github.com/mockito/mockito/issues/1082

## Solution 1: DexOpener
https://github.com/Sloy/kotlin-android-tests/commit/d38f1ba60976d4a96b338823cf0be33b10d7326f

## Solution 2: AllOpen
https://github.com/Sloy/kotlin-android-tests/commit/25a4d9cf8bc9c3e6fdb89e1196744fa3827f1da3
