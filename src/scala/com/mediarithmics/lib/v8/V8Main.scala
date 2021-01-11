package com.mediarithmics.lib.v8

import com.eclipsesource.v8.V8

object V8Main {

  def main(args: Array[String]): Unit = {

      println("create")
      val runtime = V8.createV8Runtime()
      println("created")
      runtime.release()
      println("released")

  }
}
