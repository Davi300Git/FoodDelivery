package com.example.fooddelivery.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fooddelivery.data.ProductDescriptionData
import com.example.fooddelivery.data.ProductFlavorData
import com.example.fooddelivery.data.ProductFlavorState
import com.example.fooddelivery.data.ProductHighLighState
import com.example.fooddelivery.data.ProductNutritionData
import com.example.fooddelivery.data.ProductNutritionState
import com.example.fooddelivery.data.ProductPreviewState
import com.example.fooddelivery.screen.components.FlavorSection
import com.example.fooddelivery.screen.components.ProductDescriptionSection
import com.example.fooddelivery.screen.components.ProductNutritionSection
import com.example.fooddelivery.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorData,
    productNutritionState: ProductNutritionState = ProductNutritionData,
    productDescripton: String = ProductDescriptionData
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        FlavorSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            data = productFlavors
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        ProductNutritionSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            state = productNutritionState
        )
        Spacer(
            modifier = Modifier.height(32.dp)
        )
        ProductDescriptionSection(
            productDescription = productDescripton,
            modifier = Modifier
                .navigationBarsPadding()
                .padding(horizontal = 18.dp)
                .padding(bottom = 24.dp)
        )
    }
}
