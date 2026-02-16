package com.example.edutrackapp.data.Attendence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "faculty")
data class Faculty(
    @PrimaryKey(autoGenerate=true)
    val facultyId: Int = 0,
    val name: String,
    val email: String,
    val password: String
)