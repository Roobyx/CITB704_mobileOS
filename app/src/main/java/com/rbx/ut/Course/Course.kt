package com.rbx.ut.Course

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CoursesTable")
class Course (
    @ColumnInfo(name = "course_name") var courseName: String,

	@ColumnInfo(name = "course_signature") var signature:String,

	@ColumnInfo(name = "course_room") var room:String,

	@ColumnInfo(name = "course_time") var time:String
	) {

    @PrimaryKey(autoGenerate = true) var id: Int = 0
}