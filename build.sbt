name := """playframework-kotlin-template"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

kotlinSource := baseDirectory.value / "app"

kotlinSource := baseDirectory.value / "test"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.jetbrains.kotlin" % "kotlin-stdlib" % "1.0.1-2"
)
