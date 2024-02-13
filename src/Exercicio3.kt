fun main() {
    println("Bem-vindo à calculadora simples!")

    // Solicitar ao usuário os dois números e a operação
    println("Digite o primeiro número:")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val numero2 = readLine()!!.toInt()

    println("Digite a operação (+, -, *, /):")
    val operacao = readLine()!!

    // Calcular o resultado com base na operação selecionada
    val resultado = when (operacao) {
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> numero1 / numero2
        else -> {
            println("Operação inválida!")
            return
        }
    }

    // Exibir o resultado
    println("O resultado da operação é: $resultado")
}
