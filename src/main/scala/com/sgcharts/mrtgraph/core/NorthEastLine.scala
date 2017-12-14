package com.sgcharts.mrtgraph.core

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object NorthEastLine extends RailLine {
  val name: String = "nel"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (HarbourFrontNel ~% OutramParkNel) (4),
    (ChinatownNel ~% OutramParkNel) (2),
    (ChinatownNel ~% ClarkeQuay) (1),
    (DhobyGhautNel ~% ClarkeQuay) (3),
    (DhobyGhautNel ~% LittleIndiaNel) (2),
    (FarrerPark ~% LittleIndiaNel) (1),
    (FarrerPark ~% BoonKeng) (3),
    (PotongPasir ~% BoonKeng) (2),
    (PotongPasir ~% Woodleigh) (1),
    (SerangoonNel ~% Woodleigh) (2),
    (SerangoonNel ~% Kovan) (3),
    (Hougang ~% Kovan) (2),
    (Hougang ~% Buangkok) (2),
    (SengkangNel ~% Buangkok) (2),
    (SengkangNel ~% PunggolNel) (3)
  )
}
