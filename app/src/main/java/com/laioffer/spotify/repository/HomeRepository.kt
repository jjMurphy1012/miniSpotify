package com.laioffer.spotify.repository

import com.laioffer.spotify.datamodel.Section
import com.laioffer.spotify.network.NetworkApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val networkApi: NetworkApi
) {
    suspend fun getHomeSections(): List<Section> = withContext(Dispatchers.IO) {
        delay(3000)
        val resp = networkApi.getHomeFeed().execute()
        if (resp.isSuccessful) {
            // body 为 null 时给个空列表，避免强拆崩溃
            resp.body() ?: emptyList()
        } else {
            // 根据业务可抛异常也可返回默认值
            emptyList()
        }
    }
}