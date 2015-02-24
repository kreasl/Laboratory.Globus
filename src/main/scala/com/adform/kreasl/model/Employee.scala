package com.adform.kreasl.model

/**
 * Created by Yury Talapila on 18.2.15.
 */
class Employee(name: String, roles: List[Role]) {
  
  def addRole(role: Role) = Employee(name, roles :+ role)

  def removeRole(role: Role) = Employee(name, roles.filter(_ != role))

  def hasRole(role: Role) = roles.exists(_ == role)
}

object Employee {
  def apply(name: String, roles: List[Role]) = new Employee(name, roles)
}