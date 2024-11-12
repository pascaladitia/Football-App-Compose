package com.pascal.myapplication.domain.repository.remote

import com.pascal.myapplication.data.remote.AppService
import com.pascal.myapplication.data.remote.dtos.ResponseHistory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import retrofit2.Response

internal class Repository(
    private val appService: AppService
) : IRepository {

    override suspend fun history(): Flow<Response<ResponseHistory?>> {
        return flowOf(appService.history())
    }
}