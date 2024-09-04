package com.khater.nbe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.khater.nbe.ui.theme.Helvetica
import com.khater.nbe.ui.theme.NBETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NBETheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0x806DB073),
                                    Color.Transparent,
                                    Color.Transparent,
                                    Color.Transparent,
                                ),
                                start = androidx.compose.ui.geometry.Offset(
                                    x = Float.POSITIVE_INFINITY,
                                    y = 0f
                                ),
                                end = androidx.compose.ui.geometry.Offset(
                                    x = 0f,
                                    y = Float.POSITIVE_INFINITY
                                )
                            )
                        )
                ) {
                    Column(
                        Modifier
                            .fillMaxSize()
                    ) {
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(
                                    start = convertPxToDp(60).dp,
                                    end = convertPxToDp(60).dp,
                                    top = convertPxToDp(131).dp,
                                ),
                            verticalAlignment = CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(R.drawable.more),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(convertPxToDp(70).dp)
                                    .height(convertPxToDp(51).dp)
                            )
                            Box(
                                Modifier
                                    .size(convertPxToDp(112).dp)
                                    .background(
                                        Color(0xFF28603D),
                                        RoundedCornerShape(convertPxToDp(20).dp)
                                    ),
                                contentAlignment = Center
                            ) {
                                Text(
                                    text = "En",
                                    color = Color.White,
                                    fontFamily = Helvetica,
                                    fontSize = convertPxToDp(58).sp,
                                )
                            }
                        }

                        Image(
                            painter = painterResource(R.drawable.nbe_logo),
                            contentDescription = "NBE logo",
                            modifier = Modifier
                                .padding(
                                    top = convertPxToDp(161).dp,
                                    end = convertPxToDp(60).dp,
                                )
                                .height(convertPxToDp(141).dp)
                                .align(End),
                            contentScale = ContentScale.Crop
                        )

                        Box(
                            Modifier
                                .padding(
                                    top = convertPxToDp(60).dp,
                                    start = convertPxToDp(60).dp,
                                    end = convertPxToDp(60).dp,
                                )
                                .height(convertPxToDp(500).dp)
                                .fillMaxWidth()
                                .background(
                                    Color.Red
                                ),
                            contentAlignment = Center
                        ) {
                            Box(
                                Modifier
                                    .height(convertPxToDp(416).dp)
                                    .fillMaxWidth()
                                    .background(
                                        Brush.linearGradient(
                                            colors = listOf(
                                                Color(0xFFF6CC45),
                                                Color(0xFFDF8131),
                                            )
                                        ),
                                        RoundedCornerShape(convertPxToDp(20).dp)
                                    )
                            )


                            Image(
                                painter = painterResource(R.drawable.banner),
                                contentDescription = "NBE logo",
                                modifier = Modifier
                                    .align(CenterEnd)
                                    .height(convertPxToDp(500).dp),

                                )
                            Text(
                                text = "Your bank\nin your phone",
                                color = Color.White,
                                fontFamily = Helvetica,
                                fontSize = convertPxToDp(58).sp,
                                modifier = Modifier
                                    .align(
                                        CenterStart
                                    )
                                    .padding(start = convertPxToDp(60).dp),
                                fontWeight = FontWeight.Bold
                            )
                        }


                        Text(
                            text = "Get access to your\nfinances Anytime,\nAnywhere.",
                            color = Color.Black,
                            fontFamily = Helvetica,
                            fontSize = convertPxToDp(78).sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(
                                top = convertPxToDp(80).dp, start = convertPxToDp(60).dp,
                                end = convertPxToDp(60).dp,
                            ),
                            lineHeight = convertPxToDp(95).sp
                        )

                        BaseAuthBottom(text = "Login") {
                            // handle login
                        }
                        BaseAuthBottom(
                            text = "Register",
                            paddingTop = convertPxToDp(40).dp
                        ) {
                            // handle Register
                        }


                        val categories = listOf(
                            Triple(R.drawable.video_library, "Tutorials", "TutorialsScreen"),
                            Triple(R.drawable.faq, "FAQs", "FAQsScreen"),
                            Triple(R.drawable.dollar_exchange, "Forex", "ForexScreen"),
                            Triple(R.drawable.security, "Security", "SecurityScreen"),
                        )
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(
                                    top = convertPxToDp(100).dp,
                                ), horizontalArrangement = Arrangement.Center
                        ) {
                            categories.forEach {
                                Column(
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(convertPxToDp(188).dp)
                                            .background(
                                                Color(
                                                    0x1AE38E36
                                                ),
                                                RoundedCornerShape(convertPxToDp(20).dp)
                                            )
                                            .clickable {
                                                navController.navigate(it.third)
                                            },
                                        contentAlignment = Center
                                    ) {
                                        Image(
                                            painter = painterResource(it.first),
                                            contentDescription = null,
                                            modifier = Modifier.size(convertPxToDp(89).dp),
                                        )

                                    }
                                    Text(
                                        text = it.second,
                                        color = Color(0xFFE38E36),
                                        fontFamily = Helvetica,
                                        fontSize = convertPxToDp(30).sp,
                                        modifier = Modifier,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                                if (it != categories.last())
                                    Spacer(modifier = Modifier.width(convertPxToDp(47).dp))
                            }

                        }


                    }
                }
            }
        }
    }
}


@Composable
fun BaseAuthBottom(
    text: String,
    modifier: Modifier = Modifier,
    paddingTop: Dp = convertPxToDp(60).dp,
    onClick: () -> Unit
) {
    Box(
        modifier
            .padding(
                top = paddingTop,
                start = convertPxToDp(60).dp,
                end = convertPxToDp(60).dp,
            )
            .clickable {
                onClick()
            }
            .height(convertPxToDp(174).dp)
            .fillMaxWidth()
            .background(
                if (text == "Register") Color(0x1A28603D) else Color(0xFF28603D),
                RoundedCornerShape(convertPxToDp(20).dp)
            ),
        contentAlignment = Center
    ) {
        Text(
            text = text,
            color = if (text == "Register") Color(0xFF28603D) else Color.White,
            fontFamily = Helvetica,
            fontSize = convertPxToDp(58).sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun convertPxToDp(px: Int): Float {
    val density = LocalDensity.current.density
    return px / density
}
