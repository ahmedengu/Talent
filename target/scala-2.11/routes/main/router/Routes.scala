
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Talent/conf/routes
// @DATE:Mon Jun 20 07:53:22 EET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Assets_0: controllers.Assets,
  // @LINE:10
  RESTRouter_1: controllers.RESTRouter,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Assets_0: controllers.Assets,
    // @LINE:10
    RESTRouter_1: controllers.RESTRouter
  ) = this(errorHandler, Assets_0, RESTRouter_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, RESTRouter_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix, """controllers.RESTRouter.indexHome()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/where/""" + "$" + """condition<.+>""", """controllers.RESTRouter.getWhereWithCondition(table:String, condition:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/login""", """controllers.RESTRouter.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/logout""", """controllers.RESTRouter.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/user/toprated""", """controllers.RESTRouter.topRatedUsers(p:String = "null")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/post/toprated""", """controllers.RESTRouter.topRatedPosts(p:String = "null")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/user/toprated/""" + "$" + """cat<[^/]+>""", """controllers.RESTRouter.topRatedUsers(cat:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/post/toprated/""" + "$" + """cat<[^/]+>""", """controllers.RESTRouter.topRatedPosts(cat:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.list(table:String, p:String = "null")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/p/""" + "$" + """page<[^/]+>""", """controllers.RESTRouter.list(table:String, page:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.getByID(table:String, id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.deleteByID(table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>""", """controllers.RESTRouter.create(table:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.updateByID(table:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>""", """controllers.RESTRouter.updateByID(table:String, id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Assets_at0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_RESTRouter_indexHome1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_RESTRouter_indexHome1_invoker = createInvoker(
    RESTRouter_1.indexHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "indexHome",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_RESTRouter_getWhereWithCondition2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/where/"), DynamicPart("condition", """.+""",false)))
  )
  private[this] lazy val controllers_RESTRouter_getWhereWithCondition2_invoker = createInvoker(
    RESTRouter_1.getWhereWithCondition(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "getWhereWithCondition",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/where/""" + "$" + """condition<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RESTRouter_login3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/login")))
  )
  private[this] lazy val controllers_RESTRouter_login3_invoker = createInvoker(
    RESTRouter_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """api/v1/login"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_RESTRouter_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/logout")))
  )
  private[this] lazy val controllers_RESTRouter_logout4_invoker = createInvoker(
    RESTRouter_1.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """api/v1/logout"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RESTRouter_topRatedUsers5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/user/toprated")))
  )
  private[this] lazy val controllers_RESTRouter_topRatedUsers5_invoker = createInvoker(
    RESTRouter_1.topRatedUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "topRatedUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/user/toprated"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_RESTRouter_topRatedPosts6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/post/toprated")))
  )
  private[this] lazy val controllers_RESTRouter_topRatedPosts6_invoker = createInvoker(
    RESTRouter_1.topRatedPosts(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "topRatedPosts",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/post/toprated"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_RESTRouter_topRatedUsers7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/user/toprated/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_topRatedUsers7_invoker = createInvoker(
    RESTRouter_1.topRatedUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "topRatedUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/user/toprated/""" + "$" + """cat<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RESTRouter_topRatedPosts8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/post/toprated/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_topRatedPosts8_invoker = createInvoker(
    RESTRouter_1.topRatedPosts(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "topRatedPosts",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/post/toprated/""" + "$" + """cat<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RESTRouter_list9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_list9_invoker = createInvoker(
    RESTRouter_1.list(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "list",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_RESTRouter_list10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/p/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_list10_invoker = createInvoker(
    RESTRouter_1.list(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "list",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/p/""" + "$" + """page<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RESTRouter_getByID11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_getByID11_invoker = createInvoker(
    RESTRouter_1.getByID(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "getByID",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_RESTRouter_deleteByID12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_deleteByID12_invoker = createInvoker(
    RESTRouter_1.deleteByID(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "deleteByID",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_RESTRouter_create13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_create13_invoker = createInvoker(
    RESTRouter_1.create(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "create",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RESTRouter_updateByID14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_updateByID14_invoker = createInvoker(
    RESTRouter_1.updateByID(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "updateByID",
      Seq(classOf[String], classOf[String]),
      "PUT",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_RESTRouter_updateByID15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/v1/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RESTRouter_updateByID15_invoker = createInvoker(
    RESTRouter_1.updateByID(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RESTRouter",
      "updateByID",
      Seq(classOf[String], classOf[String]),
      "POST",
      """""",
      this.prefix + """api/v1/""" + "$" + """table<[^/]+>/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Assets_at0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at0_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:10
    case controllers_RESTRouter_indexHome1_route(params) =>
      call { 
        controllers_RESTRouter_indexHome1_invoker.call(RESTRouter_1.indexHome())
      }
  
    // @LINE:14
    case controllers_RESTRouter_getWhereWithCondition2_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("condition", None)) { (table, condition) =>
        controllers_RESTRouter_getWhereWithCondition2_invoker.call(RESTRouter_1.getWhereWithCondition(table, condition))
      }
  
    // @LINE:15
    case controllers_RESTRouter_login3_route(params) =>
      call { 
        controllers_RESTRouter_login3_invoker.call(RESTRouter_1.login())
      }
  
    // @LINE:16
    case controllers_RESTRouter_logout4_route(params) =>
      call { 
        controllers_RESTRouter_logout4_invoker.call(RESTRouter_1.logout())
      }
  
    // @LINE:18
    case controllers_RESTRouter_topRatedUsers5_route(params) =>
      call(Param[String]("p", Right("null"))) { (p) =>
        controllers_RESTRouter_topRatedUsers5_invoker.call(RESTRouter_1.topRatedUsers(p))
      }
  
    // @LINE:19
    case controllers_RESTRouter_topRatedPosts6_route(params) =>
      call(Param[String]("p", Right("null"))) { (p) =>
        controllers_RESTRouter_topRatedPosts6_invoker.call(RESTRouter_1.topRatedPosts(p))
      }
  
    // @LINE:20
    case controllers_RESTRouter_topRatedUsers7_route(params) =>
      call(params.fromPath[String]("cat", None)) { (cat) =>
        controllers_RESTRouter_topRatedUsers7_invoker.call(RESTRouter_1.topRatedUsers(cat))
      }
  
    // @LINE:21
    case controllers_RESTRouter_topRatedPosts8_route(params) =>
      call(params.fromPath[String]("cat", None)) { (cat) =>
        controllers_RESTRouter_topRatedPosts8_invoker.call(RESTRouter_1.topRatedPosts(cat))
      }
  
    // @LINE:23
    case controllers_RESTRouter_list9_route(params) =>
      call(params.fromPath[String]("table", None), Param[String]("p", Right("null"))) { (table, p) =>
        controllers_RESTRouter_list9_invoker.call(RESTRouter_1.list(table, p))
      }
  
    // @LINE:24
    case controllers_RESTRouter_list10_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("page", None)) { (table, page) =>
        controllers_RESTRouter_list10_invoker.call(RESTRouter_1.list(table, page))
      }
  
    // @LINE:25
    case controllers_RESTRouter_getByID11_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (table, id) =>
        controllers_RESTRouter_getByID11_invoker.call(RESTRouter_1.getByID(table, id))
      }
  
    // @LINE:26
    case controllers_RESTRouter_deleteByID12_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (table, id) =>
        controllers_RESTRouter_deleteByID12_invoker.call(RESTRouter_1.deleteByID(table, id))
      }
  
    // @LINE:27
    case controllers_RESTRouter_create13_route(params) =>
      call(params.fromPath[String]("table", None)) { (table) =>
        controllers_RESTRouter_create13_invoker.call(RESTRouter_1.create(table))
      }
  
    // @LINE:28
    case controllers_RESTRouter_updateByID14_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (table, id) =>
        controllers_RESTRouter_updateByID14_invoker.call(RESTRouter_1.updateByID(table, id))
      }
  
    // @LINE:29
    case controllers_RESTRouter_updateByID15_route(params) =>
      call(params.fromPath[String]("table", None), params.fromPath[String]("id", None)) { (table, id) =>
        controllers_RESTRouter_updateByID15_invoker.call(RESTRouter_1.updateByID(table, id))
      }
  }
}
