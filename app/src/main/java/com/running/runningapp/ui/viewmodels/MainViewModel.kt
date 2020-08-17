package com.running.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.running.runningapp.db.Run
import com.running.runningapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
):ViewModel(){

    val runSortedByDate = mainRepository.getAllRunsSortedByDate()

    fun insertRun(run:Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }

}