package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge

object ShortestPathMain {
  def main(args: Array[String]): Unit = {
    val g = Mrt.graph
    shortestPath(g, BedokReservoir, PromenadeDtl)
  }

  private def shortestPath(graph: Graph[Platform, WUnDiEdge], from: Platform, to: Platform): Unit = {
    graph.get(from).shortestPathTo(graph.get(to)) match {
      case Some(p) =>
        val nodes = p.nodes
        val w = p.weight
        println(s"$p\n$nodes size=${nodes.size}\nweight=$w")
      case _ => println(s"Path not found, from $from to $to")
    }
  }
}
