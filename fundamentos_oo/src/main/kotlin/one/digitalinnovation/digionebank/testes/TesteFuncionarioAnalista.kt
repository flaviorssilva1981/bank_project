package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista( nome= "Joao da Silva", cpf = "123456789", salario = 2000.0)
    imprimeRelatorio(joao)
    println()

    val lidy = Gerente( nome= "Lidy Aparecida", cpf = "987654321", salario = 10000.0)
    imprimeRelatorio(lidy)

  }
fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())