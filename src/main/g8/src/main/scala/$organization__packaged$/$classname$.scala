package $organization$

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main
def $classname$(): Unit =
  renderOnDomContentLoaded(
    dom.document.getElementById("app"),
    Main.appElement()
  )
end $classname$

object Main:

  val zipVar = Var("")
  def controlledform = form(
    appStyles,
    onSubmit
      .preventDefault
      .mapTo(zipVar.now()) --> (zip => dom.window.alert(zip)),
    p(
      label("Zip code: "),
      input(
        placeholder("12345"),
        maxLength(5), // HTML can help block some undesired input
        controlled(
          value <-- zipVar,
          onInput.mapToValue.filter(_.forall(Character.isDigit)) --> zipVar
        )
      ),
      button(
        typ("button"), // HTML buttons are of type "submit" by default
        "Set SF zip code",
        onClick.mapTo("94110") --> zipVar
      )
    ),
    p(
      "Your zip code: ",
      text <-- zipVar
    ),
    // Using the form element's onSubmit in this example,
    // but you could also respond on button click if you
    // don't want a form element
    button(typ("submit"), "Submit")
  )


  def appElement(): Element =
    div(
      controlledform,
      // renderDataTable(),
    )
  end appElement


end Main
