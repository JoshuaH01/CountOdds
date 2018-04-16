object Kata extends App {

  def countOdds( input : Int) : Int = {
   val evenList = (input to 20).toList.filter((i: Int) => i % 2 == 0)
    evenList.length
  }
  countOdds(5)
}
