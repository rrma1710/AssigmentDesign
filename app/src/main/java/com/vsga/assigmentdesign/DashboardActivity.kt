package com.vsga.assigmentdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.vsga.assigmentdesign.adapter.ItemAdapter
import com.vsga.assigmentdesign.databinding.ActivityDashboardBinding
import com.vsga.assigmentdesign.model.ChatModel

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val itemList: List<ChatModel> = listOf(
            ChatModel(
                R.drawable.dua,
                "Rizky Maulana",
                " Hai, apa kabar? Sudah lama tidak bertemu!",
                "2m"
            ),
            ChatModel(
                R.drawable.tiga,
                "Ahmad Junaidi",
                " Sudah mendengar berita terbaru? Ada peristiwa besar di kota ini.",
                "6m"
            ),
            ChatModel(
                R.drawable.empat,
                "Samiran Sarmidi",
                "Apa rencanamu untuk liburan tahun ini? Aku berencana pergi ke luar negeri. ",
                "6m"
            ),
            ChatModel(
                R.drawable.lima,
                "Zaini Sowan",
                " Saya juga menonton film itu! Saya suka alur ceritanya, tetapi menurut saya akting beberapa aktor kurang meyakinkan. Bagaimana?",
                "9m"
            ),
            ChatModel(
                R.drawable.enam,
                "Juned Alfarisi",
                " Saya juga menonton film itu! Saya suka alur ceritanya, tetapi menurut saya akting beberapa aktor kurang meyakinkan. Bagaimana?",
                "10m"
            ),
            ChatModel(
                R.drawable.tujuh,
                "Riski Hidayat",
                "Hobi saya adalah bersepeda dan menggambar. Jika Anda ingin mencoba sesuatu yang baru, mungkin Anda bisa mencoba berkebun atau belajar memasak.",
                "10m"
            ),
            ChatModel(
                R.drawable.delapan,
                "Jamal Qosim",
                "Sudah mencoba restoran baru di dekat sini? Saya mendengar mereka menyajikan masakan lezat.",
                "12m"
            ),
            ChatModel(
                R.drawable.sembilan,
                "Kentu Saiki",
                "Oh, tentu! Saya baru saja mencoba panjat tebing. Awalnya sedikit menakutkan, tetapi setelah beberapa kali mencoba, itu sangat menyenangkan dan memacu adrenalin.",
                "13m"
            ),
            ChatModel(
                R.drawable.sepuluh,
                "Jaya Wijaya",
                "Apa rencanamu untuk akhir pekan ini? Aku ingin menghabiskannya bersama teman-teman.",
                "15m"
            ),
        )

        val recyclerView = binding.rvData
        recyclerView.adapter = ItemAdapter(this, itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
}