package com.sgcharts.mrt.graph

sealed trait Station {
  val name: String
  val line: String
}

case object PasirRis extends Station {
  override val name: String = "pasir_ris"
  override val line: String = EastWestLine.name
}

case object Tampines extends Station {
  override val name: String = "tampines"
  override val line: String = EastWestLine.name
}

case object Simei extends Station {
  override val name: String = "simei"
  override val line: String = EastWestLine.name
}

case object ChangiAirport extends Station {
  override val name: String = "changi_airport"
  override val line: String = EastWestLine.name
}

case object Expo extends Station {
  override val name: String = "expo"
  override val line: String = EastWestLine.name
}

case object TanahMerah extends Station {
  override val name: String = "tanah_merah"
  override val line: String = EastWestLine.name
}

case object Bedok extends Station {
  override val name: String = "bedok"
  override val line: String = EastWestLine.name
}

case object Kembangan extends Station {
  override val name: String = "kembangan"
  override val line: String = EastWestLine.name
}

case object Eunos extends Station {
  override val name: String = "eunos"
  override val line: String = EastWestLine.name
}

case object PayaLebar extends Station {
  override val name: String = "paya_lebar"
  override val line: String = EastWestLine.name
}

case object Aljunied extends Station {
  override val name: String = "aljunied"
  override val line: String = EastWestLine.name
}

case object Kallang extends Station {
  override val name: String = "kallang"
  override val line: String = EastWestLine.name
}

case object Lavender extends Station {
  override val name: String = "lavender"
  override val line: String = EastWestLine.name
}

case object Bugis extends Station {
  override val name: String = "bugis"
  override val line: String = EastWestLine.name
}

case object CityHall extends Station {
  override val name: String = "city_hall"
  override val line: String = EastWestLine.name
}

case object RafflesPlace extends Station {
  override val name: String = "raffles_place"
  override val line: String = EastWestLine.name
}

case object TanjongPagar extends Station {
  override val name: String = "tanjong_pagar"
  override val line: String = EastWestLine.name
}
