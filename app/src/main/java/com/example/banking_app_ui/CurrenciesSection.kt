package com.example.banking_app_ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.banking_app_ui.data.Currency

val currencies= listOf(
    Currency(
        name= "USD",
        buy = 23.35f,
        sell = 25.65f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name= "EUR",
        buy = 23.35f,
        sell = 25.65f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name= "YEN",
        buy = 23.35f,
        sell = 25.65f,
        icon = Icons.Rounded.CurrencyYen
    ),
    Currency(
        name= "USD",
        buy = 23.35f,
        sell = 28.65f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name= "EUR",
        buy = 21.35f,
        sell = 27.65f,
        icon = Icons.Rounded.Euro
    ),
    Currency(
        name= "YEN",
        buy = 20.35f,
        sell = 22.65f,
        icon = Icons.Rounded.CurrencyYen
    ),
)

@Preview
@Composable
fun CurrenciesSection(){

}