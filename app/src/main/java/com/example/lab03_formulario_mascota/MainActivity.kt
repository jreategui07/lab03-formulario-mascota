package com.example.lab03_formulario_mascota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend.setOnClickListener {

            // 1. Obtenemos valores del formulario
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

            // 2. Validamos campos requeridos
            if(petName.isEmpty()) {
                toast("Debe ingresar el nombre de la mascota")
                return@setOnClickListener
            }

            if(petAge.isEmpty()) {
                toast("Debe ingresar la edad de la mascota")
                return@setOnClickListener
            }

            // 3. Guardamos la información en una variable de tipo Bundle
            val bundle: Bundle = Bundle().apply {
                putString("KEY_PET_NAME", petName)
                putString("KEY_PET_AGE", petAge)
                putString("KEY_PET_TYPE", petType)
                putBoolean("KEY_PET_HAS_PARVOVIRUS_VACCINE", hasParvovirusVaccine)
                putBoolean("KEY_PET_HAS_DISTEMPER_VACCINE", hasDistemperVaccine)
                putBoolean("KEY_PET_HAS_HEPATITIS_VACCINE", hasHepatitisVaccine)
                putBoolean("KEY_PET_HAS_LEPTOSPIRIOSIS_VACCINE", hasLeptospiriosisVaccine)
                putBoolean("KEY_PET_HAS_RABIA_VACCINE", hasRabiaVaccine)
            }

            // 4. Navegamos a la siguiente vista enviando el bundle
            val intent = Intent(this, PetInfoDetailActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)

        }

    }

    fun toast(mensaje: String) = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
}