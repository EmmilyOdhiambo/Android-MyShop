package com.example.myshop.repository

import com.example.myshop.Api.ApiClient
import com.example.myshop.Api.ApiInterface
import com.example.myshop.ui.ProductsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductsRepository {
    val apiClient =
        ApiClient.buildClient(ApiInterface::class.java)
    suspend fun getProducts(): Response<ProductsResponse>{
        return  withContext(Dispatchers.IO){
            apiClient.getProducts()
        }

    }
}