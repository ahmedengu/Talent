
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Talent/conf/routes
// @DATE:Tue Jun 21 23:35:10 EET 2016

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
  
    // @LINE:32
    def updateByID(table:String, id:String): Call = {
    
      (table: @unchecked, id: @unchecked) match {
      
        // @LINE:32
        case (table, id)  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
      
      }
    
    }
  
    // @LINE:27
    def list(table:String, p:String): Call = {
    
      (table: @unchecked, p: @unchecked) match {
      
        // @LINE:27
        case (table, p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
      
        // @LINE:28
        case (table, p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/p/" + implicitly[PathBindable[String]].unbind("page", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:22
    def topRatedUsers(p:String): Call = {
    
      (p: @unchecked) match {
      
        // @LINE:22
        case (p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/user/toprated")
      
        // @LINE:24
        case (p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/user/toprated/" + implicitly[PathBindable[String]].unbind("cat", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:14
    def getWhereWithCondition(table:String, condition:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/where/" + implicitly[PathBindable[String]].unbind("condition", condition))
    }
  
    // @LINE:23
    def topRatedPosts(p:String): Call = {
    
      (p: @unchecked) match {
      
        // @LINE:23
        case (p) if p == "null" =>
          implicit val _rrc = new ReverseRouteContext(Map(("p", "null")))
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/post/toprated")
      
        // @LINE:25
        case (p)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "api/v1/post/toprated/" + implicitly[PathBindable[String]].unbind("cat", dynamicString(p)))
      
      }
    
    }
  
    // @LINE:29
    def getByID(table:String, id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:30
    def deleteByID(table:String, id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)) + "/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:18
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/logout")
    }
  
    // @LINE:31
    def create(table:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/v1/" + implicitly[PathBindable[String]].unbind("table", dynamicString(table)))
    }
  
    // @LINE:19
    def getUpdatedPosts(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/post/update/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:20
    def getFollowing(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/v1/follower/update/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:15
    def login(): Call = {
    
      () match {
      
        // @LINE:15
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "api/v1/login")
      
      }
    
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
