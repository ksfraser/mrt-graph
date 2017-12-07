package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object BukitPanjangLine extends RailLine {
  val name: String = "bplrt"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (ChoaChuKangLrt ~% SouthView) (1),
    (KeatHong ~% SouthView) (2),
    (KeatHong ~% TeckWhye) (2),
    (Phoenix ~% TeckWhye) (2),
    (Phoenix ~% TenMileJunction) (4),
    (BukitPanjangLrt ~% TenMileJunction) (2),
    (Phoenix ~% BukitPanjangLrt) (2),
    (Petir ~% BukitPanjangLrt) (2),
    (Petir ~% Pending) (2),
    (Bangkit ~% Pending) (2),
    (Bangkit ~% Fajar) (2),
    (Segar ~% Fajar) (2),
    (Segar ~% Jelapang) (2),
    (Senja ~% Jelapang) (2),
    (Senja ~% BukitPanjangLrt) (2)
  )
}
