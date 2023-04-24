fun main(args: Array<String>) {
    val classes = listOf("AnitaB", "AdaLab", "HopperLab")//immutable

    println(classes)

    var colors = mutableListOf("black", "green", "blue", "yellow")//mutable

    println(colors)


    var nums = listOf(30, 33, 4, 60, 217, 649, 20, 90, 55)

    val len = nums.count()
    println(len)
    val max = nums.max()
    println(max)
    val min = nums.min()
    println(min)
    val sum = nums.sum()
    println(sum)
    val avg = nums.average()
    println(avg)
    val firstItem = nums.first()
    println(firstItem)
    val lastItem = nums.last()
    println(lastItem)

    var mycolors = mutableListOf("black", "red", "violet", "yellow")
    println(mycolors[0])
    println(mycolors.get(2))
    println(mycolors.indexOf("green"))
    println(mycolors.lastIndex)


    val numbers = listOf(21, 7, 7, 10, 9, 19, 26, 32)
    println(numbers.contains(5))




}