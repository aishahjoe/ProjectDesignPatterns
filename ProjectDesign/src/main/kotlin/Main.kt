/*
Student ID: B221202902
Name: Siti Aishah
Surname: Binti Johan Iskandar
Course Name: SWE303 Design Pattern
Homework Number: 3 || Project/Design
Summary: Strategy Design Pattern is a behavioral design pattern that lets you define a family of algorithms,
put each of them into a separate class, and make their objects interchangeable. For example, there are two classes
that implement SortStrategy interface. If we need to add classes like BubbleSort or MergeSort later, it can be
easily added without interfering with SortStrategy interface.
*/
fun main() {
    val numbers = arrayOf(4, 56, 12, 79, 25, 2)
    sort(AscendingSortStrategy(), numbers) // Output: Numbers are sorted in ascending order
    sort(DescendingSortStrategy(), numbers) // Output: Numbers are sorted in descending order
}

fun sort(sortStrategy: SortStrategy, numbers: Array<Int>) {
    sortStrategy.sort(numbers)
}

interface SortStrategy {
    fun sort(numbers: Array<Int>)
}

class AscendingSortStrategy : SortStrategy {
    override fun sort(numbers: Array<Int>) {
        println("Sorted ascending: ${numbers.sorted()}")
    }
}

class DescendingSortStrategy: SortStrategy {
    override fun sort(numbers: Array<Int>) {
        println("Sorted descending: ${numbers.sortedDescending()}")
    }
}