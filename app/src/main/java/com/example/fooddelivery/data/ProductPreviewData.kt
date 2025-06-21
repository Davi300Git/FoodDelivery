package com.example.fooddelivery.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

import org.w3c.dom.Text

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType{
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headLine: String = "Mr. Cheezy",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Classic Taste",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text = "Bestseller",
            type = ProductHighlightType.PRIMARY
        )
    )
)