
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/IdeaProjects/Talent/conf/routes
// @DATE:Thu Oct 06 22:41:04 GMT+02:00 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
