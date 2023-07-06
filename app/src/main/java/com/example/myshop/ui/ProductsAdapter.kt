package com.example.myshop.ui


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductRvAdapter(var product: List<Product>):RecyclerView.Adapter<ProductRvAdapter.ProductsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsViewHolder {
        val binding=tabProductListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val currentProduct=product.get(position)
        val binding=holder.binding
        binding.tvbrand.text=currentProduct.brand
        binding.tvcategory.text=currentProduct.category
        binding.tvid.text=currentProduct.id.toString()
        binding.tvprice.text=currentProduct.price.toString()
        binding.tvdescription.text=currentProduct.description
        binding.tvratings.text=currentProduct.ratings.toString()
        binding.tvstock.text=currentProduct.stock.toString()
        binding.tvthumbnail.text=currentProduct.thumbnail
        binding.tvtitle.text=currentProduct.title

    }

    override fun getItemCount(): Int {
        return product.size
    }

    class ProductsViewHolder(var binding: ProductsListBinding):RecyclerView.ViewHolder(binding.root)
}