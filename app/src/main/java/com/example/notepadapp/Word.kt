package com.example.notepadapp

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "word") // tableName을 지정하지 않아도 room에서 임의의 tableName 값을 생성
data class Word(
    val text: String,
    val mean: String,
    val type: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0, // autoGenerate: 자동으로 값을 생성
) : Parcelable
