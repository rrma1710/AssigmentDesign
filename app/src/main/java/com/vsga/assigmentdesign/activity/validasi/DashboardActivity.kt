package com.vsga.assigmentdesign.activity.validasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vsga.assigmentdesign.R
import com.vsga.assigmentdesign.activity.dashboard.CalculatorActivity
import com.vsga.assigmentdesign.activity.dashboard.ListActivity
import com.vsga.assigmentdesign.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvListChat.setOnClickListener(this)
        binding.cvKalkulator.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cv_list_chat -> {
                val intent = Intent(this, ListActivity::class.java)
                startActivity(intent)
            }

            R.id.cv_kalkulator -> {
                val intent = Intent(this, CalculatorActivity::class.java)
                startActivity(intent)
            }
        }
    }
}