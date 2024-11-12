package com.pascal.myapplication.data.local

import com.pascal.myapplication.data.local.model.HistoryEntity
import com.pascal.myapplication.data.local.database.AppDatabase

class LocalDataSource(private val database: AppDatabase) {

    suspend fun insertHistoryItem(item: HistoryEntity) {
        database.historyDao().insertHistory(item)
    }

}