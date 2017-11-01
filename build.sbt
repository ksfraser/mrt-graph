lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.sgcharts",
      scalaVersion := "2.12.4",
      version      := "1.0"
    )),
    name := "mrt-graph",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % versions.scalatest % Test,
      "org.scala-graph" %% "graph-core" % versions.graphCore
    )
  )

lazy val versions = new {
  val scalatest = "3.0.4"
  val graphCore = "1.12.1"
}

wartremoverErrors ++= Warts.allBut(
  Wart.Equals,
  Wart.ToString,
  Wart.Throw,
  Wart.DefaultArguments,
  Wart.Return,
  Wart.TraversableOps
)
