package com.example.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeStudyTheme {
                Column {
                    welcome()
                    Transactions()
                }
            }
        }
    }
}

@Composable
fun Transactions() {
    LazyColumn(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(transactionsDummy.size) {index ->
            Transaction(index)
        }
    }
}

@Composable
private fun Transaction(index: Int) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row {
            Text(
                text = transactionsDummy[index],
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun welcome(){
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Welcome back, \nMateus Souza",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Default.Delete,
            contentDescription = "Clear Transactions",
            tint = MaterialTheme.colorScheme.primary
        )
    }
}

private val transactionsDummy = listOf<String>(
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia",
    "Gasolina", "Aluguel", "Estudos", "Café", "Academia"
    )