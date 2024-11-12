package com.pascal.myapplication.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pascal.myapplication.data.local.dao.HistoryDao
import com.pascal.myapplication.data.local.model.HistoryEntity

@Database(
    entities = [HistoryEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}
