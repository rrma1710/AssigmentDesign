package com.vsga.assigmentdesign.activity.dashboard

import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.vsga.assigmentdesign.R
import com.vsga.assigmentdesign.databinding.ActivityInputDataBinding


class InputDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityInputDataBinding

    val agama = arrayOf("", "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu")

    var cowo: RadioButton? = null
    var cewe: RadioButton? = null

    var selectedSuperStar: String? = null
    var submit: Button? = null

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cowo = findViewById<RadioButton>(R.id.rb_laki_laki)
        cewe = findViewById<RadioButton>(R.id.rb_perempuan)


        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, agama)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spAgama.adapter = arrayAdapter

        binding.btnSimpan.setOnClickListener {

            val nama = binding.edtNamaLengkap.editText?.text.toString()
            val nim = binding.edtNim.editText?.text.toString()
            val alamat = binding.edtAlamat.editText?.text.toString()
            val jk = binding.spAgama.selectedItem.toString()

            if (cowo!!.isChecked) {
                selectedSuperStar = cowo!!.text.toString()
            } else if (cewe!!.isChecked) {
                selectedSuperStar = cewe!!.text.toString();
            }

            binding.tvNamaLengkap.text = nama
            binding.tvNim.text = nim
            binding.tvJenisKelamin.text = selectedSuperStar
            binding.tvAgama.text = jk
            binding.tvAlamat.text = alamat
        }
    }
}