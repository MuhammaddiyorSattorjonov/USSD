package com.example.ussd

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ussd.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.apply {
            tariflar.setOnClickListener {
                findNavcontrol(0)
            }
            daqiqalar.setOnClickListener {
                findNavcontrol(1)
            }
            internet.setOnClickListener {
                findNavcontrol(2)
            }
            xizmatlar.setOnClickListener {
                findNavcontrol(3)
            }
            sms.setOnClickListener {
                findNavcontrol(4)
            }
            yangiliklar.setOnClickListener {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://uzmobile.ru/")))
            }
        }
        return binding.root
    }
    private fun findNavcontrol(code:Int){
        findNavController().navigate(R.id.listFragment, bundleOf("key" to code))
    }
}