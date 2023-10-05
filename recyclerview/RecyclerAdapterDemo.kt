package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterDemo(var list:MutableList<MyDataModel1>): RecyclerView.Adapter<RecyclerAdapterDemo.MyDemoHolder>() {
    class MyDemoHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var title: TextView  = itemView.findViewById(R.id.textView)
        var general: TextView  = itemView.findViewById(R.id.textView2)
        var year: TextView  = itemView.findViewById(R.id.textView3)
        var delete:Button = itemView.findViewById(R.id.button)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDemoHolder {
        val inflater=LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main2,
            parent, false)
        return MyDemoHolder(inflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyDemoHolder, position: Int) {
        val data=list[position]
        holder.title.text=data.getTitle()
        holder.general.text=data.getGenre()
        holder.year.text = data.getYear()
        holder.delete.setOnClickListener{
            list.removeAt(position)
        }
    }
}
