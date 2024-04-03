fun pesquisaBinaria(lista: List<Int>, item: Int): Int? {
    var baixo = 0
    var alto = lista.size - 1

    while (baixo <= alto) {
        val meio = (baixo + alto) / 2
        val chute = lista[meio]

        if (chute == item) {
            return meio
        }

        if (chute > item) {
            alto = meio - 1
        } else {
            baixo = meio + 1
        }
    }

    return null
}

fun main() {
    val lista = listOf(1, 3, 5, 7, 9)
    val item = 3
    val indice = pesquisaBinaria(lista, item)

    if (indice != null) {
        println("O item $item está na posição $indice.")
    } else {
        println("O item $item não está na lista.")
    }

    val numeros = intArrayOf(5, 3, 6, 2, 10)
    println("Array original: ${numeros.joinToString()}")
    println("Array ordenado: ${ordenarPorSelecao(numeros).joinToString()}")
}
                                                                                                                           