
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Kobi's Application")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),_display_(Seq[Any](/*4.6*/play20/*4.12*/.welcome(message, style = "Java"))),format.raw/*4.45*/("""
""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 19 21:49:52 IST 2014
                    SOURCE: C:/Users/kobi/workspace/SEProject/app/views/index.scala.html
                    HASH: 5fb771ffcb192d6370709d6f1877054a2aae3a1d
                    MATRIX: 774->1|885->18|922->21|956->47|995->49|1035->55|1049->61|1103->94
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4
                    -- GENERATED --
                */
            