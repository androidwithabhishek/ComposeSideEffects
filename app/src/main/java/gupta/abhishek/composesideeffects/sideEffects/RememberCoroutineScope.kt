package gupta.abhishek.composesideeffects.sideEffects

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds

//👉 Get a scope tied to the composable lifecycle for launching coroutines from events.
@Composable
fun RememberCoroutineScopeExample() {
    val scope = rememberCoroutineScope()

    Button(onClick = {
        scope.launch (context = Dispatchers.IO){

            println("Button clicked, coroutine launched")

        }
    }) {

        Text("Click Me")
    }
}
