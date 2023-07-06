package com.example.myshop.Api

import com.example.myshop.ui.Product
import com.example.myshop.ui.ProductsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/products")
    suspend fun getProducts():Response<ProductsResponse>

    @GET("/products{id}")
    fun getProduct(@Path("id")productId: Int): Response<Product>

}