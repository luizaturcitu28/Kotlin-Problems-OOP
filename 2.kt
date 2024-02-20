class Sorter {
    fun sortingAlg(arr: IntArr, size: IntSize)
    {
        var startIndex = 0;
        while(startIndex < arr.size)
        {
            var maxIndex = startIndex
            for(i in startIndex + 1 until arr.size)
            {
                if(arr[i] > arr[minIndex])
                {
                    maxIndex = i;
                }
            }
            val temp = arr[startIndex]
            arr[startIndex] = arr[maxIndex]
            arr[minIndex] = temp;
            startIndex++
        }
    }
    fun printArray(arr: IntArr, size: IntSize)
    {
        for(i in arr)
        {
            println("$i")
        }
        println()
    }
}

fun main() 
{
    val arr = intArrayOf{40, 8, 11, 2, 99}
    val sorter = Sorter()
    sorter.sortingAlg(arr, size)
    sorter.printArray(arr, size)
}