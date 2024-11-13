package com.pascal.myapplication.ui.screen.teams

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pascal.myapplication.ui.theme.FootballAppTheme
import org.koin.androidx.compose.koinViewModel

@Composable
fun TeamScreen(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    viewModel: TeamViewModel = koinViewModel(),
    onDetail: () -> Unit
) {

}


@Preview(showBackground = true)
@Composable
private fun TeamPreview() {
    FootballAppTheme {  }
}