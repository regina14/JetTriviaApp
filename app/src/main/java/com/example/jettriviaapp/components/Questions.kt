package com.example.jettriviaapp.components

import android.util.Log
import androidx.compose.runtime.Composable
import com.example.jettriviaapp.screens.QuestionViewModel

@Composable
fun Questions(viewModel: QuestionViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true) {
        Log.d("Loading", "Questions: ...Loading...")
    } else {
        questions?.forEach { questionItem ->
            Log.d("Result", "Questions: ${questionItem.question}")
        }
    }
    Log.d("SIZE", "Questions: ${questions?.size}")
}