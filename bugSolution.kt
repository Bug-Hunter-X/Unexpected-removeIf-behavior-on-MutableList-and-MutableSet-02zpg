fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = list.filter { it % 2 == 0 }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val toRemoveSet = set.filter { it % 2 == 0 }
    set.removeAll(toRemoveSet)
    println(set) //Output: [1, 3, 5]

    //Alternative using iterator
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()){
        if(iterator.next() % 2 == 0){
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 3, 5]
} 