package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object SengkangLine extends RailLine {
  val name: String = "sklrt"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (SengkangLrt ~% ChengLim) (2),
    (Farmway ~% ChengLim) (1),
    (Farmway ~% Kupang) (1),
    (Thanggam ~% Kupang) (1),
    (Thanggam ~% Fernvale) (1),
    (Layar ~% Fernvale) (1),
    (Layar ~% Tongkang) (1),
    (Renjong ~% Tongkang) (1),
    (Renjong ~% SengkangLrt) (3),
    (Compassvale ~% SengkangLrt) (2),
    (Compassvale ~% Rumbia) (1),
    (Bakau ~% Rumbia) (1),
    (Bakau ~% Kangkar) (1),
    (Ranggung ~% Kangkar) (2),
    (Ranggung ~% SengkangLrt) (3)
  )
}
