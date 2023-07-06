package com.example.myshop.ui

data class ProductsResponse(
    var products:List<Product>,
    var total:Int,
    var skip:Int,
    var limit:Int
)

