/*                     __                                               *\
**     ________ ___   / /  ___      __ ____  Scala.js tools             **
**    / __/ __// _ | / /  / _ | __ / // __/  (c) 2013-2018, LAMP/EPFL   **
**  __\ \/ /__/ __ |/ /__/ __ |/_// /_\ \    http://scala-js.org/       **
** /____/\___/_/ |_/____/_/ | |__/ /____/                               **
**                          |/____/                                     **
\*                                                                      */

package org.scalajs.core.tools.io

/** A simple in-memory mutable virtual serialized Scala.js IR file. */
class MemVirtualSerializedScalaJSIRFile(p: String)
    extends MemVirtualBinaryFile(p) with VirtualSerializedScalaJSIRFile
