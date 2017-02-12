import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import org.slf4j.LoggerFactory

object Engine extends App {
  private val logger = LoggerFactory.getLogger(this.getClass.getName)
  val props = new GatlingPropertiesBuilder
  props.dataDirectory(IDEPathHelper.dataDirectory.toString)
  props.resultsDirectory(IDEPathHelper.resultsDirectory.toString)
  props.bodiesDirectory(IDEPathHelper.bodiesDirectory.toString)
  props.binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString)

  val testClass = System.getProperty("testClass")
  testClass match {
    case x: String =>
      props.simulationClass(x)
      logger.info("Test class: {}", x)
  }
  Gatling.fromMap(props.build)
}
