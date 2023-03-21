package com.example.ussd

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.ussd.databinding.ItemListBinding
import java.util.*
import kotlin.collections.ArrayList

class RvAdapter(val list:kotlin.collections.List<MyTemplate>,val rvClick: RvClick): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding:ItemListBinding): RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(user: MyTemplate,position: Int){
            itemRvBinding.tvName.text = user.name
            itemRvBinding.tvCode.text = user.code
            itemRvBinding.tvAbout.text = user.price

            itemRvBinding.root.setOnClickListener{rvClick.itemClick(user)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
    interface RvClick{
        fun itemClick(myTemplate: MyTemplate)
    }
}