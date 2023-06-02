name := "app2"

version := "0.1"

scalaVersion := "2.12.10"

//resolvers += Resolver.url("SparkPackages", url("https://repos.spark-packages.org/"))
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-mllib
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.1.1"

libraryDependencies += "com.linkedin.sparktfrecord" %% "spark-tfrecord" % "0.3.3"

libraryDependencies += "joda-time" % "joda-time" % "2.12.4"
