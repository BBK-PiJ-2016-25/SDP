name := "Exercises week 10"

version := "1.0"

organization := "com.arunma"

scalaVersion := "2.11.2"

resolvers ++=
        Seq("repo" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

// Need to pull this in for reflective capabilities.
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value


libraryDependencies ++= {
        val akkaVersion = "2.3.4"
        val sprayVersion = "1.3.1"
        Seq(
            "com.typesafe.akka" %% "akka-actor" % akkaVersion,
            "io.spray" %% "spray-can" % sprayVersion,
            "io.spray" %% "spray-routing" % sprayVersion,
            "io.spray" %% "spray-json" % "1.2.6",
            "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
            "ch.qos.logback" % "logback-classic" % "1.1.2",
            "com.typesafe.akka" %% "akka-testkit" % akkaVersion, 
            "org.scalatest" %% "scalatest" % "2.2.0"
			)
}

