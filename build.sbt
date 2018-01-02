lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.sgcharts",
      scalaVersion := "2.12.4",
      version      := "1.0.0-SNAPSHOT"
    )),
    name := "mrt-graph-core",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % versions.scalatest % Test,
      "org.scala-graph" %% "graph-core" % versions.graphCore,
      "com.typesafe" % "config" % versions.config,
      "ch.qos.logback" % "logback-classic" % versions.logback,
      "com.typesafe.scala-logging" %% "scala-logging" % versions.scalaLogging
    )
  )

lazy val versions = new {
  val scalatest = "3.0.4"
  val graphCore = "1.12.2"
  val config = "1.3.2"
  val logback = "1.2.3"
  val scalaLogging = "3.7.2"
}

wartremoverErrors ++= Warts.allBut(
  Wart.Equals,
  Wart.ToString,
  Wart.Throw,
  Wart.DefaultArguments,
  Wart.Return,
  Wart.TraversableOps,
  Wart.MutableDataStructures,
  Wart.Var,
  Wart.Product, // required in Graph
  Wart.Serializable, // required in Graph
  Wart.Any, // Graph get returns Any
  Wart.NonUnitStatements // Collections add `+=` is Unit statement
)
