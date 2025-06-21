package com.example.fooddelivery.data

import java.time.temporal.TemporalAmount

data class OrderState(
    val amount: Int,
    val totalPrice: String
)

val OrderData = OrderState(
    amount = 5,
    totalPrice = "R$137,25"
)