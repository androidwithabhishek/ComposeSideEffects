import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState

@Composable
fun ProduceStateExample(userId: String) {
    val userName by produceState<String?>(initialValue = null, key1 = userId) {
        // Runs in a coroutine; restarts if userId changes
        value = fetchUserName(userId) // suspend function
    }

    if (userName == null) {
        CircularProgressIndicator()
    } else {
        Text("Hello, $userName")
    }
}

// Dummy suspend for illustration
suspend fun fetchUserName(id: String): String {
    // e.g., network/db call on IO dispatcher inside produceState
    return "User-$id"
}
