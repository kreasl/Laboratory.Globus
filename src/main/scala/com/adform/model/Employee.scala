package com.adform.model

/**
 * Created by Yury Talapila on 18.2.15.
 */

trait Profile {
  val name: String
  val roles: List[Role]

  def applyRolesPermissions(operation: Any) = ???
}

case class Employee(name: String, roles: List[Role]) extends Profile {

  def withRole(role: Role): List[Role] = roles :+ role
  def withoutRole(role: Role): List[Role] = roles.filter(_ != role)
  def hasRole(role: Role): Boolean = roles.exists(_ == role)
}
