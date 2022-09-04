package com.example.hitungbmi.passingDataBmi

import com.example.hitungbmi.dataClass.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hitungbmi.R
import com.example.hitungbmi.dataClass.PersonPar

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

        val bundle = intent.extras
        val buBundle = bundle

        val dataPerson = intent.getSerializableExtra("AN_OBJECT") as Person
        val pePerson = dataPerson

        val dataPersonPar = intent.getParcelableExtra<PersonPar>("dataPersonPar") as PersonPar
        val pePersonpar = dataPersonPar


        if (buBundle != null){
            tvHasilUmur.setText(bundle.getString("umur"))
            tvHasilTinggi.setText(bundle.getString("tinggi"))
            tvHasilBerat.setText(bundle.getString("berat"))

            val tinggiToDouble = tvHasilTinggi.toString().toDouble()
            val beratToDouble = tvHasilBerat.toString().toDouble()
            val tinggiToM = tinggiToDouble / 100

            val totalBmi = beratToDouble / (tinggiToM * tinggiToM)
            tvHasilBmi.text = totalBmi.toString().trim()

            if (totalBmi < 15.9){
                tvHasilKategori.text = "Terlalu Kurus"
            }else if (totalBmi in 16.0..17.0){
                tvHasilKategori.text = "Cukup Kurus"
            }else if (totalBmi in 17.1..18.5){
                tvHasilKategori.text = "Sedikit Kurus"
            }else if (totalBmi in 18.6..24.9){
                tvHasilKategori.text = "Normal"
            }else if (totalBmi in 25.0..30.0){
                tvHasilKategori.text = "Gemuk"
            }else if (totalBmi in 30.1..35.0){
                tvHasilKategori.text = "Obesitas kelas 1"
            }else if (totalBmi in 35.1..40.0){
                tvHasilKategori.text = "Obesitas kelas 2"
            }else{
                tvHasilKategori.text = "Obesitas kelas 3"
            }

        }else if (pePerson != null){
            tvHasilUmur.setText(dataPerson.umurPerson.trim())
            tvHasilTinggi.setText(dataPerson.tinggiBadanPerson.trim())
            tvHasilBerat.setText(dataPerson.beratBadanPerson.trim())
            val tinggiToDouble = tvHasilTinggi.toString().toDouble()
            val beratToDouble = tvHasilBerat.toString().toDouble()
            val tinggiToM = tinggiToDouble / 100

            val totalBmi = beratToDouble / (tinggiToM * tinggiToM)
            tvHasilBmi.text = totalBmi.toString().trim()

            if (totalBmi < 15.9){
                tvHasilKategori.text = "Terlalu Kurus"
            }else if (totalBmi in 16.0..17.0){
                tvHasilKategori.text = "Cukup Kurus"
            }else if (totalBmi in 17.1..18.5){
                tvHasilKategori.text = "Sedikit Kurus"
            }else if (totalBmi in 18.6..24.9){
                tvHasilKategori.text = "Normal"
            }else if (totalBmi in 25.0..30.0){
                tvHasilKategori.text = "Gemuk"
            }else if (totalBmi in 30.1..35.0){
                tvHasilKategori.text = "Obesitas kelas 1"
            }else if (totalBmi in 35.1..40.0){
                tvHasilKategori.text = "Obesitas kelas 2"
            }else{
                tvHasilKategori.text = "Obesitas kelas 3"
            }

        }else if (pePersonpar != null){
            tvHasilUmur.text = dataPersonPar.umurPerson
            tvHasilTinggi.text = dataPersonPar.tinggiPerson
            tvHasilBerat.text = dataPersonPar.beratPerson

            val tinggiToDouble = tvHasilTinggi.toString().toDouble()
            val beratToDouble = tvHasilBerat.toString().toDouble()
            val tinggiToM = tinggiToDouble / 100

            val totalBmi = beratToDouble / (tinggiToM * tinggiToM)
            tvHasilBmi.text = totalBmi.toString().trim()
            if (totalBmi < 15.9){
                tvHasilKategori.text = "Terlalu Kurus"
            }else if (totalBmi in 16.0..17.0){
                tvHasilKategori.text = "Cukup Kurus"
            }else if (totalBmi in 17.1..18.5){
                tvHasilKategori.text = "Sedikit Kurus"
            }else if (totalBmi in 18.6..24.9){
                tvHasilKategori.text = "Normal"
            }else if (totalBmi in 25.0..30.0){
                tvHasilKategori.text = "Gemuk"
            }else if (totalBmi in 30.1..35.0){
                tvHasilKategori.text = "Obesitas kelas 1"
            }else if (totalBmi in 35.1..40.0){
                tvHasilKategori.text = "Obesitas kelas 2"
            }else{
                tvHasilKategori.text = "Obesitas kelas 3"
            }

        }else{
            tvHasilUmur.setText(intent.getStringExtra("umur"))
            tvHasilTinggi.setText(intent.getStringExtra("tinggi"))
            tvHasilBerat.setText(intent.getStringExtra("berat"))

            val tinggiToDouble = tvHasilTinggi.toString().toDouble()
            val beratToDouble = tvHasilBerat.toString().toDouble()
            val tinggiToM = tinggiToDouble / 100

            val totalBmi = beratToDouble / (tinggiToM * tinggiToM)
            tvHasilBmi.text = totalBmi.toString().trim()
            if (totalBmi < 15.9){
                tvHasilKategori.text = "Terlalu Kurus"
            }else if (totalBmi in 16.0..17.0){
                tvHasilKategori.text = "Cukup Kurus"
            }else if (totalBmi in 17.1..18.5){
                tvHasilKategori.text = "Sedikit Kurus"
            }else if (totalBmi in 18.6..24.9){
                tvHasilKategori.text = "Normal"
            }else if (totalBmi in 25.0..30.0){
                tvHasilKategori.text = "Gemuk"
            }else if (totalBmi in 30.1..35.0){
                tvHasilKategori.text = "Obesitas kelas 1"
            }else if (totalBmi in 35.1..40.0){
                tvHasilKategori.text = "Obesitas kelas 2"
            }else{
                tvHasilKategori.text = "Obesitas kelas 3"
            }

        }
    }
}