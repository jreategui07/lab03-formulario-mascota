package com.example.lab03_formulario_mascota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {

            val petName: String = edtName.text.toString()
            val petAge: String = edtAge.text.toString()

            var petType: String = ""
            if (rbDog.isChecked) {
                petType = rbDog.text.toString()
            } else if (rbCat.isChecked) {
                petType = rbCat.text.toString()
            } else {
                petType = rbRabbit.text.toString()
            }

            val hasParvovirusVaccine: Boolean = chkParvovirus.isChecked
            val hasDistemperVaccine: Boolean = chkDistemper.isChecked
            val hasHepatitisVaccine: Boolean = chkHepatitis.isChecked
            val hasLeptospiriosisVaccine: Boolean = chkLeptospiriosis.isChecked
            val hasRabiaVaccine: Boolean = chkRabia.isChecked

            println(petName)
            println(petAge)
            println(petType)
            println(hasParvovirusVaccine)
            println(hasDistemperVaccine)
            println(hasHepatitisVaccine)
            println(hasLeptospiriosisVaccine)
            println(hasRabiaVaccine)

        }

    }
}