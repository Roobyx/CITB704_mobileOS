package com.rbx.ut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(toolbar)

		val courses = ArrayList<ModelDetails>()
		courses.add(ModelDetails("Операционни системи за мобилни устройства", "CITB704", "314 I", "08:00 - 09:30"))
		courses.add(ModelDetails("Генератори на компютърни игри", "CITB603", "702 II", "18:00 - 19:30"))

		val adapter = CourseAdapter(courses)
		home_recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
		home_recyclerView.adapter = adapter

		fab.setOnClickListener {
			Intent(this, AddCourse::class.java).also(this::startActivity)
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
