val dottyVersion = "0.26.0-RC1"
val scala213Version = "2.13.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-cross",
    version := "0.1.0",
    
    libraryDependencies ++= Seq("org.typelevel" %% "cats-core" % "2.2.0").map(_.withDottyCompat(dottyVersion)),
    
    scalaVersion := dottyVersion,
    crossScalaVersions := Seq(dottyVersion, scala213Version)
  )
