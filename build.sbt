ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.11.0"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.7"
//mysql connector i need to add below Jars
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.28"

lazy val root = (project in file("."))
  .settings(
    name := "Project3"
  )
