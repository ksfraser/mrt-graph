package com.sgcharts.mrt.graph

sealed trait Platform {
  val station: String
  val line: RailLine
}

case object PasirRis extends Platform {
  val station: String = "pasir_ris"
  val line: RailLine = EastWestLine
}

case object TampinesEwl extends Platform {
  val station: String = "tampines"
  val line: RailLine = EastWestLine
}

case object TampinesDtl extends Platform {
  val station: String = "tampines"
  val line: RailLine = DowntownLine
}

case object Simei extends Platform {
  val station: String = "simei"
  val line: RailLine = EastWestLine
}

case object ChangiAirport extends Platform {
  val station: String = "changi_airport"
  val line: RailLine = EastWestLine
}

case object ExpoEwl extends Platform {
  val station: String = "expo"
  val line: RailLine = EastWestLine
}

case object ExpoDtl extends Platform {
  val station: String = "expo"
  val line: RailLine = DowntownLine
}

case object TanahMerah extends Platform {
  val station: String = "tanah_merah"
  val line: RailLine = EastWestLine
}

case object Bedok extends Platform {
  val station: String = "bedok"
  val line: RailLine = EastWestLine
}

case object Kembangan extends Platform {
  val station: String = "kembangan"
  val line: RailLine = EastWestLine
}

case object Eunos extends Platform {
  val station: String = "eunos"
  val line: RailLine = EastWestLine
}

case object PayaLebarEwl extends Platform {
  val station: String = "paya_lebar"
  val line: RailLine = EastWestLine
}

case object PayaLebarCcl extends Platform {
  val station: String = "paya_lebar"
  val line: RailLine = CircleLine
}

case object Aljunied extends Platform {
  val station: String = "aljunied"
  val line: RailLine = EastWestLine
}

case object Kallang extends Platform {
  val station: String = "kallang"
  val line: RailLine = EastWestLine
}

case object Lavender extends Platform {
  val station: String = "lavender"
  val line: RailLine = EastWestLine
}

case object BugisEwl extends Platform {
  val station: String = "bugis"
  val line: RailLine = EastWestLine
}

case object BugisDtl extends Platform {
  val station: String = "bugis"
  val line: RailLine = DowntownLine
}

case object CityHallEwl extends Platform {
  val station: String = "city_hall"
  val line: RailLine = EastWestLine
}

case object CityHallNsl extends Platform {
  val station: String = "city_hall"
  val line: RailLine = NorthSouthLine
}

case object RafflesPlaceEwl extends Platform {
  val station: String = "raffles_place"
  val line: RailLine = EastWestLine
}

case object RafflesPlaceNsl extends Platform {
  val station: String = "raffles_place"
  val line: RailLine = NorthSouthLine
}

case object TanjongPagar extends Platform {
  val station: String = "tanjong_pagar"
  val line: RailLine = EastWestLine
}

case object OutramParkEwl extends Platform {
  val station: String = "outram_park"
  val line: RailLine = EastWestLine
}

case object OutramParkNel extends Platform {
  val station: String = "outram_park"
  val line: RailLine = NorthEastLine
}

case object TiongBahru extends Platform {
  val station: String = "tiong_bahru"
  val line: RailLine = EastWestLine
}

case object Redhill extends Platform {
  val station: String = "redhill"
  val line: RailLine = EastWestLine
}

case object Queenstown extends Platform {
  val station: String = "queenstown"
  val line: RailLine = EastWestLine
}

case object Commonwealth extends Platform {
  val station: String = "commonwealth"
  val line: RailLine = EastWestLine
}

case object BuonaVistaEwl extends Platform {
  val station: String = "buona_vista"
  val line: RailLine = EastWestLine
}

case object BuonaVistaCcl extends Platform {
  val station: String = "buona_vista"
  val line: RailLine = CircleLine
}

case object Dover extends Platform {
  val station: String = "dover"
  val line: RailLine = EastWestLine
}

case object Clementi extends Platform {
  val station: String = "clementi"
  val line: RailLine = EastWestLine
}

case object JurongEastEwl extends Platform {
  val station: String = "jurong_east"
  val line: RailLine = EastWestLine
}

case object JurongEastNsl extends Platform {
  val station: String = "jurong_east"
  val line: RailLine = NorthSouthLine
}

case object ChineseGarden extends Platform {
  val station: String = "chinese_garden"
  val line: RailLine = EastWestLine
}

case object Lakeside extends Platform {
  val station: String = "lakeside"
  val line: RailLine = EastWestLine
}

case object BoonLay extends Platform {
  val station: String = "boon_lay"
  val line: RailLine = EastWestLine
}

case object Pioneer extends Platform {
  val station: String = "pioneer"
  val line: RailLine = EastWestLine
}

case object JooKoon extends Platform {
  val station: String = "joo_koon"
  val line: RailLine = EastWestLine
}

case object GulCircle extends Platform {
  val station: String = "gul_circle"
  val line: RailLine = EastWestLine
}

case object TuasCrescent extends Platform {
  val station: String = "tuas_crescent"
  val line: RailLine = EastWestLine
}

case object TuasWestRoad extends Platform {
  val station: String = "tuas_west_road"
  val line: RailLine = EastWestLine
}

case object TuasLink extends Platform {
  val station: String = "tuas_link"
  val line: RailLine = EastWestLine
}

case object BukitBatok extends Platform {
  val station: String = "bukit_batok"
  val line: RailLine = NorthSouthLine
}

case object BukitGombak extends Platform {
  val station: String = "bukit_gombak"
  val line: RailLine = NorthSouthLine
}

case object ChoaChuKangNsl extends Platform {
  val station: String = "choa_chu_kang"
  val line: RailLine = NorthSouthLine
}

case object ChoaChuKangLrt extends Platform {
  val station: String = "choa_chu_kang"
  val line: RailLine = BukitPanjangLine
}

case object YewTee extends Platform {
  val station: String = "yew_tee"
  val line: RailLine = NorthSouthLine
}

case object Kranji extends Platform {
  val station: String = "kranji"
  val line: RailLine = NorthSouthLine
}

case object Marsiling extends Platform {
  val station: String = "marsiling"
  val line: RailLine = NorthSouthLine
}

case object Woodlands extends Platform {
  val station: String = "woodlands"
  val line: RailLine = NorthSouthLine
}

case object Admiralty extends Platform {
  val station: String = "admiralty"
  val line: RailLine = NorthSouthLine
}

case object Sembawang extends Platform {
  val station: String = "sembawang"
  val line: RailLine = NorthSouthLine
}

case object Yishun extends Platform {
  val station: String = "yishun"
  val line: RailLine = NorthSouthLine
}

case object Khatib extends Platform {
  val station: String = "khatib"
  val line: RailLine = NorthSouthLine
}

case object YioChuKang extends Platform {
  val station: String = "yio_chu_kang"
  val line: RailLine = NorthSouthLine
}

case object AngMoKio extends Platform {
  val station: String = "ang_mo_kio"
  val line: RailLine = NorthSouthLine
}

case object BishanNsl extends Platform {
  val station: String = "bishan"
  val line: RailLine = NorthSouthLine
}

case object BishanCcl extends Platform {
  val station: String = "bishan"
  val line: RailLine = CircleLine
}

case object Braddell extends Platform {
  val station: String = "braddell"
  val line: RailLine = NorthSouthLine
}

case object ToaPayoh extends Platform {
  val station: String = "toa_payoh"
  val line: RailLine = NorthSouthLine
}

case object Novena extends Platform {
  val station: String = "novena"
  val line: RailLine = NorthSouthLine
}

case object NewtonNsl extends Platform {
  val station: String = "newton"
  val line: RailLine = NorthSouthLine
}

case object NewtonDtl extends Platform {
  val station: String = "newton"
  val line: RailLine = DowntownLine
}

case object Orchard extends Platform {
  val station: String = "orchard"
  val line: RailLine = NorthSouthLine
}

case object Somerset extends Platform {
  val station: String = "somerset"
  val line: RailLine = NorthSouthLine
}

case object DhobyGhautNsl extends Platform {
  val station: String = "dhoby_ghaut"
  val line: RailLine = NorthSouthLine
}

case object DhobyGhautNel extends Platform {
  val station: String = "dhoby_ghaut"
  val line: RailLine = NorthEastLine
}

case object DhobyGhautCcl extends Platform {
  val station: String = "dhoby_ghaut"
  val line: RailLine = CircleLine
}

case object MarinaBayNsl extends Platform {
  val station: String = "marina_bay"
  val line: RailLine = NorthSouthLine
}

case object MarinaBayCcl extends Platform {
  val station: String = "marina_bay"
  val line: RailLine = CircleLine
}

case object MarinaSouthPier extends Platform {
  val station: String = "marina_south_pier"
  val line: RailLine = NorthSouthLine
}

case object HarbourFrontNel extends Platform {
  val station: String = "harbourfront"
  val line: RailLine = NorthEastLine
}

case object HarbourFrontCcl extends Platform {
  val station: String = "harbourfront"
  val line: RailLine = CircleLine
}

case object ChinatownNel extends Platform {
  val station: String = "chinatown"
  val line: RailLine = NorthEastLine
}

case object ChinatownDtl extends Platform {
  val station: String = "chinatown"
  val line: RailLine = DowntownLine
}

case object ClarkeQuay extends Platform {
  val station: String = "clarke_quay"
  val line: RailLine = NorthEastLine
}

case object LittleIndiaNel extends Platform {
  val station: String = "little_india"
  val line: RailLine = NorthEastLine
}

case object LittleIndiaDtl extends Platform {
  val station: String = "little_india"
  val line: RailLine = DowntownLine
}

case object FarrerPark extends Platform {
  val station: String = "farrer_park"
  val line: RailLine = NorthEastLine
}

case object BoonKeng extends Platform {
  val station: String = "boon_keng"
  val line: RailLine = NorthEastLine
}

case object PotongPasir extends Platform {
  val station: String = "potong_pasir"
  val line: RailLine = NorthEastLine
}

case object Woodleigh extends Platform {
  val station: String = "woodleigh"
  val line: RailLine = NorthEastLine
}

case object SerangoonNel extends Platform {
  val station: String = "serangoon"
  val line: RailLine = NorthEastLine
}

case object SerangoonCcl extends Platform {
  val station: String = "serangoon"
  val line: RailLine = CircleLine
}

case object Kovan extends Platform {
  val station: String = "kovan"
  val line: RailLine = NorthEastLine
}

case object Hougang extends Platform {
  val station: String = "hougang"
  val line: RailLine = NorthEastLine
}

case object Buangkok extends Platform {
  val station: String = "buangkok"
  val line: RailLine = NorthEastLine
}

case object SengkangNel extends Platform {
  val station: String = "sengkang"
  val line: RailLine = NorthEastLine
}

case object SengkangLrt extends Platform {
  val station: String = "sengkang"
  val line: RailLine = SengkangLine
}

case object PunggolNel extends Platform {
  val station: String = "punggol"
  val line: RailLine = NorthEastLine
}

case object PunggolLrt extends Platform {
  val station: String = "punggol"
  val line: RailLine = PunggolLine
}

case object BrasBasah extends Platform {
  val station: String = "bras_basah"
  val line: RailLine = CircleLine
}

case object Esplanade extends Platform {
  val station: String = "esplanade"
  val line: RailLine = CircleLine
}

case object BayfrontCcl extends Platform {
  val station: String = "bayfront"
  val line: RailLine = CircleLine
}

case object BayfrontDtl extends Platform {
  val station: String = "bayfront"
  val line: RailLine = DowntownLine
}

case object PromenadeCcl extends Platform {
  val station: String = "promenade"
  val line: RailLine = CircleLine
}

case object PromenadeDtl extends Platform {
  val station: String = "promenade"
  val line: RailLine = DowntownLine
}

case object NicollHighway extends Platform {
  val station: String = "nicoll_highway"
  val line: RailLine = CircleLine
}

case object Stadium extends Platform {
  val station: String = "stadium"
  val line: RailLine = CircleLine
}

case object Mountbatten extends Platform {
  val station: String = "mountbatten"
  val line: RailLine = CircleLine
}

case object Dakota extends Platform {
  val station: String = "dakota"
  val line: RailLine = CircleLine
}

case object MacPhersonCcl extends Platform {
  val station: String = "macpherson"
  val line: RailLine = CircleLine
}

case object MacPhersonDtl extends Platform {
  val station: String = "macpherson"
  val line: RailLine = DowntownLine
}

case object TaiSeng extends Platform {
  val station: String = "tai_seng"
  val line: RailLine = CircleLine
}

case object Bartley extends Platform {
  val station: String = "bartley"
  val line: RailLine = CircleLine
}

case object LorongChuan extends Platform {
  val station: String = "lorong_chuan"
  val line: RailLine = CircleLine
}

case object Marymount extends Platform {
  val station: String = "marymount"
  val line: RailLine = CircleLine
}

case object Caldecott extends Platform {
  val station: String = "caldecott"
  val line: RailLine = CircleLine
}

case object BotanicGardensCcl extends Platform {
  val station: String = "botanic_gardens"
  val line: RailLine = CircleLine
}

case object BotanicGardensDtl extends Platform {
  val station: String = "botanic_gardens"
  val line: RailLine = DowntownLine
}

case object FarrerRoad extends Platform {
  val station: String = "farrer_road"
  val line: RailLine = CircleLine
}

case object HollandVillage extends Platform {
  val station: String = "holland_village"
  val line: RailLine = CircleLine
}

case object OneNorth extends Platform {
  val station: String = "one_north"
  val line: RailLine = CircleLine
}

case object KentRidge extends Platform {
  val station: String = "kent_ridge"
  val line: RailLine = CircleLine
}

case object HawParVilla extends Platform {
  val station: String = "haw_par_villa"
  val line: RailLine = CircleLine
}

case object PasirPanjang extends Platform {
  val station: String = "pasir_panjang"
  val line: RailLine = CircleLine
}

case object LabradorPark extends Platform {
  val station: String = "labrador_park"
  val line: RailLine = CircleLine
}

case object TelokBlangah extends Platform {
  val station: String = "telok_blangah"
  val line: RailLine = CircleLine
}

case object BukitPanjangDtl extends Platform {
  val station: String = "bukit_panjang"
  val line: RailLine = DowntownLine
}

case object BukitPanjangLrt extends Platform {
  val station: String = "bukit_panjang"
  val line: RailLine = BukitPanjangLine
}

case object Cashew extends Platform {
  val station: String = "cashew"
  val line: RailLine = DowntownLine
}

case object Hillview extends Platform {
  val station: String = "hillview"
  val line: RailLine = DowntownLine
}

case object BeautyWorld extends Platform {
  val station: String = "beauty_world"
  val line: RailLine = DowntownLine
}

case object KingAlbertPark extends Platform {
  val station: String = "king_albert_park"
  val line: RailLine = DowntownLine
}

case object SixthAvenue extends Platform {
  val station: String = "sixth_avenue"
  val line: RailLine = DowntownLine
}

case object TanKahKee extends Platform {
  val station: String = "tan_kah_kee"
  val line: RailLine = DowntownLine
}

case object Stevens extends Platform {
  val station: String = "stevens"
  val line: RailLine = DowntownLine
}

case object Rochor extends Platform {
  val station: String = "rochor"
  val line: RailLine = DowntownLine
}

case object Downtown extends Platform {
  val station: String = "downtown"
  val line: RailLine = DowntownLine
}

case object TelokAyer extends Platform {
  val station: String = "telok_ayer"
  val line: RailLine = DowntownLine
}

case object FortCanning extends Platform {
  val station: String = "fort_canning"
  val line: RailLine = DowntownLine
}

case object Bencoolen extends Platform {
  val station: String = "bencoolen"
  val line: RailLine = DowntownLine
}

case object JalanBesar extends Platform {
  val station: String = "jalan_besar"
  val line: RailLine = DowntownLine
}

case object Bendemeer extends Platform {
  val station: String = "bendemeer"
  val line: RailLine = DowntownLine
}

case object GeylangBahru extends Platform {
  val station: String = "geylang_bahru"
  val line: RailLine = DowntownLine
}

case object Mattar extends Platform {
  val station: String = "mattar"
  val line: RailLine = DowntownLine
}

case object Ubi extends Platform {
  val station: String = "ubi"
  val line: RailLine = DowntownLine
}

case object KakiBukit extends Platform {
  val station: String = "kaki_bukit"
  val line: RailLine = DowntownLine
}

case object BedokNorth extends Platform {
  val station: String = "bedok_north"
  val line: RailLine = DowntownLine
}

case object BedokReservoir extends Platform {
  val station: String = "bedok_reservoir"
  val line: RailLine = DowntownLine
}

case object TampinesWest extends Platform {
  val station: String = "tampines_west"
  val line: RailLine = DowntownLine
}

case object TampinesEast extends Platform {
  val station: String = "tampines_east"
  val line: RailLine = DowntownLine
}

case object UpperChangi extends Platform {
  val station: String = "upper_changi"
  val line: RailLine = DowntownLine
}

case object ChengLim extends Platform {
  val station: String = "cheng_lim"
  val line: RailLine = SengkangLine
}

case object Farmway extends Platform {
  val station: String = "farmway"
  val line: RailLine = SengkangLine
}

case object Kupang extends Platform {
  val station: String = "kupang"
  val line: RailLine = SengkangLine
}

case object Thanggam extends Platform {
  val station: String = "thanggam"
  val line: RailLine = SengkangLine
}

case object Fernvale extends Platform {
  val station: String = "fernvale"
  val line: RailLine = SengkangLine
}

case object Layar extends Platform {
  val station: String = "layar"
  val line: RailLine = SengkangLine
}

case object Tongkang extends Platform {
  val station: String = "tongkang"
  val line: RailLine = SengkangLine
}

case object Renjong extends Platform {
  val station: String = "renjong"
  val line: RailLine = SengkangLine
}

case object Compassvale extends Platform {
  val station: String = "compassvale"
  val line: RailLine = SengkangLine
}

case object Rumbia extends Platform {
  val station: String = "rumbia"
  val line: RailLine = SengkangLine
}

case object Bakau extends Platform {
  val station: String = "bakau"
  val line: RailLine = SengkangLine
}

case object Kangkar extends Platform {
  val station: String = "kangkar"
  val line: RailLine = SengkangLine
}

case object Ranggung extends Platform {
  val station: String = "ranggung"
  val line: RailLine = SengkangLine
}

case object SamKee extends Platform {
  val station: String = "sam_kee"
  val line: RailLine = PunggolLine
}

case object PunggolPoint extends Platform {
  val station: String = "punggol_point"
  val line: RailLine = PunggolLine
}

case object Samudera extends Platform {
  val station: String = "samudera"
  val line: RailLine = PunggolLine
}

case object Nibong extends Platform {
  val station: String = "nibong"
  val line: RailLine = PunggolLine
}

case object Sumang extends Platform {
  val station: String = "sumang"
  val line: RailLine = PunggolLine
}

case object SooTeck extends Platform {
  val station: String = "soo_teck"
  val line: RailLine = PunggolLine
}

case object Cove extends Platform {
  val station: String = "cove"
  val line: RailLine = PunggolLine
}

case object Meridian extends Platform {
  val station: String = "meridian"
  val line: RailLine = PunggolLine
}

case object CoralEdge extends Platform {
  val station: String = "coral_edge"
  val line: RailLine = PunggolLine
}

case object Riviera extends Platform {
  val station: String = "riviera"
  val line: RailLine = PunggolLine
}

case object Kadaloor extends Platform {
  val station: String = "kadaloor"
  val line: RailLine = PunggolLine
}

case object Oasis extends Platform {
  val station: String = "oasis"
  val line: RailLine = PunggolLine
}

case object Damai extends Platform {
  val station: String = "damai"
  val line: RailLine = PunggolLine
}

case object SouthView extends Platform {
  val station: String = "south_view"
  val line: RailLine = BukitPanjangLine
}

case object KeatHong extends Platform {
  val station: String = "keat_hong"
  val line: RailLine = BukitPanjangLine
}

case object TeckWhye extends Platform {
  val station: String = "teck_whye"
  val line: RailLine = BukitPanjangLine
}

case object Phoenix extends Platform {
  val station: String = "phoenix"
  val line: RailLine = BukitPanjangLine
}

case object TenMileJunction extends Platform {
  val station: String = "ten_mile_junction"
  val line: RailLine = BukitPanjangLine
}

case object Petir extends Platform {
  val station: String = "petir"
  val line: RailLine = BukitPanjangLine
}

case object Pending extends Platform {
  val station: String = "pending"
  val line: RailLine = BukitPanjangLine
}

case object Bangkit extends Platform {
  val station: String = "bangkit"
  val line: RailLine = BukitPanjangLine
}

case object Fajar extends Platform {
  val station: String = "fajar"
  val line: RailLine = BukitPanjangLine
}

case object Segar extends Platform {
  val station: String = "segar"
  val line: RailLine = BukitPanjangLine
}

case object Jelapang extends Platform {
  val station: String = "jelapang"
  val line: RailLine = BukitPanjangLine
}

case object Senja extends Platform {
  val station: String = "senja"
  val line: RailLine = BukitPanjangLine
}
