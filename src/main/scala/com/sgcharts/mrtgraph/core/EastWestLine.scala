package com.sgcharts.mrtgraph.core

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge
import scalax.collection.edge.Implicits._

object EastWestLine extends RailLine {
  val name: String = "ewl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (PasirRis ~% TampinesEwl) (3),
    (TampinesEwl ~% Simei) (3),
    (TanahMerah ~% Simei) (3),
    (TanahMerah ~% ExpoEwl) (3),
    (ChangiAirport ~% ExpoEwl) (5),
    (TanahMerah ~% Bedok) (3),
    (Kembangan ~% Bedok) (3),
    (Kembangan ~% Eunos) (2),
    (PayaLebarEwl ~% Eunos) (2),
    (PayaLebarEwl ~% Aljunied) (2),
    (Kallang ~% Aljunied) (2),
    (Kallang ~% Lavender) (2),
    (BugisEwl ~% Lavender) (2),
    (BugisEwl ~% CityHallEwl) (2),
    (RafflesPlaceEwl ~% CityHallEwl) (2),
    (RafflesPlaceEwl ~% TanjongPagar) (2),
    (OutramParkEwl ~% TanjongPagar) (2),
    (OutramParkEwl ~% TiongBahru) (3),
    (Redhill ~% TiongBahru) (2),
    (Redhill ~% Queenstown) (3),
    (Commonwealth ~% Queenstown) (2),
    (Commonwealth ~% BuonaVistaEwl) (2),
    (Dover ~% BuonaVistaEwl) (2),
    (Dover ~% Clementi) (3),
    (JurongEastEwl ~% Clementi) (4),
    (JurongEastEwl ~% ChineseGarden) (3),
    (Lakeside ~% ChineseGarden) (2),
    (Lakeside ~% BoonLay) (3),
    (Pioneer ~% BoonLay) (1),
    (Pioneer ~% JooKoon) (4),
    (GulCircle ~% JooKoon) (3),
    (GulCircle ~% TuasCrescent) (3),
    (TuasWestRoad ~% TuasCrescent) (2),
    (TuasWestRoad ~% TuasLink) (3),
  )
}
