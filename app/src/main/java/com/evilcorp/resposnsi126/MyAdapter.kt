package com.evilcorp.resposnsi126

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mCtx:Context, var resources:Int, var itema:List<Model>):ArrayAdapter<Model>(mCtx, resources, itema) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources,null)
        val imageView:ImageView = view.findViewById(R.id.image)
        val tittleTextView:TextView = view.findViewById(R.id.textView1)
        val descriptionTextView:TextView = view.findViewById(R.id.textView2)

        var mItem:Model = itema[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        tittleTextView.text = mItem.title
        descriptionTextView.text = mItem.description



        return view
    }
}