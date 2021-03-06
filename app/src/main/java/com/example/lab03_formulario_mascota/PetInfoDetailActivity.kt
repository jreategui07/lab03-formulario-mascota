package com.example.lab03_formulario_mascota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pet_info_detail.*

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

        // 2. Asignamos valores a componentes de la vista
        tvNamePetInfo.text = petName
        tvAgePetInfo.text = petAge

        tvHasPorvovirusVaccine.text = if(hasParvovirusVaccine) "SI" else "NO"
        tvHasDistemperVaccine.text = if(hasDistemperVaccine) "SI" else "NO"
        tvHasHepatitisVaccine.text = if(hasHepatitisVaccine) "SI" else "NO"
        tvHasLeptospiriosisVaccine.text = if(hasLeptospiriosisVaccine) "SI" else "NO"
        tvHasRabiaVaccine.text = if(hasRabiaVaccine) "SI" else "NO"

        when(petType) {
            "Perro" -> {
                imgPetType.setImageResource(R.drawable.dog_icon)
            }
            "Gato" -> {
                imgPetType.setImageResource(R.drawable.cat_icon)
            }
            "Conejo" -> {
                imgPetType.setImageResource(R.drawable.rabbit_icon)
            }
        }

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