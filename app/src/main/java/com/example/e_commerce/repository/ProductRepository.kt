package com.example.e_commerce.repository

import com.example.e_commerce.model.ProductItemModel
import kotlin.math.roundToInt

class ProductRepository {
    fun getAllProducts(): List<ProductItemModel> {
        return listOf(
            ProductItemModel(
                productTitle = "Wireless Bluetooth Earphones",
                productPrice = 49.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Smart Fitness Tracker",
                productPrice = 89.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Portable External Hard Drive",
                productPrice = 79.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Wireless Gaming Mouse",
                productPrice = 39.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Foldable Laptop Stand",
                productPrice = 24.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Bluetooth Speaker with LED Lights",
                productPrice = 59.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Smart Home Security Camera",
                productPrice = 129.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "High-Speed USB-C Charger",
                productPrice = 34.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Wireless Noise-Canceling Headphones",
                productPrice = 149.99.roundToInt()
            ),
            ProductItemModel(
                productTitle = "Stylish Laptop Backpack",
                productPrice = 54.99.roundToInt()
            )
        )
    }
}