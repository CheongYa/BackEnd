package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        // key = data, value = hello!!
        // templates/hello.html 에 있는 9행에 사용된다.
        model.addAttribute("data", "hello!!");

        // templates에 있는 hello에 넘겨진다.
        return "hello";
    }

    // 정적 컨텐츠 : 주소창에 hello-template.html을 붙여 실행하여 있는 그 자체를 보여주는 방식.

    // MVC와 템플릿 엔진 : 템플릿 엔진을 MVC 방식으로 쪼개 랜더링을 시키고 그것을 클라이언트에게 전달해주는 방식.
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    // API : Json으로 바꿔 객체를 반환해주는 것
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
