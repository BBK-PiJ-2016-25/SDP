package classes

import org.scalatest.{FunSpec, GivenWhenThen}

/**
  * Created by anniehawes on 25/04/2017.
  */
class PersonSpec extends FunSpec with GivenWhenThen {

    var person: Person = _

    describe("A Person") {

      it("should successfully allocate first and last names") {
        Given("a new person Annie Hawes")
        person = Person("Annie Hawes")

        Then("the first name should be Annie")
        assert(person.firstName == "Annie")

        And("the last name should be Hawes")
        assert(person.lastName == "Hawes")
      }
    }
}
