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
      "org.scala-graph" %% "graph-core" % versions.graphCore,
      "com.typesafe" % "config" % versions.config
    )
  )

lazy val versions = new {
  val scalatest = "3.0.4"
  val graphCore = "1.12.1"
  val config = "1.3.2"
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
  Wart.Any, // Funny ide error, Graph get returns Any
  Wart.NonUnitStatements // Funny ide error, doc not sync with code
)
