package com.example.edutrackapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.edutrackapp.data.Attendence.AttendanceEntity
import com.example.edutrackapp.data.Attendence.StudentEntity
import com.example.edutrackapp.data.Attendence.SubjectEntity

@Dao
interface AttendanceDao {

    // --- Students ---
    @Query("""
        SELECT * FROM students
        WHERE semester = :semester AND section = :section
    """)
    suspend fun getStudents(semester: Int, section: String): List<StudentEntity>

    // --- Subjects ---
    @Query("""
        SELECT * FROM subjects
        WHERE semester = :semester AND branch = :branch
    """)
    suspend fun getSubjects(semester: Int, branch: String): List<SubjectEntity>

    // --- Attendance ---
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttendance(attendance: List<AttendanceEntity>)

    @Query("""
        SELECT * FROM attendance
        WHERE studentId = :studentId AND subjectId = :subjectId
    """)
    suspend fun getAttendanceForStudent(studentId: Int, subjectId: Int): List<AttendanceEntity>

    @Query("""
        SELECT (SUM(CASE WHEN isPresent = 1 THEN 1 ELSE 0 END) * 100.0) / COUNT(*)
        FROM attendance
        WHERE studentId = :studentId AND subjectId = :subjectId
    """)
    suspend fun getAttendancePercentage(studentId: Int, subjectId: Int): Double
}
