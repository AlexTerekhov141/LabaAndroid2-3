package com.packt.labaandoid2

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val mTextView: TextView = itemView.findViewById(R.id.text_item)
    val mButtonView: Button = itemView.findViewById(R.id.my_button)
    val imageView: ImageView = itemView.findViewById(R.id.image_item)
}
