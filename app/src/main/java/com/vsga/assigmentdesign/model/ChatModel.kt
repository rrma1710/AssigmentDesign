package com.vsga.assigmentdesign.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChatModel(
    val imageResId: Int,
    val name: String,
    val message: String,
    val time: String
) : Parcelable
