package com.roy.calculator.logic

import androidx.annotation.Keep

@Keep
data class ConversionUnit(
    val category: Category,
    val unitShort: String?,
    val unitName: String,
    var factor: Double,
)
