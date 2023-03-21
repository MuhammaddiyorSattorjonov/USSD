package com.example.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ussd.databinding.FragmentListBinding

class ListFragment : Fragment(),RvAdapter.RvClick {
    lateinit var binding: FragmentListBinding
    var key = 0
    lateinit var adapter:RvAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        key = arguments?.getInt("key",0)!!

        when(key){
            0-> showTemp(MyData.listTarif)
            1-> showTemp(MyData.listDaqiqa)
            2-> showTemp(MyData.listInternet)
            3-> showTemp(MyData.listXizmat)
            4-> showTemp(MyData.listSms)
        }
        return binding.root
    }
    private fun showTemp(list:List<MyTemplate>){
        adapter = RvAdapter(list,this)
        binding.rvList.adapter = adapter
    }

    override fun itemClick(myTemplate: MyTemplate) {
        findNavController().navigate(R.id.aboutFragment, bundleOf("keyTemp" to myTemplate))
    }
}