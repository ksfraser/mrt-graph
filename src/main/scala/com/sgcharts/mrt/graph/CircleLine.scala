package com.sgcharts.mrt.graph

import scalax.collection.Graph
import scalax.collection.edge.Implicits._
import scalax.collection.edge.WUnDiEdge

object CircleLine extends RailLine {
  val name: String = "ccl"
  val graph: Graph[Platform, WUnDiEdge] = Graph(
    (DhobyGhautCcl ~% BrasBasah) (2),
    (Esplanade ~% BrasBasah) (2),
    (Esplanade ~% Promenade) (2),
    (Bayfront ~% Promenade) (2),
    (Bayfront ~% MarinaBayCcl) (2),
    (NicollHighway ~% Promenade) (2),
    (NicollHighway ~% Stadium) (2),
    (Mountbatten ~% Stadium) (2),
    (Mountbatten ~% Dakota) (2),
    (PayaLebarCcl ~% Dakota) (2),
    (PayaLebarCcl ~% MacPherson) (2),
    (TaiSeng ~% MacPherson) (2),
    (TaiSeng ~% Bartley) (2),
    (SerangoonCcl ~% Bartley) (2),
    (SerangoonCcl ~% LorongChuan) (2),
    (BishanCcl ~% LorongChuan) (2),
    (BishanCcl ~% Marymount) (2),
    (Caldecott ~% Marymount) (2),
    (Caldecott ~% BotanicGardens) (2),
    (FarrerRoad ~% BotanicGardens) (2),
    (FarrerRoad ~% HollandVillage) (2),
    (BuonaVistaCcl ~% HollandVillage) (2),
    (BuonaVistaCcl ~% OneNorth) (2),
    (KentRidge ~% OneNorth) (2),
    (KentRidge ~% HawParVilla) (2),
    (PasirPanjang ~% HawParVilla) (2),
    (PasirPanjang ~% LabradorPark) (2),
    (TelokBlangah ~% LabradorPark) (2),
    (TelokBlangah ~% HarbourFrontCcl) (2),
  )
}
