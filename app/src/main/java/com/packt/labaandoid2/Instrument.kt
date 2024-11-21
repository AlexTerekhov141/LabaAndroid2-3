package com.packt.labaandoid2

/*
 * Instrument
 *
 * Класс, представляющий объект музыкального инструмента.
 * Используется для хранения информации о каждом элементе списка в RecyclerView.
 */

data class Instrument(
    val name: String,
    val imageRes: Int
)