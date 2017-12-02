package com.sgcharts.mrt.graph

import com.sgcharts.mrt.graph.Mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object MrtMain {
  def main(args: Array[String]): Unit = {
    val g = Mrt.graph
    val ps: Array[Platform] = g.toOuterNodes.toArray
    val wmap = mutable.Map[String, Int]()
    val smap = mutable.SortedMap[Int, ArrayBuffer[Platform]]()
    for (i <- ps.indices) {
      var sum: Int = 0
      for (j <- ps.indices) {
        val pair: String = pairToString(ps(i), ps(j))
        val w: Int = if (j > i) {
          val tmp: Int = weight(g, ps(i), ps(j))
          wmap += pair -> tmp
          tmp
        } else {
          wmap.get(pair) match {
            case Some(v) => v
            case _ =>
              throw new IllegalStateException(s"Map: Path not found between ${ps(i)} and ${ps(j)}")
          }
        }
        sum += w
      }
      smap.get(sum) match {
        case Some(platforms) =>
          platforms += ps(i)
          smap += sum -> platforms
        case _ =>
          smap += sum -> ArrayBuffer(ps(i))
      }
    }
  }

  private def weight(g: Graph[Platform, WUnDiEdge], p1: Platform, p2: Platform): Int = {
    g.get(p1).shortestPathTo(g.get(p2)) match {
      case Some(path) =>
        path.weight.toInt
      case _ =>
        throw new IllegalStateException(s"Graph: Path not found between $p1 and $p2")
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
