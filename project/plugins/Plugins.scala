import sbt._


class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val twitterMaven = "twitter.com" at "http://maven.twttr.com/"
  val defaultProject = "com.twitter" % "standard-project" % "0.11.6"
  val scalaTools =  "scala-tools" at "http://scala-tools.org/repo-releases/"
  val sbtThrift = "com.twitter" % "sbt-thrift" % "1.4.12"
}
