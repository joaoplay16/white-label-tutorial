package br.com.douglasmotta.whitelabeltutorial.domain.usecase

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import br.com.douglasmotta.whitelabeltutorial.domain.repository.ProductRepository
import java.lang.Exception
import javax.inject.Inject

class CreateProductUseCaseImpl @Inject constructor(
    private val uploadProductImageUseCase: UploadProductImageUseCase,
    private val productRepository: ProductRepository
) : CreateProductUserCase {

    override suspend fun invoke(description: String, price: Double, imageUri: Uri) {
        return try {
            val imageUrl = uploadProductImageUseCase(imageUri)
            val product = Product(description, price, imageUrl)
            productRepository.createProduct(product)
        } catch (exception: Exception) {
            throw exception
        }
    }
}