package com.mediarithmics.lib.v8

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.Assertions.assertResult
import com.eclipsesource.v8.V8

class V8Test extends AnyFunSuite {

  test("test") {
    //println(new java.io.File(".").getAbsolutePath)
    //println(s"java.class.path = ${System.getProperty("java.class.path")}")

//    import scala.collection.JavaConverters._
//    System.getProperties().asScala.toList.sortBy(_._1).foreach{
//      case (k, v) =>
//        println(s"${k} -> ${v}")
//    }


    val runtime = V8.createV8Runtime()

    assertResult(10)(10)
  }

}