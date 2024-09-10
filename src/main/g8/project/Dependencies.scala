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
      "com.raquo" %%% "laminar" % DependencyVersions.laminar
    )
  }

  //json codec library
  val borerJson: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "io.bullet" %%% "borer-core" % DependencyVersions.borerjson,
      "io.bullet" %%% "borer-derivation" % DependencyVersions.borerjson
    )
  }

}
