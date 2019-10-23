package com.rbx.ut.Course
import androidx.room.*

@Dao
interface CourseDao {
//	Main

	@Query("SELECT * FROM CoursesTable")
	fun getAllCourses():List<Course>

	@Insert
	fun insertAll(vararg courses:Course)

	@Delete
	fun delete(course: Course)

	@Update
	fun updateCourse(vararg courses: Course)

//    Additional
	@Query("DELETE FROM CoursesTable")
	fun clearCoursesTable()
}