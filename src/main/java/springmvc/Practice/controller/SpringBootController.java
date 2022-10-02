package springmvc.Practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.Practice.model.Employee;

@Controller
public class SpringBootController {

    @RequestMapping("/recycle")
    public String Bin(){
        return "RecycleBin";
    }


    @RequestMapping("/add_book")
    public String addBOOk(Model model){

        model.addAttribute("A","JAVA");
        model.addAttribute("B","JAVA 8");
        model.addAttribute("C","Spring");
        model.addAttribute("D","Spring Boot");
        model.addAttribute("E","Web Services");

        return "Add_Book";
    }
    @RequestMapping("/emp_data")
    public String EmpList(Model model){

        Employee employee = new Employee("Gaurav",100,"Cs");
        model.addAttribute("Emp1",employee);
        Employee employee1 = new Employee("Rohit",101,"ME");
        model.addAttribute("Emp2",employee1);

        return "EmpList";
    }
}
