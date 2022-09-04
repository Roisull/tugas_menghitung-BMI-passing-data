package com.example.hitungbmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.hitungbmi.dataClass.Person
import com.example.hitungbmi.dataClass.PersonPar
import com.example.hitungbmi.passingDataBmi.IntentActivity

class MainActivity : AppCompatActivity() {

    lateinit var etInputUmur: EditText
    lateinit var etInputTinggiBadan: EditText
    lateinit var etInputBeratBadan: EditText
    lateinit var btnReset: Button
    lateinit var btnIntent: Button
    lateinit var btnBundle: Button
    lateinit var btnSerializable: Button
    lateinit var btnParcelable: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etInputUmur = findViewById(R.id.et_input_umur)
        etInputTinggiBadan = findViewById(R.id.et_input_tinggi_badan)
        etInputBeratBadan = findViewById(R.id.et_input_berat_badan)
        btnReset = findViewById(R.id.btn_reset)
        btnIntent = findViewById(R.id.btn_pass_intent)
        btnBundle = findViewById(R.id.btn_pass_bundle)
        btnSerializable = findViewById(R.id.btn_pass_serializable)
        btnParcelable = findViewById(R.id.btn_pass_parcelable)

        // action btn reset
        btnReset.setOnClickListener {
            resetBmi()
        }

    }

    private fun resetBmi(){
        etInputUmur.text = null
        etInputTinggiBadan.text = null
        etInputBeratBadan.text = null
    }

    fun buttonIntentClick(){
        val intent = Intent(this, IntentActivity::class.java)

        intent.putExtra("umur", etInputUmur.text.toString())
        intent.putExtra("tinggi", etInputTinggiBadan.text.toString())
        intent.putExtra("berat", etInputBeratBadan.text.toString())

        startActivity(intent)
    }

    fun buttonBundleClick(){
        val intent = Intent(this, IntentActivity::class.java)

        val bundle = Bundle()

        bundle.putString("umur",etInputUmur.text.toString())
        bundle.putString("tinggi",etInputTinggiBadan.text.toString())
        bundle.putString("berat",etInputTinggiBadan.text.toString())
        intent.putExtras(bundle)

        startActivity(intent)
    }

    fun buttonSerializableClick(){
        val intent = Intent(this, IntentActivity::class.java)

        // make object from data class Person.kt
        val person = Person("$etInputUmur", "${etInputTinggiBadan}", "$etInputBeratBadan")

        intent.putExtra("AN_OBJECT",person)
        startActivity(intent)
    }

    fun buttonParcelableClick(){
        val intent = Intent(this, IntentActivity::class.java)
        val data = PersonPar("$etInputUmur", "$etInputTinggiBadan", "$etInputBeratBadan")

        intent.putExtra("dataPersonPar", data)
        startActivity(intent)
    }
}
