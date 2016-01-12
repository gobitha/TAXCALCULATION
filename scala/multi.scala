class Multi {
  def test() {
    println("natchiyar and gobithavani")
  }
}

object Nam {

  def main(args: Array[String]) {
    var factor = 456654657
    val multiplier = (i: Int) => i * factor
    val m = new Multi()
    m.test()
    
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }
}
