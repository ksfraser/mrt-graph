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

case object OutramPark extends Station {
  override val name: String = "outram_park"
  override val line: String = EastWestLine.name
}

case object TiongBahru extends Station {
  override val name: String = "tiong_bahru"
  override val line: String = EastWestLine.name
}

case object Redhill extends Station {
  override val name: String = "redhill"
  override val line: String = EastWestLine.name
}

case object Queenstown extends Station {
  override val name: String = "queenstown"
  override val line: String = EastWestLine.name
}

case object Commonwealth extends Station {
  override val name: String = "commonwealth"
  override val line: String = EastWestLine.name
}

case object BuonaVista extends Station {
  override val name: String = "buona_vista"
  override val line: String = EastWestLine.name
}

case object Dover extends Station {
  override val name: String = "dover"
  override val line: String = EastWestLine.name
}

case object Clementi extends Station {
  override val name: String = "clementi"
  override val line: String = EastWestLine.name
}

case object JurongEast extends Station {
  override val name: String = "jurong_east"
  override val line: String = EastWestLine.name
}

case object ChineseGarden extends Station {
  override val name: String = "chinese_garden"
  override val line: String = EastWestLine.name
}

case object Lakeside extends Station {
  override val name: String = "lakeside"
  override val line: String = EastWestLine.name
}

case object BoonLay extends Station {
  override val name: String = "boon_lay"
  override val line: String = EastWestLine.name
}

case object Pioneer extends Station {
  override val name: String = "pioneer"
  override val line: String = EastWestLine.name
}

case object JooKoon extends Station {
  override val name: String = "joo_koon"
  override val line: String = EastWestLine.name
}

case object GulCircle extends Station {
  override val name: String = "gul_circle"
  override val line: String = EastWestLine.name
}

case object TuasCrescent extends Station {
  override val name: String = "tuas_crescent"
  override val line: String = EastWestLine.name
}

case object TuasWestRoad extends Station {
  override val name: String = "tuas_west_road"
  override val line: String = EastWestLine.name
}

case object TuasLink extends Station {
  override val name: String = "tuas_link"
  override val line: String = EastWestLine.name
}
