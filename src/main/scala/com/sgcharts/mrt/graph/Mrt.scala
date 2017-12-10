package com.sgcharts.mrt.graph

import com.typesafe.config.ConfigFactory

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object Mrt extends RailLine {
  private val conf = ConfigFactory.load()
  private val mrtTam: Int = conf.getInt("trainArrivalMinutes.mrt")
  private val lrtTam: Int = conf.getInt("trainArrivalMinutes.lrt")
  private val tampinesPtm: Int = conf.getInt("platformTransferMinutes.TampinesDtl_Ewl")
  private val expoPtm: Int = conf.getInt("platformTransferMinutes.ExpoDtl_Ewl")
  private val payaLebarPtm: Int = conf.getInt("platformTransferMinutes.PayaLebarCcl_Ewl")
  private val bugisPtm: Int = conf.getInt("platformTransferMinutes.BugisDtl_Ewl")
  private val cityHallPtm: Int = conf.getInt("platformTransferMinutes.CityHallNsl_Ewl")
  private val rafflesPlacePtm: Int = conf.getInt("platformTransferMinutes.RafflesPlaceNsl_Ewl")
  private val outramParkPtm: Int = conf.getInt("platformTransferMinutes.OutramParkNel_Ewl")
  private val buonaVistaPtm: Int = conf.getInt("platformTransferMinutes.BuonaVistaCcl_Ewl")
  private val jurongEastPtm: Int = conf.getInt("platformTransferMinutes.JurongEastNsl_Ewl")
  private val newtonPtm: Int = conf.getInt("platformTransferMinutes.NewtonDtl_Nsl")
  private val dhobyGhautCclNelPtm: Int = conf.getInt("platformTransferMinutes.DhobyGhautCcl_Nel")
  private val dhobyGhautCclNslPtm: Int = conf.getInt("platformTransferMinutes.DhobyGhautCcl_Nsl")
  private val dhobyGhautNelNslPtm: Int = conf.getInt("platformTransferMinutes.DhobyGhautNel_Nsl")
  private val marinaBayPtm: Int = conf.getInt("platformTransferMinutes.MarinaBayCcl_Nsl")
  private val harbourfrontPtm: Int = conf.getInt("platformTransferMinutes.HarbourFrontCcl_Nel")
  private val chinatownPtm: Int = conf.getInt("platformTransferMinutes.ChinatownDtl_Nel")
  private val littleIndiaPtm: Int = conf.getInt("platformTransferMinutes.LittleIndiaDtl_Nel")
  private val serangoonPtm: Int = conf.getInt("platformTransferMinutes.SerangoonCcl_Nel")
  private val bayfrontPtm: Int = conf.getInt("platformTransferMinutes.BayfrontDtl_Ccl")
  private val promenadePtm: Int = conf.getInt("platformTransferMinutes.PromenadeDtl_Ccl")
  private val macphersonPtm: Int = conf.getInt("platformTransferMinutes.MacPhersonDtl_Ccl")
  private val botanicGardensPtm: Int = conf.getInt("platformTransferMinutes.BotanicGardensDtl_Ccl")
  private val sengkangPtm: Int = conf.getInt("platformTransferMinutes.SengkangNel_Lrt")
  private val punggolPtm: Int = conf.getInt("platformTransferMinutes.PunggolNel_Lrt")
  private val choaChuKangPtm: Int = conf.getInt("platformTransferMinutes.ChoaChuKangNsl_Lrt")
  private val bukitPanjangPtm: Int = conf.getInt("platformTransferMinutes.BukitPanjangDtl_Lrt")
  val name: String = "mrt"
  private val interchanges: Graph[Platform, WUnDiEdge] = Graph(
    (TampinesDtl ~% TampinesEwl) (mrtTam + tampinesPtm),
    (ExpoDtl ~% ExpoEwl) (mrtTam + expoPtm),
    (PayaLebarCcl ~% PayaLebarEwl) (mrtTam + payaLebarPtm),
    (BugisDtl ~% BugisEwl) (mrtTam + bugisPtm),
    (CityHallNsl ~% CityHallEwl) (mrtTam + cityHallPtm),
    (RafflesPlaceNsl ~% RafflesPlaceEwl) (mrtTam + rafflesPlacePtm),
    (OutramParkNel ~% OutramParkEwl) (mrtTam + outramParkPtm),
    (BuonaVistaCcl ~% BuonaVistaEwl) (mrtTam + buonaVistaPtm),
    (JurongEastNsl ~% JurongEastEwl) (mrtTam + jurongEastPtm),
    (NewtonDtl ~% NewtonNsl) (mrtTam + newtonPtm),
    (DhobyGhautCcl ~% DhobyGhautNel) (mrtTam + dhobyGhautCclNelPtm),
    (DhobyGhautCcl ~% DhobyGhautNsl) (mrtTam + dhobyGhautCclNslPtm),
    (DhobyGhautNel ~% DhobyGhautNsl) (mrtTam + dhobyGhautNelNslPtm),
    (MarinaBayCcl ~% MarinaBayNsl) (mrtTam + marinaBayPtm),
    (HarbourFrontCcl ~% HarbourFrontNel) (mrtTam + harbourfrontPtm),
    (ChinatownDtl ~% ChinatownNel) (mrtTam + chinatownPtm),
    (LittleIndiaDtl ~% LittleIndiaNel) (mrtTam + littleIndiaPtm),
    (SerangoonCcl ~% SerangoonNel) (mrtTam + serangoonPtm),
    (BayfrontDtl ~% BayfrontCcl) (mrtTam + bayfrontPtm),
    (PromenadeDtl ~% PromenadeCcl) (mrtTam + promenadePtm),
    (MacPhersonDtl ~% MacPhersonCcl) (mrtTam + macphersonPtm),
    (BotanicGardensDtl ~% BotanicGardensCcl) (mrtTam + botanicGardensPtm),
    (SengkangNel ~% SengkangLrt) (lrtTam + sengkangPtm),
    (PunggolNel ~% PunggolLrt) (lrtTam + punggolPtm),
    (ChoaChuKangNsl ~% ChoaChuKangLrt) (lrtTam + choaChuKangPtm),
    (BukitPanjangDtl ~% BukitPanjangLrt) (lrtTam + bukitPanjangPtm)
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
