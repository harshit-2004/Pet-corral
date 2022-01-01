package com.example.pet_corral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val RecyclerView: RecyclerView = findViewById(R.id.recyclerView)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        val titleList = ArrayList<String>()
        val descList = ArrayList<String>()
        val authList = ArrayList<String>()
        for (i in 0 until 100) {
            titleList.add("Title $i")
            descList.add("Desc $i")
            authList.add("Author $i")

        }
        val adaptor: Postadaptor = Postadaptor(titleList, descList, authList)
        RecyclerView.adapter=adaptor

    }
}