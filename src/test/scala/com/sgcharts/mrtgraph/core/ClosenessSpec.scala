package com.sgcharts.mrtgraph.core

import org.scalatest.FlatSpec
import com.sgcharts.mrtgraph.core.Closeness._

import scala.collection.SortedMap
import scala.collection.mutable.ArrayBuffer

class ClosenessSpec extends FlatSpec {
  "rank" should "rank platforms by closeness centrality" in {
    assertResult(SortedMap[Int, ArrayBuffer[Platform]](
      267 -> ArrayBuffer[Platform](HarbourFrontNel),
      211 -> ArrayBuffer[Platform](OutramParkNel),
      187 -> ArrayBuffer[Platform](ChinatownNel),
      177 -> ArrayBuffer[Platform](ClarkeQuay),
      153 -> ArrayBuffer[Platform](DhobyGhautNel),
      141 -> ArrayBuffer[Platform](LittleIndiaNel, SerangoonNel),
      137 -> ArrayBuffer[Platform](FarrerPark),
      131 -> ArrayBuffer[Platform](BoonKeng, PotongPasir),
      133 -> ArrayBuffer[Platform](Woodleigh),
      159 -> ArrayBuffer[Platform](Kovan),
      175 -> ArrayBuffer[Platform](Hougang),
      195 -> ArrayBuffer[Platform](Buangkok),
      219 -> ArrayBuffer[Platform](SengkangNel),
      261 -> ArrayBuffer[Platform](PunggolNel)
    )) {
      rank(NorthEastLine.graph)
    }
  }
}
