package com.edureka.ex14

class Dog


package people {

class Person2 {
  val dogs = new scala.collection.mutable.ArrayBuffer[Dog]
  def description = "A person with " + dogs.length + " dogs"    
}

}


object Main14 extends App {
  val fred = new com.edureka.ex14.people.Person2
  fred.dogs += new Dog 
  fred.dogs += new Dog
  println(fred.description)
}