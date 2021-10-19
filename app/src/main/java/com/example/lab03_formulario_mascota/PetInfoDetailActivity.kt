package com.example.lab03_formulario_mascota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PetInfoDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet_info_detail)

        // 1. Recuperamos la data enviada por medio del bundle
        val bundle: Bundle? = intent.extras

        // NULL SAFETY
        val petName = bundle?.getString("KEY_PET_NAME", "Desconocido") ?: "Desconocido"
        val petAge = bundle?.getString("KEY_PET_AGE", "0") ?: "0"
        val petType = bundle?.getString("KEY_PET_TYPE", "Desconocido") ?: "Desconocido"
        val hasParvovirusVaccine = bundle?.getBoolean("KEY_PET_HAS_PARVOVIRUS_VACCINE", false) ?: false
        val hasDistemperVaccine = bundle?.getBoolean("KEY_PET_HAS_DISTEMPER_VACCINE", false) ?: false
        val hasHepatitisVaccine = bundle?.getBoolean("KEY_PET_HAS_HEPATITIS_VACCINE", false) ?: false
        val hasLeptospiriosisVaccine = bundle?.getBoolean("KEY_PET_HAS_LEPTOSPIRIOSIS_VACCINE", false) ?: false
        val hasRabiaVaccine = bundle?.getBoolean("KEY_PET_HAS_RABIA_VACCINE", false) ?: false

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