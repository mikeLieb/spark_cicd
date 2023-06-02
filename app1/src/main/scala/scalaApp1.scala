import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import org.apache.spark.sql.SparkSession
import scala.util.Random
object scalaApp1 extends App{

   val spark= SparkSession.builder().appName("app1").getOrCreate()
   import spark.implicits._
   
   val r= new Random
   val df= (0.to(1000)).map(x=> (r.nextInt(1000),r.nextDouble)).toDF("x1","x2")
   df.write.format("parquet").save("hdfs:///tmp/app1")


}
