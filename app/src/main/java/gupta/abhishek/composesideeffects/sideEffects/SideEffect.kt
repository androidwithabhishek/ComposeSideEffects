package gupta.abhishek.composesideeffects.sideEffects

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//👉 Run non-suspending code after every recomposition, useful for syncing with external systems.
@Composable
fun SideEffect(count: () -> Unit) {
    SideEffect {
        println("Recomposition done, count = $count")
    }
    Text("Count: $count")
}
