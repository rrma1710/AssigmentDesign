package com.vsga.assigmentdesign.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vsga.assigmentdesign.databinding.ItemChatBinding
import com.vsga.assigmentdesign.model.ChatModel

class ItemAdapter(val context: Context, private val itemList: List<ChatModel>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(var binding: ItemChatBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.imgFotoChat.setImageResource(itemList[position].imageResId)
        holder.binding.tvNamaChat.text = itemList[position].name
        holder.binding.tvIsiChat.text = itemList[position].message
        holder.binding.tvWaktuChat.text = itemList[position].time
    }

}