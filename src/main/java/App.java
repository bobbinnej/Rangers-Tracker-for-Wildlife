import static spark.Spark.*;
import java.util.HashMap;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.ModelAndView;
import java.util.Map;

import spark.ModelAndView;

public class App {
    public static void main(String[] args) {
      staticFileLocation("/public");

      get("/", (request,respond)->{
          Map<String, Object>model=new HashMap<>();
          return new ModelAndView(model,"index.hbs");
      },  new HandlebarsTemplateEngine());

      get("/animals", (request,respond)->{
          Map<String, Object>model=new HashMap<>();
          return new ModelAndView(model, "animals.hbs");
      },  new HandlebarsTemplateEngine());

      post("/new/animals", (request,respond)->{
          Map<String, Object>model=new HashMap<>();
          String name=request.queryParams("name");
          String category=request.queryParams("category");
          String health=request.queryParams("health");
          String age=request.queryParams("age");

          Endangered endanger=new Endagered()
      })
    }
}
