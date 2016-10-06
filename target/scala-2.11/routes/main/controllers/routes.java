
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/IdeaProjects/Talent/conf/routes
// @DATE:Thu Oct 06 22:41:04 GMT+02:00 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRESTRouter RESTRouter = new controllers.ReverseRESTRouter(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRESTRouter RESTRouter = new controllers.javascript.ReverseRESTRouter(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
