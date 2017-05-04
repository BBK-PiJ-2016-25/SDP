package classes

import org.scalatest.{BeforeAndAfter, FunSuite}

class FilmTest extends FunSuite with BeforeAndAfter {

  var eastwood: Director = _
  var mcTiernan: Director = _
  var nolan: Director = _
  var someGuy: Director = _

  var memento: Film = _
  var darkKnight: Film = _
  var inception: Film = _
  var highPlainsDrifter: Film = _
  var outlawJoseyWales: Film = _
  var unforgiven: Film = _
  var granTorino: Film = _
  var invictus: Film = _
  var predator: Film = _
  var dieHard: Film = _
  var huntForRedOctober: Film = _
  var thomasCrownAffair: Film = _

  before {
    eastwood = Director("Clint", "Eastwood", 1930)
    mcTiernan = Director("John", "McTiernan", 1951)
    nolan = Director("Christopher", "Nolan", 1970)
    someGuy = Director("Just", "Some Guy", 1990)

    memento = Film("Memento", 2000, 8.5, nolan)
    darkKnight = Film("Dark Knight", 2008, 9.0, nolan)
    inception = Film("Inception", 2010, 8.8, nolan)

    highPlainsDrifter = Film("High Plains Drifter", 1973, 7.7, eastwood)
    outlawJoseyWales = Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    unforgiven = Film("Unforgiven", 1992, 8.3, eastwood)
    granTorino = Film("Gran Torino", 2008, 8.2, eastwood)
    invictus = Film("Invictus", 2009, 7.4, eastwood)

    predator = Film("Predator", 1987, 7.9, mcTiernan)
    dieHard = Film("Die Hard", 1988, 8.3, mcTiernan)
    huntForRedOctober = Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
    thomasCrownAffair = Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)
  }

  test("yearOfBirth returns correct year of birth for director") {
    assert(eastwood.yearOfBirth == 1930)
    assert(mcTiernan.yearOfBirth == 1951)
  }

  test("name returns first and last names appended for director") {
    assert(nolan.name == "Christopher Nolan")
    assert(someGuy.name == "Just Some Guy")
  }

  test("isDirectedBy returns where correct director is supplied for a film") {
    assert(unforgiven.isDirectedBy(eastwood))
  }

  test("directorsAge returns correct age for director at time of release") {
    assert(predator.directorsAge == 36)
  }

  test("older returns older of two directors") {
    assert(Director.older(nolan, eastwood).equals(eastwood))
  }

  test("highestRated returns film with higher imdb rating") {
    assert(Film.highestRating(inception, outlawJoseyWales).equals(inception))
  }

  test("oldestDirectorAtTheTime returns older of directors at time of filming") {
    assert(Film.oldestDirectorAtTheTime(memento, huntForRedOctober).equals(mcTiernan))
  }
}