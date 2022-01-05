package com.example.pet_corral

import android.view.LayoutInflater
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class Postadaptor(private val titleList:ArrayList<String>, private  val descList:ArrayList<String>, private val authList:ArrayList<String>):RecyclerView.Adapter<Postadaptor.PostViewHolder>() {
    inner class PostViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val title:TextView=view.findViewById(R.id.textView)
        val desc:TextView=view.findViewById(R.id.textView2)
        val author:TextView=view.findViewById(R.id.textView3)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.title.text=titleList[position]
        holder.desc.text=descList[position]
        holder.author.text=authList[position]
    }

    override fun getItemCount(): Int {
        return titleList.size
    }
}