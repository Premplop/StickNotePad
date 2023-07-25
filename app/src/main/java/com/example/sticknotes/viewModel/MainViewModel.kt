package com.example.sticknotes.viewModel

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var count = 0
    fun add(){
        count++
        Log.d(TAG, "add: $count")
    }
}