package gupta.abhishek.composesideeffects.sideEffects

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun DerivedStateOfExample() {
    var items by remember { mutableStateOf(listOf(1, 2, 3)) }
    val itemCount by remember { derivedStateOf { items.size } }

    Column {
        Text("Items count: $itemCount")
        Button(onClick = { items = items + (items.size + 1) }) {
            Text("Add Item")
        }
    }
}
