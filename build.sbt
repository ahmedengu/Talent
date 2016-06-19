import com.typesafe.sbt.packager.Keys.dist
import com.github.sbtliquibase.SbtLiquibase
import com.github.sbtliquibase.Import._

name := "Talent"

scalaVersion := "2.11.6"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,javaWs
)

libraryDependencies ++= Seq(
  // WebJars pull in client-side web libraries
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "flot" % "0.8.0",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "org.jooq" % "jooq" % "3.8.0",
  "org.jooq" % "jooq-meta" % "3.8.0",
  "org.jooq" % "jooq-scala" % "3.8.0",
  "org.jooq" % "jooq-codegen" % "3.8.0",
  "javax.persistence" % "persistence-api" % "1.0.2",
  "javax.validation" % "validation-api" % "1.1.0.Final",
  "com.fasterxml.uuid" % "java-uuid-generator" % "3.1.3",
  "com.typesafe.play" %% "play-mailer" % "5.0.0-M1",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.google.api-client" % "google-api-client" % "1.22.0",
  "com.google.apis" % "google-api-services-youtube" % "v3-rev175-1.22.0",
  "com.google.api.client" % "google-api-client-auth" % "1.2.3-alpha",
  "com.google.api.client" % "google-api-client-googleapis-auth" % "1.2.3-alpha",
  "com.google.api.client" % "google-api-client-auth-oauth" % "1.2.3-alpha",
  "com.google.auth" % "google-auth-library-oauth2-http" % "0.4.0",
  "com.google.gdata" % "core" % "1.47.1"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.31" % "jooq"

seq(jooqSettings: _*)

jooqVersion := "3.8.0"
//
//jooqOptions := Seq(
//  "jdbc.driver" -> "com.mysql.jdbc.Driver",
//  "jdbc.url" -> "jdbc:mysql://209.148.94.217:3306/talent",
//  "jdbc.user" -> "talent",
//  "jdbc.password" -> "talent",
//  "generator.database.name" -> "org.jooq.util.mysql.MySQLDatabase",
//  "generator.database.inputSchema" -> "talent",
//  "generator.target.directory" -> "./tmpModelPack",
//  "generator.target.packageName" -> "tmpModelPack",
//  "generator.generate.pojos" -> "true",
//  "generator.generate.daos" -> "true",
//  "generator.generate.jpaAnnotations" -> "true",
//  "generator.generate.validationAnnotations" -> "true",
//  "generator.generate.generatedAnnotation" -> "true"
//)
//
//
//liquibaseUsername := "talent"
//
//liquibasePassword := "talent"
//
//liquibaseDriver   := "com.mysql.jdbc.Driver"
//
//liquibaseUrl      := "jdbc:mysql://209.148.94.217:3306/talent"

fork in run := true
javaOptions in run += "-Dhttp.port=9090"
