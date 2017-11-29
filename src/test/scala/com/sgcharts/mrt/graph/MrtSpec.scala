package com.sgcharts.mrt.graph

import org.scalatest.FlatSpec
import com.sgcharts.mrt.graph.Mrt._

class MrtSpec extends FlatSpec {
  "Shortest Path" should "return list of nodes between Sengkang and SerangoonNel" in {
    val op = graph.get(Sengkang).shortestPathTo(graph.get(SerangoonNel))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Sengkang, Buangkok, Hougang, Kovan, SerangoonNel))(p.nodes.toList)
    }
  }
}
