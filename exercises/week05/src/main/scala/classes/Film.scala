package classes

case class Film(name:String, yearOfRelease:Int, imdbRating:Double, director:Director) {
  def directorsAge:Int = yearOfRelease - director.yearOfBirth
  def isDirectedBy(director: Director) = director == this.director
}

object Film {
  def highestRating(firstFilm:Film, secondFilm:Film):Film = {
    if(firstFilm.imdbRating >= secondFilm.imdbRating) firstFilm else secondFilm
  }

  def oldestDirectorAtTheTime(firstFilm:Film, secondFilm:Film):Director = {
    if(firstFilm.directorsAge >= secondFilm.directorsAge) firstFilm.director else secondFilm.director
  }
}