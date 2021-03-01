package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val flavio = Pessoa(nome = "Flavio Silva" ,  cpf = "123456" )
    println("Nome: ${flavio.nome}")
    println("Cpf: ${flavio.cpf}")

    val joao = Funcionario( nome = "Joao da Silva", cpf = "123456789", BigDecimal.valueOf(1000.0))
    println("Nome: ${joao.nome}")
    println("Cpf: ${joao.cpf}")
    println("Salario: ${joao.salario}")

}