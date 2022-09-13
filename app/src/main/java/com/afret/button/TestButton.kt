package com.afret.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afret.button.ui.theme.ColorGunmetal
import com.afret.button.widget.button.*


@Composable
fun TestButton() {


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorGunmetal)
    ) {

        FirstButton(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            textId = R.string.login,
            onClick = { /*TODO*/ })


        Spacer(modifier = Modifier.height(25.dp))

        SecondButton(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            textId = R.string.login,
            onClick = { /*TODO*/ })


        Spacer(modifier = Modifier.height(25.dp))


        ThirdButton(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            textId = R.string.login,
            onClick = { /*TODO*/ })

        Spacer(modifier = Modifier.height(25.dp))

        FourthButton(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            textId = R.string.login,
            onClick = { /*TODO*/ })

        Spacer(modifier = Modifier.height(25.dp))


        FifthButton(
            modifier = Modifier
                .fillMaxWidth(0.8f),
            textId = R.string.login,
            onClick = { /*TODO*/ })

        Spacer(modifier = Modifier.height(25.dp))



    }


}


@Composable
@Preview
fun TestButtonPreview() {
    TestButton()
}