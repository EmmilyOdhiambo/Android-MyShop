package com.example.myshop.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myshop.repository.ProductsRepository
import com.example.myshop.ui.Product
import kotlinx.coroutines.launch

class ProductsViewModel: ViewModel() {
    val productsRepository = ProductsRepository()
    var productsLiveData =MutableLiveData<List<Product>>()
    var errorLiveData = MutableLiveData<String>()


    fun fetchProducts(){
        viewModelScope.launch{
            val response = productsRepository.getProducts()
            if(response.isSuccessful){
                productsLiveData.postValue(response.body()?.products)
            }else{
               errorLiveData.postValue(response.errorBody()?.string())
            }

        }
    }
}