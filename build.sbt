lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.sgcharts",
      scalaVersion := "2.12.3",
      version      := "1.0"
    )),
    name := "mrt-graph",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % versions.scalatest % Test
    )
  )

lazy val versions = new {
  val scalatest = "3.0.4"
}

wartremoverErrors ++= Warts.allBut(
  Wart.Enumeration,
  Wart.PublicInference,
  Wart.Equals,
  Wart.ToString
)
