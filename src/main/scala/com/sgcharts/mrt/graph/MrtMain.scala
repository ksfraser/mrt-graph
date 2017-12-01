package com.sgcharts.mrt.graph

import com.sgcharts.mrt.graph.Mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge
import scala.collection.mutable

object MrtMain {
  def main(args: Array[String]): Unit = {
    val g = Mrt.graph
    val ps: Array[Platform] = g.toOuterNodes.toArray
    val wmap = mutable.Map[String, Int]()
    for (i <- ps.indices) {
      for (j <- ps.indices) {
        if (j > i) {
          val pair: String = pairToString(ps(i), ps(j))
          val w: Int = g.get(ps(i)).shortestPathTo(g.get(ps(j))) match {
            case Some(path) =>
              path.weight.toInt
            case _ =>
              throw new IllegalStateException(s"Path not found between ${ps(i)} and ${ps(j)}")
          }
          wmap += pair -> w
        }
      }
    }
  }

  private def pairToString(p1: Platform, p2: Platform): String = {
    val s1 = s"${p1.station}_${p1.line.name}"
    val s2 = s"${p2.station}_${p2.line.name}"
    if (s1.compare(s2) > 0) {
      s"$s2,$s1"
    } else {
      s"$s1,$s2"
    }
  }

  private def shortestPath(graph: Graph[Platform, WUnDiEdge], from: Platform, to: Platform): Unit = {
    graph.get(from).shortestPathTo(graph.get(to)) match {
      case Some(p) =>
        val nodes = p.nodes
        val w = p.weight
        println(s"$p\n$nodes size=${nodes.size}\nweight=$w")
      case _ => println("Path not found")
    }
  }
}
