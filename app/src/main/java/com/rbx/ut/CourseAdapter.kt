package com.rbx.ut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.course_row.view.*

class CourseAdapter(private val courseList: ArrayList<CourseModel>) : RecyclerView.Adapter<CourseAdapter.ViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val v = LayoutInflater.from(parent.context).inflate(R.layout.course_row, parent, false)
		return ViewHolder(v)
	}

	override fun getItemCount(): Int {
		return courseList.size
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bindItems(courseList[position])
	}

	class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
		fun bindItems(course: CourseModel) {

			itemView.label_cr_course_signature.text = course.signature
			itemView.label_cr_course_name.text = course.courseName
			itemView.label_cr_course_room.text = course.room
			itemView.label_cr_course_time.text = course.time
		}
	}

}
