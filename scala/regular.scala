import scala.util.matching.Regex
object Regular {
 def main(args: Array[String]) {
      val pattern = "GOBIIITHAVANI".r
      val str = "GOBITHAVANIK is GOBIIITHAVANI and cool"
      
      println(pattern findFirstIn str)
   }
}
