package com.example.coursesapp.data

import com.example.coursesapp.R
import com.example.coursesapp.model.CoursesClass

object DataSource {
    fun topics(): List<CoursesClass> {
        return listOf(
            CoursesClass(R.string.architecture, 58, R.drawable.architecture),
            CoursesClass(R.string.crafts, 121, R.drawable.crafts),
            CoursesClass(R.string.business, 78, R.drawable.business),
            CoursesClass(R.string.culinary, 118, R.drawable.culinary),
            CoursesClass(R.string.design, 423, R.drawable.design),
            CoursesClass(R.string.fashion, 92, R.drawable.fashion),
            CoursesClass(R.string.film, 165, R.drawable.film),
            CoursesClass(R.string.gaming, 164, R.drawable.gaming),
            CoursesClass(R.string.drawing, 326, R.drawable.drawing),
            CoursesClass(R.string.lifestyle, 305, R.drawable.lifestyle),
            CoursesClass(R.string.music, 212, R.drawable.music),
            CoursesClass(R.string.painting, 172, R.drawable.painting),
            CoursesClass(R.string.photography, 321, R.drawable.photography),
            CoursesClass(R.string.tech, 118, R.drawable.tech))
    }
}