import scala.util.Random
/**
  * Created by ahawes02 on 09/02/2017.
  */
object Hammurabi {

  var starved = 0 // how many people starved
  var immigrants = 5 // how many people came to the city
  var population = 100
  var harvest = 3000 // total bushels harvested
  var bushelsPerAcre = 3 // amount harvested for each acre planted
  var rats_ate = 200 // bushels destroyed by rats
  var bushelsInStorage = 2800
  var acresOwned = 1000
  var pricePerAcre = 19 // each acre costs this many bushels
  var plagueDeaths = 0

  def printIntroductoryMessage() {
    println(
      """Congratulations, you are the newest ruler of ancient Samaria, elected
        |for a ten year term of office. Your duties are to dispense food, direct
        |farming, and buy and sell land as needed to support your people. Watch
        |out for rat infestations and the plague! Grain is the general currency,
        |measured in bushels. The following will help you in your decisions:
        |* Each person needs at least 20 bushels of grain per year to survive.
        |* Each person can farm at most 10 acres of land.
        |* It takes 2 bushels of grain to farm an acre of land.
        |* The market price for land fluctuates yearly.
        |Rule wisely and you will be showered with appreciation at the end of
        |your term. Rule poorly and you will be kicked out of office!
        |"""
    )
  }

  def readInt(message: String): Int = {
    try {
      io.StdIn.readLine(message).toInt
    } catch {
      case _: Throwable =>
        println("That’s not an integer. Please enter an integer.")
        readInt(message)
    }
  }

  def askHowMuchLandToBuy(bushels: Int, price: Int) = {
    var acresToBuy = readInt("\nHow many acres will you buy?\n")
    while (acresToBuy < 0 || acresToBuy * price > bushels) {
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      acresToBuy = readInt("\nHow many acres will you buy?\n")
    }
    acresToBuy
  }

  def askHowMuchLandToSell(acresOwned: Int) = {
    var acresToSell = readInt("\nHow many acres will you sell?\n")
    while (acresToSell > acresOwned) {
      println("O Great Hammurabi, we own but " + acresOwned + " acres!")
      acresToSell = readInt("How many acres will you sell? ")
    }
    acresToSell
  }

  def askHowMuchGrainToFeedThePeople(bushels: Int) = {
    var bushelsToFeed = readInt("\nHow many bushels of grain will you feed the people?\n")
    while (bushelsToFeed > bushels) {
      println("O Great Hammurabi, we have but " + bushels + " bushels of grain!")
      bushelsToFeed = readInt("\nHow many bushels of grain will you feed the people?\n")
    }
    bushelsToFeed
  }

  def askHowManyAcresToPlant(acresOwned: Int, people: Int) = {
    var acresToPlant = readInt("\nHow many acres will you plant?\n")
    while (acresToPlant > acresOwned || acresToPlant > population*10) {
      println("O Great Hammurabi, we own but " + acresOwned + " acres, and have only " + population + " farmers!")
      acresToPlant = readInt("\nHow many acres will you plant?\n")
    }
    acresToPlant
  }

  def hammurabi(): Unit = {
    printIntroductoryMessage()

    var a = 0
    var acresBought = 0
    var acresSold = 0
    var grainFed = 0
    var acresPlanted = 0
    for(a <- 0 until 11) {
        println(
          "You are in year " + a + " of your ten year rule.\n" +
            "In the previous year " + starved + " people starved to death.\n" +
            "In the previous year " + immigrants + " people entered the kingdom.\n" +
            "The population is now " + population + ".\n" +
            "We harvested " + harvest + " bushels at " + bushelsPerAcre + " bushels per acre.\n" +
            "Rats destroyed " + rats_ate + " bushels, leaving " + bushelsInStorage + " bushels in storage.\n" +
            "The city owns " + acresOwned + " of land.\n" +
            "Land is currently worth " + pricePerAcre + " bushels per acre.\n" +
            "There were " + plagueDeaths + " deaths from the plague.\n \n"
        )
        var starvedBool = false
        plagueDeaths = 0
        rats_ate = 0
        acresBought = askHowMuchLandToBuy(bushelsInStorage, pricePerAcre)
        if (acresBought == 0) acresSold = askHowMuchLandToSell(acresOwned)
        grainFed = askHowMuchGrainToFeedThePeople(bushelsInStorage)
        acresPlanted = askHowManyAcresToPlant(acresOwned, population)

        if (Random.nextInt(100) < 15) {
          println("O Great Hammurabi, there has been a plague!")
          plagueDeaths = population / 2
          population = population - plagueDeaths
        }
        if (population - grainFed / 20 > 0) {
          starved = population - grainFed / 20
          starvedBool = true
        } else {
          starved = 0
        }
        if (starved / population > 0.45) {
          println("O Hammurabi, you have let us down! This game is over.")
          return
        }
        if(starvedBool) {
          immigrants = (20 * acresOwned + bushelsInStorage) / (100 * population) + 1
        } else {
          immigrants = 0
        }
        population = population + immigrants - starved - plagueDeaths
        harvest = bushelsPerAcre * acresPlanted
        bushelsPerAcre = Random.nextInt(8)+1
        if (Random.nextInt(100) < 40) {
          rats_ate = (Random.nextInt(3)+1/10)*bushelsInStorage
        }
        bushelsInStorage = bushelsInStorage + (pricePerAcre * acresSold) - (pricePerAcre * acresBought) - grainFed + harvest - rats_ate - acresPlanted*2
        acresOwned = acresOwned + acresBought - acresSold
        pricePerAcre = Random.nextInt(7)+17
    }

    println (
      "Well done, you made it! Here are your stats:\n" +
      "Final population: " + population +
      "Final bushels balance " + bushelsInStorage
    )
  }

}
