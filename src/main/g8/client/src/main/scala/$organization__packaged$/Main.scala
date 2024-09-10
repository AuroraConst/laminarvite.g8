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


    dom.document.querySelector("#app").innerHTML = s"""
     <div>
      <a href="https://vitejs.dev" target="_blank">
        <img src="/vite.svg" class="logo" alt="Vite logo" />
      </a>
      <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
        <img src="\$javascriptLogo" class="logo vanilla" alt="JavaScript logo" />
      </a>
      <h1>Hello Scala.js!</h1>
      <div class="card">
        <button id="counter" type="button"></button>
      </div>
      <p class="read-the-docs">
        Click on the Vite logo to learn more
      </p>
    </div>
    """


  
}
