package com.sgcharts.mrtgraph.core

import scala.collection.SortedMap
import scala.collection.mutable.ArrayBuffer

object MrtMain {
  def main(args: Array[String]): Unit = {
    val g = Mrt.graph
    val rmap: SortedMap[Int, ArrayBuffer[Platform]] = Closeness.rank(g)
    var i: Int = 0
    for ((score, ps) <- rmap) {
      i += 1
      println(s"$i. ($score): ${ps mkString ","}")
    }
  }
}
