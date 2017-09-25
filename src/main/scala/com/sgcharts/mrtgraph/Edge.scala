package com.sgcharts.mrtgraph

final case class Edge(left: Station,
                      right: Station,
                      travelMinutes: Int,
                      transferMinutes: Int = 0,
               ) {
  def cost(): Int = {
    0
  }
}
