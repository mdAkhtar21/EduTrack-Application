package com.example.edutrackapp.data.Attendence

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.Date

@Entity(tableName = "student_attendance")
data class StudentAttendance(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val Branch:String,
    val RollNo:Int,
    val date: Date,
    val time:Time,
    val isPresent:Boolean
)