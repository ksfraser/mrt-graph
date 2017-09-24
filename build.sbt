import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.sgcharts",
      scalaVersion := "2.12.3",
      version      := "1.0"
    )),
    name := "mrt-graph",
    libraryDependencies += scalaTest % Test
  )
