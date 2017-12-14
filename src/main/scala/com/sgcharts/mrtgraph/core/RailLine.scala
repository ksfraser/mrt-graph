package com.sgcharts.mrtgraph.core

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge

trait RailLine {
  val name: String
  val graph: Graph[Platform, WUnDiEdge]
}
