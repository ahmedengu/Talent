
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ahmedengu/Documents/IdeaProjects/Talent/conf/routes
// @DATE:Mon Jun 20 07:53:22 EET 2016

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
