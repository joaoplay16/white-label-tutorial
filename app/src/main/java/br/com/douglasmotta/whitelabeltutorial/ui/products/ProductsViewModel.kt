package br.com.douglasmotta.whitelabeltutorial.ui.products

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import br.com.douglasmotta.whitelabeltutorial.domain.usecase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase
) : ViewModel(){

    private val _productData = MutableLiveData<List<Product>>()
    val productsData: LiveData<List<Product>> = _productData

    fun getProducts() = viewModelScope.launch {
        try {
            val products = getProductsUseCase()
            _productData.value = products
        }catch (e: Exception){
            Log.d("ProductsViewModel", e.toString())
        }
    }
}