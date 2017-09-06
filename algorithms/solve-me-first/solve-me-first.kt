import java.util.Scanner;

fun solveMeFirst(a: Int, b: Int): Int = a + b

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    println(solveMeFirst(num1, num2))
}

