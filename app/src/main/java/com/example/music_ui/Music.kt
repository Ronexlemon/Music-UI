package com.example.music_ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.*

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DisplayMusic(){
    var expanded by remember{mutableStateOf(false)}
    val colors = listOf(0xFF222,0xF1F1F1)
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())){
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.nick ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(if (expand) 350.dp else 100.dp)
                        .focusable(enabled = true))
            }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.rick ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(if (expand) 350.dp else 100.dp)
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.justin ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.jidena ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.cardb ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.omaylay ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.popesmoke ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.quavo ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.kendrick ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(if (expand) 350.dp else 100.dp)
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.rick ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(if (expand) 350.dp else 100.dp)
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.justin ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.justin ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.rihhna ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.wizkid ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.khalifa ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
        Row(modifier=Modifier.padding(all=20.dp)){
            Box(modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(
                            Color(0xFFE30022),
                            Color(0xFF00BFFF),
                            Color(0xFFDFFF00)
                        )
                    )
                )
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))){
                var expand by remember{ mutableStateOf(expanded)}
                Row(horizontalArrangement = Arrangement.End){
                    Image(painter= painterResource(id =R.drawable.khalid ),contentDescription = null,modifier= Modifier
                        .align(
                            Alignment.CenterVertically
                        )
                        .clickable(onClick = {
                            expand = !expand

                        }
                        )
                        .size(
                            if (expand) {
                                350.dp
                            } else 100.dp
                        )
                        .focusable(enabled = true))
                }}

        }
    }
}
@Preview(showBackground = true)
@Composable
fun MusicDisplay(){
    DisplayMusic()
}