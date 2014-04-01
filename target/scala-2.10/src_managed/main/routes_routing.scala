// @SOURCE:C:/Users/kobi/workspace/SEProject/conf/routes
// @HASH:86ec055b81a7e77a05d397c31edc835546f8294e
// @DATE:Wed Mar 19 21:40:33 IST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_first2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("first"))))
        

// @LINE:15
private[this] lazy val controllers_Application_second3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("second"))))
        

// @LINE:18
private[this] lazy val controllers_Application_third4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("third"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """first""","""controllers.Application.first()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """second""","""controllers.Application.second()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """third""","""controllers.Application.third()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_first2(params) => {
   call { 
        invokeHandler(controllers.Application.first(), HandlerDef(this, "controllers.Application", "first", Nil,"GET", """ First page""", Routes.prefix + """first"""))
   }
}
        

// @LINE:15
case controllers_Application_second3(params) => {
   call { 
        invokeHandler(controllers.Application.second(), HandlerDef(this, "controllers.Application", "second", Nil,"GET", """ Second page""", Routes.prefix + """second"""))
   }
}
        

// @LINE:18
case controllers_Application_third4(params) => {
   call { 
        invokeHandler(controllers.Application.third(), HandlerDef(this, "controllers.Application", "third", Nil,"GET", """ Third page""", Routes.prefix + """third"""))
   }
}
        
}

}
     