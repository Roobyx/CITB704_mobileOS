package com.rbx.ut

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_course.*

class AddCourse : AppCompatActivity() {

	private val courseName: String get() = i_addCourse_name.text.toString()
	private val courseSignature: String get() = i_addCourse_signature.text.toString()
	private val courseRoom: String get() = i_addCourse_room.text.toString()
	private val courseTime: String get() = i_addCourse_time.text.toString()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.add_course)
		setSupportActionBar(toolbar)

		b_addCourse_add.setOnClickListener {
            println("Name: $courseName")
            println("Room: $courseRoom")
            println("Signature: $courseSignature")
            println("Time: $courseTime")
		}
	}
}