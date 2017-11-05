package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object NorthSouthLine extends RailLine {
  val name: String = "nsl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (JurongEastNsl ~% BukitBatok) (3),
    (BukitGombak ~% BukitBatok) (2),
    (BukitGombak ~% ChoaChuKang) (3),
    (YewTee ~% ChoaChuKang) (3),
    (YewTee ~% Kranji) (4),
    (Marsiling ~% Kranji) (3),
    (Marsiling ~% Woodlands) (2),
    (Admiralty ~% Woodlands) (2),
    (Admiralty ~% Sembawang) (3),
    (Yishun ~% Sembawang) (4),
    (Yishun ~% Khatib) (2),
    (YioChuKang ~% Khatib) (5),
    (YioChuKang ~% AngMoKio) (2),
    (Bishan ~% AngMoKio) (3),
    (Bishan ~% Braddell) (2),
    (ToaPayoh ~% Braddell) (2),
    (ToaPayoh ~% Novena) (2),
    (Newton ~% Novena) (2),
    (Newton ~% Orchard) (2),
    (Somerset ~% Orchard) (1),
    (Somerset ~% DhobyGhautNsl) (2),
    (CityHallNsl ~% DhobyGhautNsl) (2),
    (CityHallNsl ~% RafflesPlaceNsl) (2),
    (MarinaBay ~% RafflesPlaceNsl) (2),
    (MarinaBay ~% MarinaSouthPier) (1),
  )
}
