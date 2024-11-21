package com.packt.labaandoid2


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView



class InstrumentAdapter(private val dataset: List<Instrument>) :
    RecyclerView.Adapter<MyViewHolder>() {

    // Создаем новый ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val instrument = dataset[position]

        // Устанавливаем текст
        holder.mTextView.text = instrument.name

        // Устанавливаем изображение
        holder.imageView.setImageResource(instrument.imageRes)

        // Добавляем действие для кнопки
        holder.mButtonView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Clicked on ${instrument.name}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    // Количество элементов в списке
    override fun getItemCount(): Int {
        return dataset.size
    }
}
