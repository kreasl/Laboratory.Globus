package com.adform.kreasl.util

/**
 * Created by Yury Talapila on 18.2.15.
 */
trait Partial[T] {
  def partial(collection: List[T], operation: (List[T], T) => List[T]) =
    operation(collection, _: T)

  def addTo(collection: List[T], element: T) = collection :+ element

  def removeFrom(collection: List[T], element: T) = collection filter (_ != element)
}
