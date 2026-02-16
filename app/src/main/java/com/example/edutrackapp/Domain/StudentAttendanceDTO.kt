package com.example.edutrackapp.Domain

data class AttendanceReportDTO(
    val studentName: String,
    val rollNo: Int,
    val subjectName: String,
    val facultyName: String,
    val lecturePeriod: Int,
    val date: String,
    val isPresent: Boolean,
    val attendancePercentage: Double
)
