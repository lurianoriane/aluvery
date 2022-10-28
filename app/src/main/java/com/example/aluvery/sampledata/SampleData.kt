package com.example.aluvery.sampledata

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Carlinhos",
        price = BigDecimal("12.99"),
        image = R.drawable.carlinhos_1
    ),
    Product(
        name = "Sonequinha",
        price = BigDecimal("20.99"),
        image = R.drawable.carlinhos_2
    ),
    Product(
        name = "Neném",
        price = BigDecimal("24.99"),
        image = R.drawable.carlinhos_3
    )
)
