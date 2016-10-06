
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/IdeaProjects/Talent/conf/routes
// @DATE:Thu Oct 06 22:41:04 GMT+02:00 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseRESTRouter(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def indexHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.indexHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:32
    def updateByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.updateByID",
      """
        function(table0,id1) {
        
          if (true) {
            return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id1))})
          }
        
        }
      """
    )
  
    // @LINE:27
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.list",
      """
        function(table0,p1) {
        
          if (p1 == """ + implicitly[JavascriptLiteral[String]].to("null") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0))})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0)) + "/p/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("page", encodeURIComponent(p1))})
          }
        
        }
      """
    )
  
    // @LINE:22
    def topRatedUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.topRatedUsers",
      """
        function(p0) {
        
          if (p0 == """ + implicitly[JavascriptLiteral[String]].to("null") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/user/toprated"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/user/toprated/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cat", encodeURIComponent(p0))})
          }
        
        }
      """
    )
  
    // @LINE:12
    def setRefreshToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.setRefreshToken",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setRefreshToken"})
        }
      """
    )
  
    // @LINE:15
    def getWhereWithCondition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.getWhereWithCondition",
      """
        function(table0,condition1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0)) + "/where/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("condition", condition1)})
        }
      """
    )
  
    // @LINE:23
    def topRatedPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.topRatedPosts",
      """
        function(p0) {
        
          if (p0 == """ + implicitly[JavascriptLiteral[String]].to("null") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/post/toprated"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/post/toprated/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cat", encodeURIComponent(p0))})
          }
        
        }
      """
    )
  
    // @LINE:29
    def getByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.getByID",
      """
        function(table0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id1))})
        }
      """
    )
  
    // @LINE:30
    def deleteByID: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.deleteByID",
      """
        function(table0,id1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id1))})
        }
      """
    )
  
    // @LINE:18
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/logout"})
        }
      """
    )
  
    // @LINE:31
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.create",
      """
        function(table0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("table", encodeURIComponent(table0))})
        }
      """
    )
  
    // @LINE:19
    def getUpdatedPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.getUpdatedPosts",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/post/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:20
    def getFollowing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.getFollowing",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/follower/update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:16
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RESTRouter.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/login"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
