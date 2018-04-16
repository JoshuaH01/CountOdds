import org.scalatest.{MustMatchers, WordSpec}

class KataSpec extends WordSpec with MustMatchers {

  "Kata" when {
    "countOdds is called" should {
      "take in an int and provide a int" in {
        Kata.countOdds(2) mustEqual 2
      }
    }

    "countOdds is called" should {
      "take in an int and provide a list of ints" in {
        Kata.countOdds(5) mustEqual List(5 to 20)
      }
    }

    "countOdds is called" should {
      "take in an int and provide a list of even ints" in {
        Kata.countOdds(5) mustEqual (8)
      }
    }
  }
}
