package com.pascal.myapplication.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.pascal.myapplication.data.local.model.HistoryEntity

@Dao
abstract class HistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insertHistory(cachedTest: HistoryEntity) : Long

}