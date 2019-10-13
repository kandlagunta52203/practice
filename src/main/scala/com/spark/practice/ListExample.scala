package com.spark.practice

object ListExample extends App {
  // Make a list via the companion object factory
  val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

  // Make a list element-by-element
  val when = "AM" :: "PM" :: List()

  // Pattern match
  days match {
    case firstDay :: otherDays =>
      println("The first day of the week is: " + days(3))
      println("First element in list is:"+ firstDay)
    case List() =>
      println("There don't seem to be any week days.")
    case _ => println("nothing found")

  }
}
