package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CoursesClass(
    @StringRes val stringResId: Int,
    val uniqueNumber: Int,
    @DrawableRes val imageResId: Int
)