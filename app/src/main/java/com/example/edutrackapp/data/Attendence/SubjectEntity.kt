package com.example.edutrackapp.data.Attendence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class SubjectEntity(
    @PrimaryKey(autoGenerate = true)
    val subjectId: Int = 0,
    val subjectName: String,
    val semester: Int,
    val branch: String
)