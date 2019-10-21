package com.rbx.ut

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CourseModel constructor(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "course_name")
    private val courseName: String,
    @ColumnInfo(name = "course_signature")
    private val signature:String,
    @ColumnInfo(name = "course_room")
    private val room: String,
    @ColumnInfo(name = "course_time")
    private val time:String)