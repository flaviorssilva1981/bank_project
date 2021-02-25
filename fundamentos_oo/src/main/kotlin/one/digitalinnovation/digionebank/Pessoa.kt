package one.digitalinnovation.digionebank

class Pessoa {
//creating classes "Pessoa"
    var nome: String = "Flavio"

    var cpf: String = "213.654.658-97"
    private set
//"private" modified of the variable

}

fun main() {
    val flavio = Pessoa()
//instantiating the class "Pessoa"
    println(flavio.nome)
    println(flavio.cpf)
    }