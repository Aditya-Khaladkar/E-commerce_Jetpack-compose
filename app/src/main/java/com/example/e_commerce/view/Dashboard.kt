package com.example.e_commerce.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commerce.component.ChipFilter
import com.example.e_commerce.component.ProductItem
import com.example.e_commerce.repository.ProductRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard() {

    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }

    val productRepository = ProductRepository()
    val getAllProducts = productRepository.getAllProducts()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        SearchBar(
            modifier = Modifier.padding(10.dp),
            query = text,
            onQueryChange = { text = it },
            onSearch = { active = false },
            active = active,
            onActiveChange = {
                active = it
            },
            placeholder = { Text("search here") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
        ) {

        }

        ChipFilter(
            chips = listOf(
                "All Products",
                "TV",
                "Laptop",
                "Smartphone",
                "Camera",
                "Headphones",
                "Gaming console"
            )
        )

        LazyVerticalGrid(
            GridCells.Fixed(2), // Set the number of columns in the grid
            modifier = Modifier.fillMaxSize()
        ) {
            items(items = getAllProducts) { product ->
                ProductItem(productItemModel = product)
            }
        }
    }
}

@Preview
@Composable
fun DashboardPreview() {
    Dashboard()
}