package com.sgcharts.mrt.graph

import com.typesafe.config.ConfigFactory

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object Mrt extends RailLine {
  private val conf = ConfigFactory.load()
  private val trainArrivalMinutes: Int = conf.getInt("trainArrivalMinutes")
  val name: String = "mrt"
  private val interchanges: Graph[Platform, WUnDiEdge] = Graph(
    (TampinesDtl ~% TampinesEwl) (trainArrivalMinutes + 4),
    (ExpoDtl ~% ExpoEwl) (trainArrivalMinutes + 4),
    (PayaLebarCcl ~% PayaLebarEwl) (trainArrivalMinutes + 4),
    (BugisDtl ~% BugisEwl) (trainArrivalMinutes + 4),
    (CityHallNsl ~% CityHallEwl) (trainArrivalMinutes + 4),
    (RafflesPlaceNsl ~% RafflesPlaceEwl) (trainArrivalMinutes + 4),
    (OutramParkNel ~% OutramParkEwl) (trainArrivalMinutes + 4),
    (BuonaVistaCcl ~% BuonaVistaEwl) (trainArrivalMinutes + 4),
    (JurongEastNsl ~% JurongEastEwl) (trainArrivalMinutes + 4),
    (NewtonDtl ~% NewtonNsl) (trainArrivalMinutes + 4),
    (DhobyGhautCcl ~% DhobyGhautNel) (trainArrivalMinutes + 4),
    (DhobyGhautCcl ~% DhobyGhautNsl) (trainArrivalMinutes + 4),
    (DhobyGhautNel ~% DhobyGhautNsl) (trainArrivalMinutes + 4),
    (MarinaBayCcl ~% MarinaBayNsl) (trainArrivalMinutes + 4),
    (HarbourFrontCcl ~% HarbourFrontNel) (trainArrivalMinutes + 4),
    (ChinatownDtl ~% ChinatownNel) (trainArrivalMinutes + 4),
    (LittleIndiaDtl ~% LittleIndiaNel) (trainArrivalMinutes + 4),
    (SerangoonCcl ~% SerangoonNel) (trainArrivalMinutes + 4),
    (BayfrontDtl ~% BayfrontCcl) (trainArrivalMinutes + 4),
    (PromenadeDtl ~% PromenadeCcl) (trainArrivalMinutes + 4),
    (MacPhersonDtl ~% MacPhersonCcl) (trainArrivalMinutes + 4),
    (BotanicGardensDtl ~% BotanicGardensCcl) (trainArrivalMinutes + 4),
    (SengkangNel ~% SengkangLrt) (trainArrivalMinutes + 3),
    (PunggolNel ~% PunggolLrt) (trainArrivalMinutes + 3),
    (ChoaChuKangNsl ~% ChoaChuKangLrt) (trainArrivalMinutes + 3),
    (BukitPanjangDtl ~% BukitPanjangLrt) (trainArrivalMinutes + 3)
  )
  val graph: Graph[Platform, WUnDiEdge] = EastWestLine.graph ++
    NorthSouthLine.graph ++
    NorthEastLine.graph ++
    CircleLine.graph ++
    DowntownLine.graph ++
    SengkangLine.graph ++
    PunggolLine.graph ++
    BukitPanjangLine.graph ++
    interchanges

}
