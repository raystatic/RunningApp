package com.running.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.running.runningapp.R
import com.running.runningapp.ui.viewmodels.MainViewModel
import com.running.runningapp.ui.viewmodels.StatisticViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics){

    private val viewModel : StatisticViewModel by viewModels()

}