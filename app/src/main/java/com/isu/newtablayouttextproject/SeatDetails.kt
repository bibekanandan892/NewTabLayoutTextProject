package com.isu.newtablayouttextproject

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.isu.newtablayouttextproject.ui.theme.AppBlack
import com.isu.newtablayouttextproject.ui.theme.AppDarkDray
import com.isu.newtablayouttextproject.ui.theme.WLOrangeDark
import com.isu.newtablayouttextproject.utils.Helper

@Composable
fun SeatDetails(
    avlClass: String,
    borderColor: Color = WLOrangeDark.copy(alpha = 0.2f),
    selected: Boolean = true,
    backgroundColor : Color,
    onClick: () -> Unit
    ,
) {
    Column(horizontalAlignment = Alignment.Start) {
        Surface(modifier = Modifier
            .padding(horizontal = 2.5.dp)
            .height(62.dp)
            .width(105.dp)
            .border(BorderStroke(1.dp, borderColor),
                shape = RoundedCornerShape(5.dp))
            .clickable {
                onClick.invoke()
            }
            .background(color = backgroundColor, shape = RoundedCornerShape(5.dp)),
            elevation = 2.dp,
            shape = RoundedCornerShape(5.dp)) {
            Column(Modifier
                .fillMaxSize()
                .background(color =backgroundColor.copy(alpha = 0.2f))
                .padding(vertical = 5.dp, horizontal = 11.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(text = Helper.getFullSeatTypeName(avlClass),
                        style = TextStyle(color = AppBlack,
                            fontFamily = FontFamily(fonts = listOf(Font(R.font.roboto_medium))),
                            fontSize = 10.sp,
                            textAlign = TextAlign.Center))
                    Text(text = "₹ 2950",
                        style = TextStyle(color = AppBlack,
                            fontFamily = FontFamily(fonts = listOf(Font(R.font.roboto_medium))),
                            fontSize = 11.sp,
                            textAlign = TextAlign.Center))
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(text = "RLWL30/WL4",
                        style = TextStyle(color = AppDarkDray,
                            fontFamily = FontFamily(fonts = listOf(Font(R.font.roboto_medium))),
                            fontSize = 8.sp,
                            textAlign = TextAlign.Center))
                }
            }
        }
        Text(text = "30 Mins ago",
            style = TextStyle(color = Color.Gray.copy(alpha = 0.5f),
                fontFamily = FontFamily(fonts = listOf(Font(R.font.roboto_medium))),
                fontSize = 10.sp,
                textAlign = TextAlign.Center))
    }

}