package com.sgcharts.mrt.graph

import RailLine.RailLine

final case class Station(name: String,
                         lines: Set[RailLine]) {
  def is(line: RailLine): Boolean = {
    lines.contains(line)
  }
}

object Station {
  def isSameLine(stations: Station*): Boolean = {
    val size = stations.size
    if (size == 0) {
      throw new IllegalArgumentException("stations must not be empty")
    }
    val headLines = stations.head.lines
    for (s <- stations.tail) {
      if (headLines.intersect(s.lines).isEmpty) {
        return false // scalastyle:ignore
      }
    }
    true
  }
}
