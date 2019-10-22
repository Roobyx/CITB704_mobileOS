package com.rbx.ut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.rbx.ut.Course.CourseAddActivity
import com.rbx.ut.Course.CourseAdapter
import com.rbx.ut.Course.Course

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(toolbar)

//		val courses = ArrayList<Course>()
//		courses.add(
//            Course(
//                "Операционни системи за мобилни устройства",
//                "CITB704",
//                "314 I",
//                "08:00 - 09:30"
//            )
//        )

		val db = Room.databaseBuilder(
			applicationContext,
			AppDatabase::class.java, "production").allowMainThreadQueries().build()

//        val db = Room.databaseBuilder(
//            applicationContext,
//            AppDatabase::class.java, "todo-list.db"
//        ).build()

		val courses: List<Course> = db.courseDao().getAllCourses()

//		db.courseDao().insertAll(
//			Course(
//				"Генератори на компютърни игри",
//				"CITB603",
//				"702 II",
//				"18:00 - 19:30"
//		  )
//		)


		home_recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
		home_recyclerView.adapter = CourseAdapter(courses)

		fab.setOnClickListener {
			Intent(this, CourseAddActivity::class.java).also(this::startActivity)
		}
	}

	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		// Inflate the menu; this adds items to the action bar if it is present.
		menuInflater.inflate(R.menu.menu_main, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			R.id.action_settings -> true
			else -> super.onOptionsItemSelected(item)
		}
	}
}
