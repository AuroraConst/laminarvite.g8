package $organization$


import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom
// import vendor.highlightjs.hljs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Main {
  @main def entrypoint(): Unit = 
    println("Hello, world!")
    // Scala.js outputs to the browser dev console, not the sbt session
    // Always have the browser dev console open when developing web UIs.
    println("-- Scala.js app start --")


    val element = dom.document.querySelector("#app")
    renderOnDomContentLoaded(element,$classname$())
}
