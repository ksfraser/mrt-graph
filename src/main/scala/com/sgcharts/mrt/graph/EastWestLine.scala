package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.WUnDiEdge
import scalax.collection.edge.Implicits._

object EastWestLine {
  val name: String = "ewl"
  val graph: Graph[Station, WUnDiEdge] = Graph(
    (PasirRis ~% Tampines) (3),
    (Tampines ~% Simei) (3),
    (TanahMerah ~% Simei) (3),
    (TanahMerah ~% Expo) (3),
    (ChangiAirport ~% Expo) (5),
    (TanahMerah ~% Bedok) (3),
    (Kembangan ~% Bedok) (3),
    (Kembangan ~% Eunos) (2),
    (PayaLebar ~% Eunos) (2),
    (PayaLebar ~% Aljunied) (2),
    (Kallang ~% Aljunied) (2),
    (Kallang ~% Lavender) (2),
    (Bugis ~% Lavender) (2),
    (Bugis ~% CityHall) (2),
    (RafflesPlace ~% CityHall) (2),
    (RafflesPlace ~% TanjongPagar) (2),
    (OutramPark ~% TanjongPagar) (2),
    (OutramPark ~% TiongBahru) (3),
    (Redhill ~% TiongBahru) (2),
    (Redhill ~% Queenstown) (3),
    (Commonwealth ~% Queenstown) (2),
    (Commonwealth ~% BuonaVista) (2),
    (Dover ~% BuonaVista) (2),
    (Dover ~% Clementi) (3),
    (JurongEast ~% Clementi) (4),
    (JurongEast ~% ChineseGarden) (3),
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
