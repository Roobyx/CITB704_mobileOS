package com.rbx.ut

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rbx.ut.Course.Course
import com.rbx.ut.Course.CourseDao

@Database(entities = [Course::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
	abstract fun courseDao():CourseDao
}
