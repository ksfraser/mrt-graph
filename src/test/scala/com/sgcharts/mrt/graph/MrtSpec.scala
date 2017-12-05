package com.sgcharts.mrt.graph

import org.scalatest.FlatSpec
import com.sgcharts.mrt.graph.Mrt._

class MrtSpec extends FlatSpec {
  "Shortest Path" should "return list of nodes between Sengkang and BedokNorth" in {
    val op = graph.get(SengkangNel).shortestPathTo(graph.get(BedokNorth))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(SengkangNel, Buangkok, Hougang, Kovan, SerangoonNel, SerangoonCcl,
        Bartley, TaiSeng, MacPhersonCcl, MacPhersonDtl, Ubi, KakiBukit, BedokNorth))(p.nodes.toList)
    }
  }
  it should "return list of nodes between Punggol and SerangoonNel" in {
    val op = graph.get(Punggol).shortestPathTo(graph.get(SerangoonNel))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Punggol, SengkangNel, Buangkok, Hougang, Kovan, SerangoonNel))(p.nodes.toList)
    }
  }
  it should "return list of nodes between Hougang and Redhill" in {
    val op = graph.get(Hougang).shortestPathTo(graph.get(Redhill))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Hougang, Kovan, SerangoonNel, Woodleigh, PotongPasir, BoonKeng, FarrerPark,
        LittleIndiaNel, DhobyGhautNel, ClarkeQuay, ChinatownNel, OutramParkNel, OutramParkEwl,
        TiongBahru, Redhill))(p.nodes.toList)
    }
  }
  it should "return list of nodes between Kovan and KentRidge" in {
    val op = graph.get(Kovan).shortestPathTo(graph.get(KentRidge))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Kovan, SerangoonNel, SerangoonCcl, LorongChuan, BishanCcl, Marymount, Caldecott,
        BotanicGardensCcl, FarrerRoad, HollandVillage, BuonaVistaCcl, OneNorth, KentRidge))(p.nodes.toList)
    }
  }
  it should "return list of nodes between PasirRis and ChoaChuKang" in {
    val op = graph.get(PasirRis).shortestPathTo(graph.get(ChoaChuKang))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(PasirRis, TampinesEwl, Simei, TanahMerah, Bedok, Kembangan, Eunos,
        PayaLebarEwl, Aljunied, Kallang, Lavender, BugisEwl, CityHallEwl, RafflesPlaceEwl,
        TanjongPagar, OutramParkEwl, TiongBahru, Redhill, Queenstown, Commonwealth, BuonaVistaEwl,
        Dover, Clementi, JurongEastEwl, JurongEastNsl, BukitBatok, BukitGombak, ChoaChuKang))(p.nodes.toList)
    }
  }
  "Shortest Path (same station, different platform)" should
    "return list of nodes between Caldecott and PromenadeCcl" in {
    val op = graph.get(Caldecott).shortestPathTo(graph.get(PromenadeCcl))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Caldecott, Marymount, BishanCcl, LorongChuan, SerangoonCcl, Bartley, TaiSeng,
        MacPhersonCcl, PayaLebarCcl, Dakota, Mountbatten, Stadium, NicollHighway, PromenadeCcl))(p.nodes.toList)
    }
  }
  it should "return list of nodes between Caldecott and PromenadeDtl" in {
    val op = graph.get(Caldecott).shortestPathTo(graph.get(PromenadeDtl))
    assertResult(false)(op.isEmpty)
    for (p <- op) {
      assertResult(List(Caldecott, BotanicGardensCcl, BotanicGardensDtl, Stevens, NewtonDtl, LittleIndiaDtl,
        Rochor, BugisDtl, PromenadeDtl))(p.nodes.toList)
    }
  }
}
