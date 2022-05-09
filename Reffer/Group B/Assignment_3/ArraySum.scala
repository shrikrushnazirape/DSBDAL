object ArraySum{
    def main(args: Array[String]) : Unit = {
        var nums = Array(1.2, 1.7, 1.12, 1.16, 1.81,1.99)
        println("Original Array Elements : ")
        for(x<-nums){
            print(s"${x}, ")
    }
    println("\nUsing Sum():")
    val result = nums.sum
    println(s"Result: ${result}");
    println("Using for loop : ")
    var total = 0.0;
    for(i<-0 to (nums.length-1)){
      total+=nums(i);
}
println(s"result: ${total}");
}
}
