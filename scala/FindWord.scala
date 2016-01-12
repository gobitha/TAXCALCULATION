import scala.io.Source
object FindWord {
  def findWord(file: String, wordToFind: String) {
  val src = Source.fromFile("test.txt")
  for {
    (line, idx) <- src.getLines.zipWithIndex
    if line.contains(wordToFind)
  } {
    println(f"$idx%02d: " + line)
  }
}
  
}