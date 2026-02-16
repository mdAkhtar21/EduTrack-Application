package com.example.edutrackapp.Domain.repository

import com.example.edutrackapp.Domain.Model.Attendance
import com.example.edutrackapp.Domain.Model.Student
import com.example.edutrackapp.Domain.Model.Subject



interface AttendanceRepository {
    suspend fun getStudentsForFaculty(facultyId: Int, semester: Int, section: String): List<Student>
    suspend fun getSubjectsForFaculty(facultyId: Int): List<Subject>
    suspend fun insertAttendance(attendance: List<Attendance>)
    suspend fun getAttendanceForStudent(studentId: Int, subjectId: Int): List<Attendance>
    suspend fun getAttendancePercentage(studentId: Int, subjectId: Int): Double
}
