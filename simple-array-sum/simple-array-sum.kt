import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val array = Array(n, { scanner.nextInt() })
    System.out.println(array.sum())
}

