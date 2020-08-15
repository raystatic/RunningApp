package com.running.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.running.runningapp.repositories.MainRepository

class StatisticViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
):ViewModel(){

}