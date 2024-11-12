package com.pascal.myapplication.domain.usecase

import com.pascal.myapplication.data.remote.dtos.ResponseHistory
import com.pascal.myapplication.domain.repository.local.ILocalRepository
import kotlinx.coroutines.flow.Flow

class LocalUC (private val repository: ILocalRepository) {
    suspend fun getHistory() {

    }
}