fun main() {
    print(solution(mutableListOf(7, 2, 2, 5, 10, 7)))
}

fun solution(arr: MutableList<Int>): Boolean {
    val start = arr[0]
    val end = arr[arr.size - 1]
    val mid = arr[arr.size / 2] + if (arr.size % 2 == 0) {
        arr[(arr.size / 2) - 1]
    } else {
        0
    }

    if (start == end && end == mid) {
        return true
    }

    return false
}
