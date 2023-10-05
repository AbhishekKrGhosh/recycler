package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adap: RecyclerAdapterDemo
    private val list=ArrayList<MyDataModel1>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv:RecyclerView=findViewById(R.id.recyclerView)
        val layoutManager=LinearLayoutManager(applicationContext)
        rv.layoutManager=(layoutManager)
        rv.itemAnimator=DefaultItemAnimator()
        adap=RecyclerAdapterDemo(list)
        rv.adapter=adap
        call()
    }
    fun call(){
        list.add(MyDataModel1("sem1","Cgpa 9.0", "2019"))
        list.add(MyDataModel1("sem2","Cgpa 9.1", "2019"))
        list.add(MyDataModel1("sem3","Cgpa 9.2 ", "2020"))
        list.add(MyDataModel1("sem4","Cgpa 9.3", "2020"))
        list.add(MyDataModel1("sem5","Cgpa 9.4", "2021"))
        list.add(MyDataModel1("sem6","Cgpa 9.5", "2021"))
        adap.notifyDataSetChanged()
    }
}