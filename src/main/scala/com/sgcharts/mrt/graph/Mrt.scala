package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object Mrt extends RailLine {
  val name: String = "dtl"
  private val interchanges: Graph[Platform, WUnDiEdge] = Graph(
    (TampinesDtl ~% TampinesEwl) (1)
  )
  val graph: Graph[Platform, WUnDiEdge] = EastWestLine.graph ++
    NorthSouthLine.graph ++
    NorthEastLine.graph ++
    CircleLine.graph ++
    DowntownLine.graph ++
    interchanges
}
