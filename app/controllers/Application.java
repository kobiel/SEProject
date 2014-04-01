package controllers;

import play.*;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Hello World!!!"));
    }

    public static Result first() {
        return ok(first.render("Hello World!!!", Html.empty()));
    }

    public static Result second() {
        return ok(second.render("Hello World!!!", Html.empty()));
    }

    public static Result third() {
        return ok(third.render("Hello World!!!", Html.empty()));
    }
}
