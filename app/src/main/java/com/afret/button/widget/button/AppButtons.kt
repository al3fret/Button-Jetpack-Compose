package com.afret.button.widget.button

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.afret.button.ui.theme.*


@Composable
fun FirstButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        color = ColorPurple100,
        cornerRadius = 0.dp,
        textId = textId,
        contentTextStyle = cairoAmericanPurpleSemiBold24
    )

}

@Composable
fun SecondButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        color = ColorPurple200,
        cornerRadius = 10.dp,
        textId = textId,
        contentTextStyle = cairoAmericanPurpleSemiBold24
    )

}


@Composable
fun ThirdButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        color = Purple80,
        cornerRadius = 50.dp,
        textId = textId,
        contentTextStyle = cairoAmericanPurpleSemiBold24
    )

}

@Composable
fun FourthButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    CustomButton(
        onClick = onClick,
        modifier = modifier,

        borderWidth = 2.dp,
        borderColor = ColorPlatinum,
        color = Color.Transparent,
        cornerRadius = 50.dp,
        textId = textId,
        contentTextStyle = cairoColorPlatinumSemiBold24
    )

}


@Composable
fun FifthButton(
    modifier: Modifier,
    @StringRes textId: Int,
    onClick: () -> Unit,
) {

    val gradient = Brush.horizontalGradient(
        listOf(
            ColorPurple100,
            ColorPurple500
        )
    )

    CustomButton(
        onClick = onClick,
        modifier = modifier,
        gradient = gradient,
        color = Color.Transparent,
        cornerRadius = 50.dp,
        textId = textId,
        contentTextStyle = cairoColorPlatinumSemiBold24
    )

}


