package flyweight

import java.util
import java.util.Map

object PlatformFactory {

  private var map: Map[String, Platform] = new util.HashMap()

  map.put("JAVA", new JavaPlatform)

  map.put("C", new CPlatform)

  map.put("RUBY", new RubyPlatform)

  def getPlatformInstance(platformType: String): Platform = {
    map.get(platformType)
  }

}