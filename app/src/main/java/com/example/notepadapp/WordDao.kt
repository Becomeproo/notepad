package com.example.notepadapp

import androidx.room.*

@Dao
interface WordDao {
    @Query("SELECT * FROM word ORDER BY id DESC") // 여기서의 word는 Word 클래스에서 tableName으로 지정된 word
    fun getAll(): List<Word>

    @Query("SELECT * FROM word ORDER BY id DESC LIMIT 1")
    fun getLatestWord(): Word

    @Insert
    fun insert(word: Word)

    @Delete
    fun delete(word: Word)

    @Update
    fun update(word: Word)
}