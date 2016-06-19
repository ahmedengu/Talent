
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Talent/conf/routes
// @DATE:Sun Jun 19 23:44:41 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:10
  class ReverseRESTRouter(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def indexHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:26
    def updateByID(table:String, id:String): Call = {
    
      (table: @unchecked, id: @unchecked) match {
      
        // @LINE:26
        case (table, id)  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
    // @LINE:21
    def list(table:String, p:String): Call = {
    
      (table: @unchecked, p: @unchecked) match {
      
        // @LINE:21
        case (table, p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:22
        case (table, p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/p/" + implicitly[PathBindable[String]].unbind("page", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:16
    def topRatedUsers(p:String): Call = {
    
      (p: @unchecked) match {
      
        // @LINE:16
        case (p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/user/toprated")
      
        // @LINE:18
        case (p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/user/toprated/" + implicitly[PathBindable[String]].unbind("cat", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:12
    def getWhereWithCondition(table:String, condition:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/where/" + implicitly[PathBindable[String]].unbind("condition", condition))
    }
  
    // @LINE:17
    def topRatedPosts(p:String): Call = {
    
      (p: @unchecked) match {
      
        // @LINE:17
        case (p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/post/toprated")
      
        // @LINE:19
        case (p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/post/toprated/" + implicitly[PathBindable[String]].unbind("cat", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:23
    def getByID(table:String, id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:24
    def deleteByID(table:String, id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:14
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/logout")
    }
  
    // @LINE:25
    def create(table:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:13
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/login")
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }


}
