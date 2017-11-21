package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object DowntownLine extends RailLine {
  val name: String = "dtl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (BukitPanjang ~% Cashew) (1),
    (Hillview ~% Cashew) (2),
    (Hillview ~% BeautyWorld) (3),
    (KingAlbertPark ~% BeautyWorld) (2),
    (KingAlbertPark ~% SixthAvenue) (3),
    (TanKahKee ~% SixthAvenue) (2),
    (TanKahKee ~% BotanicGardensDtl) (2),
    (Stevens ~% BotanicGardensDtl) (2),
    (Stevens ~% NewtonDtl) (2),
    (LittleIndiaDtl ~% NewtonDtl) (2),
    (LittleIndiaDtl ~% Rochor) (1),
    (BugisDtl ~% Rochor) (2),
    (BugisDtl ~% PromenadeDtl) (2),
    (BayfrontDtl ~% PromenadeDtl) (2),
    (BayfrontDtl ~% Downtown) (2),
    (TelokAyer ~% Downtown) (1),
    (TelokAyer ~% ChinatownDtl) (2),
    (FortCanning ~% ChinatownDtl) (2),
    (FortCanning ~% Bencoolen) (1),
    (JalanBesar ~% Bencoolen) (2),
    (JalanBesar ~% Bendemeer) (2),
    (GeylangBahru ~% Bendemeer) (2),
    (GeylangBahru ~% Mattar) (3),
    (MacPhersonDtl ~% Mattar) (1),
    (MacPhersonDtl ~% Ubi) (2),
    (KakiBukit ~% Ubi) (2),
    (KakiBukit ~% BedokNorth) (2),
    (BedokReservoir ~% BedokNorth) (3),
    (BedokReservoir ~% TampinesWest) (2),
    (TampinesDtl ~% TampinesWest) (2),
    (TampinesDtl ~% TampinesEast) (2),
    (UpperChangi ~% TampinesEast) (3),
    (UpperChangi ~% ExpoDtl) (2)
  )
}
