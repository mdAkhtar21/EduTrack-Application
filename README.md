# 🎓 EduTrack - Smart Campus Management System

**EduTrack** is a comprehensive Android application designed to streamline college operations. Built entirely with **Kotlin** and **Jetpack Compose**, it connects Administrators, Teachers, and Students in a single digital ecosystem.

The standout feature is **Smart Attendance**, which uses Google ML Kit to automate student headcounts via Face Recognition.

## 🚀 Key Features

### 🔐 Role-Based Access Control
* **Admin:** Secure user management (Create Teacher/Student accounts).
* **Teacher:** Manage academic data, post notices, upload assignments (PDF), and enter results.
* **Student:** View attendance stats, download assignments, submit work, and check results.

### 🤖 AI-Powered Attendance
* Integrated **Google ML Kit (Face Detection)**.
* Teachers can scan the classroom using the camera to automatically count and mark present students.

### 📂 Academic Workflow
* **Assignments:** Teachers upload problem statements; Students upload PDF solutions.
* **Notices:** Real-time digital notice board.
* **Results & Timetable:** Organized academic records and schedule tracking.

## 🛠️ Tech Stack

* **Language:** Kotlin (100%)
* **UI Toolkit:** Jetpack Compose (Material 3 Design)
* **Architecture:** MVVM + Clean Architecture
* **Database:** Room Database (Offline-first source of truth)
* **Dependency Injection:** Dagger Hilt
* **Asynchronous:** Coroutines & Flow
* **AI/ML:** CameraX + Google ML Kit

## 📱 Screenshots
![Image](https://github.com/user-attachments/assets/38e80fb4-1c90-4042-958a-6ef8e9cacb33)

## 📱 App Screenshots

<table align="center">
  <tr>
    <td align="center">
      <img src="![Image](https://github.com/user-attachments/assets/22acbfdf-c449-4409-b4bf-de8da5e75351)" width="200" />
      <br />
      <b>Login & Splash</b>
    </td>
    <td align="center">
      <img src="YOUR_LINK_HERE_2" width="200" />
      <br />
      <b>Teacher Dashboard</b>
    </td>
    <td align="center">
      <img src="YOUR_LINK_HERE_3" width="200" />
      <br />
      <b>Smart Attendance (AI)</b>
    </td>
    <td align="center">
      <img src="YOUR_LINK_HERE_4" width="200" />
      <br />
      <b>Student Results</b>
    </td>
  </tr>
</table>
