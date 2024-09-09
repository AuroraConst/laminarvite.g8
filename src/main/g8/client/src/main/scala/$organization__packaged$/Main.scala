package $organization$


import com.axiom.JsRouter.*
import com.axiom.pages.*
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

    // Find the div to render the app into. It's defined in index.html
    lazy val container = dom.document.getElementById("root")

    lazy val appElement = {
      div(
        cls := "JsApp",
        div(
          cls := "-content",
          // BEGIN[waypoint/currentPageSignal/backToHome]
          child.maybe <-- JsRouter.currentPageSignal.map {
            case HomePage => None
            case _ => Some(h3(cls("-backToHome"), a(navigateTo(HomePage), "Back to home")))
          },
          // END[waypoint/currentPageSignal/backToHome]

          // #Exercise for advanced readers: JsRouter.currentPageSignal emits
          // very rarely (only when user navigates to another page). However,
          // imagine if it was emitting various pages 1000 times per second.
          // Your task: learn about the `split` operator to understand what
          // is inefficient about this .map in such a scenario, and fix the
          // inefficiency using the `splitOne` version of that operator.
          child <-- JsRouter.currentPageSignal.map {
            case page: TitledPage => h1(page.title)
            case _ => emptyNode
          },
          // BEGIN[waypoint/currentPageSignal/view]
          child <-- views
          // END[waypoint/currentPageSignal/view]
        )
      )
    }
    render(container, appElement)

  
}
