fun buscarMenor (lista: IntArray): Int {
    var menor = lista[0]
    var menorIndice = 0
    for (i in 1 until lista.size) {
        if (lista[i] < menor){
            menor = lista[i]
            menorIndice = i
        }
    }
    return menorIndice
}

fun ordenarPorSelecao(lista: IntArray): IntArray {
    val novoArr = mutableListOf<Int>()
    val listaMutavel = lista.toMutableList() // Convertendo para uma lista mutável
    for (i in 0 until lista.size) {
        val menor = buscarMenor(listaMutavel.toIntArray()) // Convertendo de volta para IntArray
        novoArr.add(listaMutavel.removeAt(menor)) // Removendo e adicionando o menor elemento
    }
    return novoArr.toIntArray()
}