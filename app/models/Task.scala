package models

import anorm._
import anorm.SqlParser._

val task = {
    get[Long]("id") ~
    get[String]("label") map {
        case id ~ label => Task(id, label)
    }
}

case class Task(id: Long, label: String)

object Task {

  def all(): List[Task] = Nil

  def create(label: String) {}

  def delete(id: Long) {}

}

