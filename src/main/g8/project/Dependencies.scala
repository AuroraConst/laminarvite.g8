import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {


  val scalajsdom  = Def.setting {
    Seq("org.scala-js" %%% "scalajs-dom" % DependencyVersions.scalajsdom)
  }
  val scalatest   :     Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "org.scalactic" %%% "scalactic"  % DependencyVersions.scalatest,
      "org.scalatest" %%% "scalatest" % DependencyVersions.scalatest % "test"
    )
  }


  val laminar: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "com.raquo" %%% "laminar" % DependencyVersions.laminar,
      "com.raquo" %%% "waypoint" % DependencyVersions.waypoint   // Depends on Airstream 17.0.0 & URL DSL 0.6.2
    )
  }

  val borerJson: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "io.bullet" %%% "borer-core" % DependencyVersions.borerJson,
      "io.bullet" %%% "borer-derivation" % DependencyVersions.borerJson
    )
  }

}
