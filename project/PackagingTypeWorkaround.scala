/**
  * Created by Andrés Gazzoli on 1/14/19.
  */
import sbt._

object PackagingTypeWorkaround extends AutoPlugin {
  override val buildSettings = {
    sys.props += "packaging.type" -> "jar"
    Nil
  }
}