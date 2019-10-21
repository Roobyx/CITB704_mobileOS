package com.rbx.ut

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_course.*

class AddCourse : AppCompatActivity() {

    private var courseName : String = i_addCourse_name.text.toString()
	private var courseSignature: String = i_addCourse_signature.text.toString()
	private var courseRoom: String = i_addCourse_room.text.toString()
	private var courseTime: String = i_addCourse_time.text.toString()

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