package com.roy.calculator.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.roy.calculator.ui.ConverterNumberPad
import com.roy.calculator.ui.UnitValue
import com.roy.calculator.viewmodels.ConverterViewModel

@Composable
fun ConversionScreen(
    category: String,
) {
    val viewModel: ConverterViewModel = viewModel()
    val options = viewModel.optionsState.collectAsState().value
    val first = viewModel.first.collectAsState().value
    val second = viewModel.second.collectAsState().value

    Column {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(16.dp, 2.dp, 16.dp, 10.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            first?.let {
                UnitValue(
                    unitState = it,
                    options = options,
                    onFocus = {
                        viewModel.changeFrom(true)
                    }) { c ->
                    viewModel.updateOption(
                        first = true,
                        conversionUnit = c
                    )
                }
            }
            second?.let {
                UnitValue(
                    it,
                    options,
                    onFocus = { viewModel.changeFrom(false) }) { c ->
                    viewModel.updateOption(
                        first = false,
                        conversionUnit = c
                    )
                }
            }
        }
        ConverterNumberPad(viewModel::updateInput)
    }

    LaunchedEffect(Unit) { viewModel.updateCategory(category) }
}
