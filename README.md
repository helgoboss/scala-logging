Scala Logging
=============

Scala Logging is a simple and clean Scala API for logging. It also contains an implementation based on the
Java Logging API.

## Examples

No surprises here. It's a typical logging API:

```scala
log.info("Hello world!")
```

What might surprise Scala newcomers is the fact that the expression in the braces will only be evaluated if the corresponding log level is activated. In the following example, `3 + 2` will be calculated only if debugging is enabled in the underlying logging framework:

```scala
log.debug(3 + 2)
```

So forget about checking `isDebugEnabled()`.

## Documentation

- [Scaladoc](http://helgoboss.github.com/scala-logging/scaladoc/#org.helgoboss.scala_logging.package)
