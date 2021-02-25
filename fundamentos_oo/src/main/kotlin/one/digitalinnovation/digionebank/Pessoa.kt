package one.digitalinnovation.digionebank

class Pessoa {
//creating classes "Pessoa"
    var nome: String = "Flavio"

    var cpf: String = "213.654.658-97"
    private set
//"private" modified of the variable
    constructor()
//secondary constructor

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val flavio = Pessoa()
//instantiating the class "Pessoa"
      println(flavio.pessoaInfo())
    }