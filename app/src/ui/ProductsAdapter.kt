package com.danimotors.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.danimotors.app.model.Product

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val products = listOf(
            Product("Aceite", 25000.0, 10),
            Product("Cadena", 45000.0, 5),
            Product("Bujía", 8000.0, 20)
        )

        setContent {
            MaterialTheme {
                ProductList(products)
            }
        }
    }
}

@Composable
fun ProductList(products: List<Product>) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(products) { product ->
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = product.name)
                    Text(text = "Precio: $${product.price}")
                    Text(text = "Stock: ${product.stock}")
                }
            }
        }
    }
}
