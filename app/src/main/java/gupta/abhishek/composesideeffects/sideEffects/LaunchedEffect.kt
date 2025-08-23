package gupta.abhishek.composesideeffects.sideEffects

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
//👉 Run suspend functions when entering composition or when key changes.
@Composable
fun LaunchedEffectExample(userId: String) {
    LaunchedEffect(userId) {
        // Runs whenever userId changes
        println("Fetching user with id = $userId")
    }
}
