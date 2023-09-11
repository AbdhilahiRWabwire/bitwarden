package com.x8bit.bitwarden.ui.platform.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Component that allows the user to input text. This composable will manage the state of
 * the user's input.
 *
 * @param label label for the text field.
 * @param initialValue initial input text.
 * @param onTextChange callback that is triggered when the input of the text field changes.
 *
 * TODO: remove deprecated version: BIT-289
 */
@Deprecated(message = "Use overloaded BitwardenTextField that takes an input instead of an initialText.")
@Composable
fun BitwardenTextField(
    label: String,
    initialValue: String = "",
    onTextChange: (String) -> Unit = {},
) {
    var input by remember { mutableStateOf(initialValue) }
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        label = { Text(text = label) },
        value = input,
        onValueChange = {
            input = it
            onTextChange.invoke(it)
        },
    )
}

/**
 * Component that allows the user to input text. This composable will manage the state of
 * the user's input.
 * @param label label for the text field.
 * @param value current next on the text field.
 * @param modifier modifier for the composable.
 * @param onValueChange callback that is triggered when the input of the text field changes.
 */
@Composable
fun BitwardenTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        label = { Text(label) },
        value = value,
        onValueChange = onValueChange,
    )
}