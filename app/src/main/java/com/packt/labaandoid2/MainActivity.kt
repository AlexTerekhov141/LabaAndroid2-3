package com.packt.labaandoid2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
/*
 * MainActivity
 *
 * Version 1.0
 *
 * November2024
 *
 * Practice work for android 2/3(приложение, работающее с RecyclerView/Kotlin)
 */
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Создание RecyclerView
        recyclerView = findViewById(R.id.my_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Устанавливаем адаптер
        recyclerView.adapter = InstrumentAdapter(generateContent())
    }


    private fun generateContent(): List<Instrument> {
        val content = mutableListOf<Instrument>()
        // Генерация списка
        for (i in 1..50) {
            val imageRes = resources.getIdentifier("image_$i", "drawable", packageName)
            val itemName = getString(R.string.item) + " $i"
            if (imageRes != 0) {
                content.add(Instrument(itemName, imageRes))
            } else {
                content.add(Instrument(itemName, R.drawable.guitar))
            }
        }
        // Возвращаем список
        return content
    }

}