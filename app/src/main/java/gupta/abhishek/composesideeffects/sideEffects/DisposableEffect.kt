package gupta.abhishek.composesideeffects.sideEffects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
//👉 Do setup & cleanup when the composable enters/leaves composition.
@Composable
fun DisposableEffectExample() {
    DisposableEffect(Unit) {
        println("Start camera")
        onDispose {
            println("Stop camera")
        }
    }
}
