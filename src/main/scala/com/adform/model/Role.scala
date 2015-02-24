package com.adform.model

/**
 * Created by Yury Talapila on 18.2.15.
 */
sealed trait Role

case object Admin extends Role

case object PODLead extends Role

case object PODKeeper extends Role

case object User extends Role

case object Viewer extends Role

case class CustomRole(name: String) extends Role
