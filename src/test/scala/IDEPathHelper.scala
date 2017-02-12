import java.nio.file.Path

import io.gatling.commons.util.PathHelper._

object IDEPathHelper {

  val gatlingConfUrl: Path = getClass.getClassLoader.getResource("gatling.conf").toURI
  val projectRootDir: java.nio.file.Path = gatlingConfUrl.ancestor(3)

  val mavenSourcesDirectory: java.nio.file.Path = projectRootDir / "src" / "test" / "scala"
  val mavenResourcesDirectory: java.nio.file.Path = projectRootDir / "src" / "test" / "resources"
  val mavenTargetDirectory: java.nio.file.Path = projectRootDir / "target"
  val mavenBinariesDirectory: java.nio.file.Path = mavenTargetDirectory / "test-classes"

  val dataDirectory: java.nio.file.Path = mavenResourcesDirectory / "data"
  val bodiesDirectory: java.nio.file.Path = mavenResourcesDirectory / "bodies"

  val recorderOutputDirectory: java.nio.file.Path = mavenSourcesDirectory
  val resultsDirectory: java.nio.file.Path = mavenTargetDirectory / "gatling"

  val recorderConfigFile: java.nio.file.Path = mavenResourcesDirectory / "recorder.conf"
}
