package com.sgcharts.mrtgraph

object RailLine extends Enumeration {
  type RailLine = Value
  val NEL, NSL, EWL, CCL, DTL, TEL, BPLRT, SKLRT, PGLRT = Value

  def withNameOpt(s: String): Option[Value] = values.find(_.toString == s)
}
