package one.digitalinnovation.digionebank.testes
import one.digitalinnovation.digionebank.Gerente


fun main() {
    val lidy = Gerente( nome= "Lidy Aparecida", cpf = "987654321", salario = 10000.0)
    ImprimeRelatorioFuncionario.imprime(lidy)

}

