package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("tracker")
    public String homePage() {
        return
                "<html>" + "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" + "</html>";

    }


        @GetMapping("form")
        public String skillsForm() {
           return
                    "<html><body>" +
                    "<form>" +
                    "<label>Name<input type='text name= 'name' /></label>" +
                            "</br>" +
                    "<label>My favorite language" +
                    "<select name=\"firstlang\" id=\"firstlang\">" +
                    "   <option value=\"java\">Java</option>" +
                    "   <option value=\"javascript\">JavaScript</option>" +
                    "   <option value=\"python\">Python</option>" +
                    "</select></label>" +
                    "</br>" +
                    "<label>My second favorite language" +
                    "<select name=\"secondlang\" id=\"secondlang\">" +
                    "   <option value=\"java\">Java</option>" +
                    "   <option value=\"javascript\">JavaScript</option>" +
                    "   <option value=\"python\">Python</option>" +
                    "</select></label>" +
                    "</br>" +
                    "<label>My third favorite language" +
                    "<select name=\"thirdlang\" id=\"thirdlang\">" +
                    "   <option value=\"java\">Java</option>" +
                    "   <option value=\"javascript\">JavaScript</option>" +
                    "   <option value=\"python\">Python</option>" +
                    "</select></label>" +
                            "</br>" +
                            "<input type='submit' value='Send Request'>" +

                    "</body>" + "</html>";

        }

        @PostMapping("form")
        public String userChoice(@RequestParam String name,
                                 @RequestParam String favoriteLanguage,
                                 @RequestParam String secondFavoriteLanguage,
                                 @RequestParam String thirdFavoriteLanguage) {
            return
                    "<html>" + "<body>" +
                    "<h1>" + name + "</h1>" +

                    "<ol>" +
                            "<br>" +
                    "<li>" + favoriteLanguage + "</li>" +
                            "</br>" +
                    "<li>" + secondFavoriteLanguage + "</li>" +
                            "</br>" +
                    "<li>" + thirdFavoriteLanguage + "</li>" +
                    "</ol>" +
                    "</body>" + "</html>";

        }
}
