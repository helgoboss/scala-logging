package org.helgoboss.scala_logging

import java.util.logging.{ Logger => JLogger }

/**
 * Mix this into your class to be able to easily log to an appropriate java util logger.
 */
trait JavaUtilLogging {
  protected val log = new JavaUtilLoggingLogger(JLogger.getLogger(getClass.getName))
}