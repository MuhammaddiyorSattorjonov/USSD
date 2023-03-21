package com.example.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussd.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    lateinit var binding: FragmentAboutBinding
    lateinit var myTemplate: MyTemplate
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutBinding.inflate(layoutInflater)

        myTemplate = arguments?.getSerializable("keyTemp") as MyTemplate

        binding.apply {
            name.text = myTemplate.name
            about.text = myTemplate.about
            cod.text = myTemplate.code
        }
        return binding.root
    }
}