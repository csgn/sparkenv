package mypackage

import org.apache.spark.SparkContext
import org.apache.spark.sql._
import org.apache.spark.sql.functions._

private[mypackage] object Task1 {
  def run(spark: SparkSession, sparkContext: SparkContext) = {
    println("HELLO WORLD")
  }
}
