import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.SparkSession
import org.joda.time.LocalDate
object scalaApp1 extends App{

  val spark= SparkSession.builder().appName("app1").getOrCreate()
   import spark.implicits._


   val dt= new LocalDate()
   val current= dt.toString.split("-").mkString("")
   val df= spark.read.format("parquet").load("hdfs:///tmp/app1").withColumn("x3",$"x1"+$"x2")
    println(s"${args(0)}/${current}")
   df.repartition(10).write.format("parquet").save(s"${args(0)}${current}")


}

