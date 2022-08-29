package br.com.douglasmotta.whitelabeltutorial.data

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product

class ProductRepository(private val dataSource: ProductDataSource) {

    suspend fun getProducts(): List<Product> = dataSource.getProducts()

    suspend fun uploadPoductImage(imageUri: Uri): String =
        dataSource.uploadPoductImage(imageUri)

    suspend fun createProduct(product: Product): Product =
        dataSource.createProduct(product)

}