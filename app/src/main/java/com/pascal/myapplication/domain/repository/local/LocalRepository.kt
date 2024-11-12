package com.pascal.myapplication.domain.repository.local

import com.pascal.myapplication.data.local.LocalDataSource
import com.pascal.myapplication.data.local.model.HistoryEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

internal class LocalRepository(
    private val localDataSource: LocalDataSource
): ILocalRepository {

    override suspend fun addHistory(item: HistoryEntity): Flow<Unit> {
        return flowOf(localDataSource.insertHistoryItem(item))
    }
}