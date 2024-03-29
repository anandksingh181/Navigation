package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding : FragmentTitleBinding = DataBindingUtil.inflate(
            inflater , R.layout.fragment_title , container , false)

//        binding.playButton.setOnClickListener { view:View->
//
//             Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
//        //           view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
//        }

        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )

        return binding.root
    }


}