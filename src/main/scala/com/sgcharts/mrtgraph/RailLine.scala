package com.sgcharts.mrtgraph

object RailLine extends Enumeration {
  type RailLine = Value
  val NEL, NSL, EWL, CCL, DTL, TEL, BPLRT, SKLRT, PGLRT: RailLine.RailLine = Value

  def withNameOpt(s: String): Option[Value] = values.find(_.toString == s)
}
