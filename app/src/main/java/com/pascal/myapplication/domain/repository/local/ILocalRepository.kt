package com.pascal.myapplication.domain.repository.local
import com.pascal.myapplication.data.local.model.HistoryEntity
import kotlinx.coroutines.flow.Flow

interface ILocalRepository {
    suspend fun addHistory(item: HistoryEntity): Flow<Unit>
}