package com.example.fooddelivery.data

import android.text.Highlights
import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

import org.w3c.dom.Text

data class ProductHighLighState(
    val text: String,
    val type: ProductHighLighType
)

enum class ProductHighLighType{
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headLine: String = "Mr. Cheezy",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighLighState> = listOf(
        ProductHighLighState(
            text = "Classic Taste",
            type = ProductHighLighType.SECONDARY
        ),
        ProductHighLighState(
            text = "Bestseller",
            type = ProductHighLighType.PRIMARY
        )
    )
)