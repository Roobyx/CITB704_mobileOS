package com.rbx.ut.Course

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.rbx.ut.AppDatabase
import com.rbx.ut.MainActivity
import com.rbx.ut.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_course.*

class CourseAddActivity : AppCompatActivity() {
	private val courseName: String get() = i_addCourse_name.text.toString()
	private val courseSignature: String get() = i_addCourse_signature.text.toString()
	private val courseRoom: String get () = i_addCourse_room.text.toString()
	private val courseTime: String get() = i_addCourse_time.text.toString()


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContentView(R.layout.add_course)
		setSupportActionBar(toolbar)


        val db = Room.databaseBuilder(
			applicationContext,
			AppDatabase::class.java, "production").allowMainThreadQueries().build()


		b_addCourse_add.setOnClickListener {

            db.courseDao().insertAll(
                Course(
                    courseName,
                    courseSignature,
                    courseRoom,
                    courseTime
              )
            )

            Intent(this, MainActivity::class.java).also(this::startActivity)

		}
	}
}