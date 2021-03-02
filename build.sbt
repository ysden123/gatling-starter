import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.stulsoft",
      scalaVersion := "2.13.4",
      version := "2.0.0"
    )),
    name := "gatling-starter",
    libraryDependencies ++= gatling
  )
