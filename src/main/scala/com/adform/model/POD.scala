package com.adform.model

/**
 * Created by Yury Talapila on 18.2.15.
 */
class POD(name: String, employees: List[Employee])
{
  def addEmployee(employee: Employee) = POD(name, employees :+ employee)

  def removeEmployee(employee: Employee) = POD(name, employees.filter(_ != employee))

  def hasEmployee(employee: Employee) = employees.exists(_ == employee)
}

object POD {
  def apply(name: String, employees: List[Employee]) = new POD(name, employees)
}
