package com.example.edutrackapp.cms.feature.teacher_Module.attendance.presentation

data class StudentUiModel(
    val id: Int,
    val name: String,
    val rollNo: Int,
    var isPresent: Boolean = true // Default is Present
)