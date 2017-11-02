package com.sgcharts.mrt.graph

sealed trait Platform {
  val station: String
  val line: String
}

case object PasirRis extends Platform {
  val station: String = "pasir_ris"
  val line: String = EastWestLine.name
}

case object Tampines extends Platform {
  val station: String = "tampines"
  val line: String = EastWestLine.name
}

case object Simei extends Platform {
  val station: String = "simei"
  val line: String = EastWestLine.name
}

case object ChangiAirport extends Platform {
  val station: String = "changi_airport"
  val line: String = EastWestLine.name
}

case object Expo extends Platform {
  val station: String = "expo"
  val line: String = EastWestLine.name
}

case object TanahMerah extends Platform {
  val station: String = "tanah_merah"
  val line: String = EastWestLine.name
}

case object Bedok extends Platform {
  val station: String = "bedok"
  val line: String = EastWestLine.name
}

case object Kembangan extends Platform {
  val station: String = "kembangan"
  val line: String = EastWestLine.name
}

case object Eunos extends Platform {
  val station: String = "eunos"
  val line: String = EastWestLine.name
}

case object PayaLebar extends Platform {
  val station: String = "paya_lebar"
  val line: String = EastWestLine.name
}

case object Aljunied extends Platform {
  val station: String = "aljunied"
  val line: String = EastWestLine.name
}

case object Kallang extends Platform {
  val station: String = "kallang"
  val line: String = EastWestLine.name
}

case object Lavender extends Platform {
  val station: String = "lavender"
  val line: String = EastWestLine.name
}

case object Bugis extends Platform {
  val station: String = "bugis"
  val line: String = EastWestLine.name
}

case object CityHallEwl extends Platform {
  val station: String = "city_hall"
  val line: String = EastWestLine.name
}

case object CityHallNsl extends Platform {
  val station: String = "city_hall"
  val line: String = NorthSouthLine.name
}

case object RafflesPlaceEwl extends Platform {
  val station: String = "raffles_place"
  val line: String = EastWestLine.name
}

case object RafflesPlaceNsl extends Platform {
  val station: String = "raffles_place"
  val line: String = NorthSouthLine.name
}

case object TanjongPagar extends Platform {
  val station: String = "tanjong_pagar"
  val line: String = EastWestLine.name
}

case object OutramPark extends Platform {
  val station: String = "outram_park"
  val line: String = EastWestLine.name
}

case object TiongBahru extends Platform {
  val station: String = "tiong_bahru"
  val line: String = EastWestLine.name
}

case object Redhill extends Platform {
  val station: String = "redhill"
  val line: String = EastWestLine.name
}

case object Queenstown extends Platform {
  val station: String = "queenstown"
  val line: String = EastWestLine.name
}

case object Commonwealth extends Platform {
  val station: String = "commonwealth"
  val line: String = EastWestLine.name
}

case object BuonaVista extends Platform {
  val station: String = "buona_vista"
  val line: String = EastWestLine.name
}

case object Dover extends Platform {
  val station: String = "dover"
  val line: String = EastWestLine.name
}

case object Clementi extends Platform {
  val station: String = "clementi"
  val line: String = EastWestLine.name
}

case object JurongEastEwl extends Platform {
  val station: String = "jurong_east"
  val line: String = EastWestLine.name
}

case object JurongEastNsl extends Platform {
  val station: String = "jurong_east"
  val line: String = NorthSouthLine.name
}

case object ChineseGarden extends Platform {
  val station: String = "chinese_garden"
  val line: String = EastWestLine.name
}

case object Lakeside extends Platform {
  val station: String = "lakeside"
  val line: String = EastWestLine.name
}

case object BoonLay extends Platform {
  val station: String = "boon_lay"
  val line: String = EastWestLine.name
}

case object Pioneer extends Platform {
  val station: String = "pioneer"
  val line: String = EastWestLine.name
}

case object JooKoon extends Platform {
  val station: String = "joo_koon"
  val line: String = EastWestLine.name
}

case object GulCircle extends Platform {
  val station: String = "gul_circle"
  val line: String = EastWestLine.name
}

case object TuasCrescent extends Platform {
  val station: String = "tuas_crescent"
  val line: String = EastWestLine.name
}

case object TuasWestRoad extends Platform {
  val station: String = "tuas_west_road"
  val line: String = EastWestLine.name
}

case object TuasLink extends Platform {
  val station: String = "tuas_link"
  val line: String = EastWestLine.name
}

case object BukitBatok extends Platform {
  val station: String = "bukit_batok"
  val line: String = NorthSouthLine.name
}

case object BukitGombak extends Platform {
  val station: String = "bukit_gombak"
  val line: String = NorthSouthLine.name
}

case object ChoaChuKang extends Platform {
  val station: String = "choa_chu_kang"
  val line: String = NorthSouthLine.name
}

case object YewTee extends Platform {
  val station: String = "yew_tee"
  val line: String = NorthSouthLine.name
}

case object Kranji extends Platform {
  val station: String = "kranji"
  val line: String = NorthSouthLine.name
}

case object Marsiling extends Platform {
  val station: String = "marsiling"
  val line: String = NorthSouthLine.name
}

case object Woodlands extends Platform {
  val station: String = "woodlands"
  val line: String = NorthSouthLine.name
}

case object Admiralty extends Platform {
  val station: String = "admiralty"
  val line: String = NorthSouthLine.name
}

case object Sembawang extends Platform {
  val station: String = "sembawang"
  val line: String = NorthSouthLine.name
}

case object Yishun extends Platform {
  val station: String = "yishun"
  val line: String = NorthSouthLine.name
}

case object Khatib extends Platform {
  val station: String = "khatib"
  val line: String = NorthSouthLine.name
}

case object YioChuKang extends Platform {
  val station: String = "yio_chu_kang"
  val line: String = NorthSouthLine.name
}

case object AngMoKio extends Platform {
  val station: String = "ang_mo_kio"
  val line: String = NorthSouthLine.name
}

case object Bishan extends Platform {
  val station: String = "bishan"
  val line: String = NorthSouthLine.name
}

case object Braddell extends Platform {
  val station: String = "braddell"
  val line: String = NorthSouthLine.name
}

case object ToaPayoh extends Platform {
  val station: String = "toa_payoh"
  val line: String = NorthSouthLine.name
}

case object Novena extends Platform {
  val station: String = "novena"
  val line: String = NorthSouthLine.name
}

case object Newton extends Platform {
  val station: String = "newton"
  val line: String = NorthSouthLine.name
}

case object Orchard extends Platform {
  val station: String = "orchard"
  val line: String = NorthSouthLine.name
}

case object Somerset extends Platform {
  val station: String = "somerset"
  val line: String = NorthSouthLine.name
}

case object DhobyGhaut extends Platform {
  val station: String = "dhoby_ghaut"
  val line: String = NorthSouthLine.name
}

case object MarinaBay extends Platform {
  val station: String = "marina_bay"
  val line: String = NorthSouthLine.name
}

case object MarinaSouthPier extends Platform {
  val station: String = "marina_south_pier"
  val line: String = NorthSouthLine.name
}