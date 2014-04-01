// @SOURCE:C:/Users/kobi/workspace/SEProject/conf/routes
// @HASH:86ec055b81a7e77a05d397c31edc835546f8294e
// @DATE:Wed Mar 19 21:40:33 IST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def third(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "third")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:15
def second(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "second")
}
                                                

// @LINE:12
def first(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "first")
}
                                                
    
}
                          
}
                  


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def third : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.third",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "third"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:15
def second : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.second",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "second"})
      }
   """
)
                        

// @LINE:12
def first : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.first",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "first"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def third(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.third(), HandlerDef(this, "controllers.Application", "third", Seq(), "GET", """ Third page""", _prefix + """third""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:15
def second(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.second(), HandlerDef(this, "controllers.Application", "second", Seq(), "GET", """ Second page""", _prefix + """second""")
)
                      

// @LINE:12
def first(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.first(), HandlerDef(this, "controllers.Application", "first", Seq(), "GET", """ First page""", _prefix + """first""")
)
                      
    
}
                          
}
        
    