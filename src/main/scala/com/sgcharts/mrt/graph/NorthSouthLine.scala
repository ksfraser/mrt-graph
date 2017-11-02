package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object NorthSouthLine extends RailLine {
  val name: String = "nsl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (PasirRis ~% Tampines) (3)
  )
}
