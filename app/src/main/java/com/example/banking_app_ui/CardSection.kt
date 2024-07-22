package com.example.banking_app_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banking_app_ui.data.Card
import com.example.banking_app_ui.ui.theme.BlueEnd
import com.example.banking_app_ui.ui.theme.BlueStart
import com.example.banking_app_ui.ui.theme.GreenEnd
import com.example.banking_app_ui.ui.theme.GreenStart
import com.example.banking_app_ui.ui.theme.OrangeEnd
import com.example.banking_app_ui.ui.theme.OrangeStart
import com.example.banking_app_ui.ui.theme.PurpleEnd
import com.example.banking_app_ui.ui.theme.PurpleStart

val cards = listOf(
    Card(
        "VISA",
        "3554 5432 3489 5648",
        "Business",
        46.467,
        getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        "MASTER CARD",
        "5454 9632 4289 5548",
        "Savings",
        6.467,
        getGradient(BlueStart, BlueEnd)
    ),
    Card(
        "VISA",
        "7765 7442 6589 5718",
        "School",
        3.467,
        getGradient(OrangeStart, OrangeEnd)
    ),
    Card(
        "MASTER CARD",
        "3567 5543 6687 0954",
        "Trips",
        26.47,
        getGradient(GreenStart, GreenEnd)
    )
)

fun getGradient(
    startColor: Color,
    endColor: Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor,endColor)
    )
}

@Composable
fun CardsSection(){
    LazyRow {
        items(cards.size){ index ->
            CardItem(index)
        }
    }
}

@Composable
fun CardItem(index:Int){
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if(index == cards.size - 1){
        lastItemPaddingEnd = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if(card.cardType == "MASTER CARD"){
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(
        modifier = Modifier
            .padding(start = 16.dp,end=lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.color)
                .width(250.dp)
                .height(160.dp)
                .clickable {}
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = image,
                contentDescription = card.cardName,
                modifier = Modifier.width(60.dp)
            )
            
            Spacer(modifier = Modifier.height(10.dp))
            
            Text(
                text = card.cardName,
                color = Color.White,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "$ ${card.balance}",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = card.cardNumber,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}