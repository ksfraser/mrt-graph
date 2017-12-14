package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object PunggolLine extends RailLine {
  val name: String = "pglrt"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (PunggolLrt ~% SamKee) (2),
    (PunggolPoint ~% SamKee) (2),
    (PunggolPoint ~% Samudera) (1),
    (Nibong ~% Samudera) (1),
    (Nibong ~% Sumang) (1),
    (SooTeck ~% Sumang) (1),
    (SooTeck ~% PunggolLrt) (3),
    (Cove ~% PunggolLrt) (2),
    (Cove ~% Meridian) (1),
    (CoralEdge ~% Meridian) (2),
    (CoralEdge ~% Riviera) (1),
    (Kadaloor ~% Riviera) (1),
    (Kadaloor ~% Oasis) (1),
    (Damai ~% Oasis) (2),
    (Damai ~% PunggolLrt) (2)
  )
}
