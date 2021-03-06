sbtPlugin := true
name := "sbt-taglist"
description := "Plugin to look for TODO, FIXME or some other tags in your sources"
git.baseVersion := "1.4.1-SNAPSHOT"
organization := "com.markatta"
publishMavenStyle := false
crossSbtVersions := Seq("1.0.0", "0.13.16")

scalacOptions += "-unchecked"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
resolvers ++= Seq("releases"  at "http://oss.sonatype.org/content/repositories/releases")
licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
bintrayRepository := "sbt-plugins"
bintrayOrganization := None

enablePlugins(GitVersioning)
