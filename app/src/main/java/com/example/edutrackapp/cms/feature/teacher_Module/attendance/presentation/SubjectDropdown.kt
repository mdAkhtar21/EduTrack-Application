package com.example.edutrackapp.cms.feature.teacher_Module.attendance.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun SubjectDropdown(
    subjects: List<SubjectUiModel>,
    selectedId: Int,
    onSelected: (Int) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val selected = subjects.find { it.id == selectedId }
    val displayText = selected?.let { "${it.name} (${it.branch})" } ?: "Select Subject"

    Box {
        OutlinedButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Text(displayText)
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            subjects.forEach { subject ->
                DropdownMenuItem(
                    text = { Text("${subject.name} (${subject.branch})") },
                    onClick = {
                        onSelected(subject.id)
                        expanded = false
                    }
                )
            }
        }
    }
}