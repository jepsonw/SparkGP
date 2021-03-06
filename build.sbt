name := "SparkGP"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1"

libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "1.3.1"

libraryDependencies += "org.scalanlp" %% "breeze" % "0.10"

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
    