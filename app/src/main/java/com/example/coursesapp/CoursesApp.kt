package com.example.coursesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Grain
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursesapp.data.DataSource
import com.example.coursesapp.model.CoursesClass
import com.example.coursesapp.ui.theme.CoursesAppTheme

@Composable
fun CoursesApp() {
    CoursesAppTheme {
        CoursesList(courseList = DataSource.topics())
    }
}

@Composable
fun CoursesList(
    courseList: List<CoursesClass>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(8.dp)
    ) {
        items(courseList) { course ->
            CoursesCard(course = course)
        }
    }
}

// Card
@Composable
fun CoursesCard(
    course: CoursesClass,
    modifier: Modifier = Modifier
) {
    ElevatedCard(
        modifier = modifier
            .size(width = 200.dp, height = 84.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = course.imageResId),
                contentDescription = stringResource(id = course.stringResId),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(width = 88.dp, height = 88.dp)
                    .clip(RoundedCornerShape(4.dp))
            )
            Column {
                Text(
                    text = stringResource(id = course.stringResId),
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            top = 16.dp,
                            end = 16.dp,
                            bottom = 8.dp
                        )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        Icons.Rounded.Grain,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .size(12.dp)
                    )
                    Text(
                        text = course.uniqueNumber.toString(),
                        modifier = Modifier
                            .padding(start = 16.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PrevCard() {
    CoursesCard(
        course = CoursesClass(R.string.architecture, 58, R.drawable.architecture))
}