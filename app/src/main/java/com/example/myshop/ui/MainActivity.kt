
package com.example.myshop.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.myshop.Api.ApiClient
import com.example.myshop.Api.ApiInterface
import com.example.myshop.databinding.ActivityMainBinding
import com.example.myshop.viewModel.ProductsViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val productsViewModel: ProductsViewModel by viewModels()

    //    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
//        fetchProducts()
        productsViewModel.fetchProducts()
        productsViewModel.productsLiveData.observe(this, Observer { productsList ->

            Toast.makeText(baseContext, "fetched ${productsList?.size} products", Toast.LENGTH_LONG)
                .show()
        })
        productsViewModel.productsLiveData.observe(this, Observer { productsList ->

            Toast.makeText(baseContext, "fetched ${productsList?.size} products", Toast.LENGTH_LONG)
                .show()
        })
    }
}

//    }
//    fun fetchProducts(){
//        var apiClient = ApiClient.buildClient(ApiInterface::class.java)
//        var request =apiClient.getProducts()
//        request.enqueue(object :Callback<ProductsResponse>{
//            override fun onResponse(call: Call<ProductsResponse>, response: Response<ProductsResponse>) {
//                if(response.isSuccessful){
//                    var products =response.body()?.products
//                    Toast.makeText(baseContext,"fetched ${products?.size}products",Toast.LENGTH_LONG).show()
//                }
//                else{
//                    var error =response.errorBody()?.string()
//                    Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
//                }
//            }
//
//            override fun onFailure(call: Call<ProductsResponse>, t: Throwable) {
//                Toast.makeText(baseContext,t.message,Toast.LENGTH_LONG).show()
//            }
//        })
//    }
//
//
//}







