package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista( nome= "Joao da Silva", cpf = "123456789", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
      }

