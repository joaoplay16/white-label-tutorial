package br.com.douglasmotta.whitelabeltutorial.data

import android.net.Uri
import br.com.douglasmotta.whitelabeltutorial.domain.model.Product
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

class FirebaseProductDataSource(
    firebaseFirestore: FirebaseFirestore,
    firebaseStorage: FirebaseStorage
): ProductDataSource {


    override suspend fun getProducts(): List<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun uploadPoductImage(imageUri: Uri): String {
        TODO("Not yet implemented")
    }

    override suspend fun createProduct(product: Product): Product {
        TODO("Not yet implemented")
    }
}