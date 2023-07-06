package com.example.hopperlabshop2023




import retrofit2.Call
import  retrosfit2..http.GET
interface AiInterface {
    @GET("/products")
    fun getProducts():call<list<products>>

}


}