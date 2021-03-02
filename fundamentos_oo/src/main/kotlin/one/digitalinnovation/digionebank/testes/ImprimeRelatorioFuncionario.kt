package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        //metodo estatico para invocalo via classe e nao via instancia
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}