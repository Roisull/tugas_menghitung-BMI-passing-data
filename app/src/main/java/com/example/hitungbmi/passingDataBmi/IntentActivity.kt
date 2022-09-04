package com.example.hitungbmi.passingDataBmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hitungbmi.R

class IntentActivity : AppCompatActivity() {
    lateinit var tvHasilUmur: TextView
    lateinit var tvHasilTinggi: TextView
    lateinit var tvHasilBerat: TextView
    lateinit var tvHasilBmi: TextView
    lateinit var tvHasilKategori: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        tvHasilUmur = findViewById(R.id.tv_hasil_umur)
        tvHasilTinggi = findViewById(R.id.tv_hasil_tinggi_badan)
        tvHasilBerat = findViewById(R.id.tv_hasil_berat_badan)
        tvHasilBmi = findViewById(R.id.tv_hasil_bmi)
        tvHasilKategori = findViewById(R.id.tv_hasil_kategori)

    }
}