val akkaVersion = "2.5.26"
val akkaHttpVersion = "10.1.11"

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
)

// name := "log-tracer-akka-scala-seed"

// version := "1.0"

// scalaVersion := "3.3.4"

// resolvers += "Akka library repository".at("https://repo.akka.io/maven")

// lazy val akkaVersion = "2.8.1"

// fork := true

// libraryDependencies ++= Seq(
//   "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
//   "com.typesafe.akka" %% "akka-http" % "10.5.2",
//   "com.typesafe.akka" %% "akka-stream" % akkaVersion,
//   "com.typesafe.akka" %% "akka-http-spray-json" % "10.5.2", // JSON support
//   "ch.qos.logback" % "logback-classic" % "1.2.13",
//   "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
//   "org.scalatest" %% "scalatest" % "3.2.15" % Test
// )

// // sbt-assembly plugin configuration for creating fat JARs
// assemblyMergeStrategy in assembly := {
//   case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//   case x => MergeStrategy.first
// }
