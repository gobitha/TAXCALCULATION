object CallByName {

  def main(args: Array[String]) {

    println("produce the output")

    output(input(10, 10))

  }

  def input(a: Int, b: Int): Int = {

    a , b

  }

  def output(a: => Int) = {

    println("the output is:" + a,+b)

  }

}


