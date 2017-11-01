package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge
import scalax.collection.edge.Implicits._

object EastWestLine {
  val name: String = "ewl"
  val graph: Graph[Station, WUnDiEdge] = Graph(
    (PasirRis ~% Tampines)(2),
    (Tampines ~% Simei)(3)
  )
  
  def main(args: Array[String]): Unit = {
    println(graph)
  }
}
