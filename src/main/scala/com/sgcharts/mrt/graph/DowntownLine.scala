package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object DowntownLine extends RailLine {
  val name: String = "dtl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (DhobyGhautCcl ~% BrasBasah) (2)
  )
}
