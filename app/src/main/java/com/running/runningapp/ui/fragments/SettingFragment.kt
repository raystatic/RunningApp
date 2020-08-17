package com.running.runningapp.ui.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.running.runningapp.R
import com.running.runningapp.other.Constants.KEY_NAME
import com.running.runningapp.other.Constants.KEY_WEIGHT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_settings.*
import javax.inject.Inject

@AndroidEntryPoint
class SettingFragment : Fragment(R.layout.fragment_settings){

    @Inject
    lateinit var sharePref:SharedPreferences

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadFieldsFromSharedPref()
        btnApplyChanges.setOnClickListener {
            val success = applyChangesToSharedPref()
            if (success){
                Snackbar.make(view,"Saved changes", Snackbar.LENGTH_LONG).show()
            }else{
                Snackbar.make(view,"Please fill out all the fields", Snackbar.LENGTH_LONG).show()
            }
        }
    }

    private fun loadFieldsFromSharedPref(){
        val name = sharePref.getString(KEY_NAME,"")
        val weight = sharePref.getFloat(KEY_WEIGHT,80f)
        etName.setText(name)
        etWeight.setText(weight.toString())
    }

    private fun applyChangesToSharedPref() : Boolean{
        val name = etName.text.toString()
        val weight = etWeight.text.toString()

        if (name.isEmpty() || weight.isEmpty()){
            return false
        }
        sharePref.edit()
            .putString(KEY_NAME,name)
            .putFloat(KEY_WEIGHT, weight.toFloat())
            .apply()

        requireActivity().tvToolbarTitle.text = "Let's go, $name"
        return true
    }

}