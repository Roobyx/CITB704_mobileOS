package com.rbx.ut

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CourseModel constructor(
    @ColumnInfo(name = "course_name")
    val courseName: String,
    @ColumnInfo(name = "course_signature")
    val signature:String,
    @ColumnInfo(name = "course_room")
    val room: String,
    @ColumnInfo(name = "course_time")
    val time:String
    ) {

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
}