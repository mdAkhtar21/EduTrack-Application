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
fun LecturePeriodDropdown(selected: Int, onSelected: (Int) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxWidth()) {
        OutlinedButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Text("Lecture Period: P$selected")
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            (1..6).forEach { period ->
                DropdownMenuItem(
                    text = { Text("P$period") },
                    onClick = { onSelected(period); expanded = false }
                )
            }
        }
    }
}