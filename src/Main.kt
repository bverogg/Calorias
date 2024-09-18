fun main(){
    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )
    println("Los Alimentos consumidos y sus calorías son los siguientes:")
    for (i in alimentos) {
        println(i.key + ": " + i.value + " cal.");
    }
    val caloriasConsumidas = alimentos.values.sum()

    println("");
    println("Alimentos Altos en calorías (Mayores o igual a 500 calorías)")
    val altosCalorias = alimentos.filter { it.value >= 500 }
    for (i in altosCalorias) {
        println(i.key);
    }

    println("");
    println("Alimentos Bajos en calorías (Menores a 500 calorías)")
    val bajosCalorias = alimentos.filter { it.value < 500 }
    for (i in bajosCalorias) {
        println(i.key);
    }

    println("");
    println("Total de calorías consumidas en el día: $caloriasConsumidas cal.");

    println("");
    val cuantosAltos=altosCalorias.size;
    println("Cantidad de alimentos que se consumieron 'Altos en calorías': $cuantosAltos");

}


