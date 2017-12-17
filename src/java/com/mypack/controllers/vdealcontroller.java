
 package com.mypack.controllers;




import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;

//import com.boraji.tutorial.spring.model.User;
//import com.boraji.tutorial.spring.validator.UserValidator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import beans.loginsignup;
import com.mypack.dao.vehdao;
import javafx.scene.control.Alert;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;

@Controller
public class vdealcontroller {
    
   
        //setCommandName("customerForm");

//public LoginService loginService;
    @Autowired
    vehdao dao;
    
   private loginsignupValidator userValidator=new loginsignupValidator();
   
   @InitBinder
   protected void initBinder(WebDataBinder binder) {
      binder.addValidators(userValidator);
   }   
    @RequestMapping("/signup")
    public ModelAndView signup() {
        return new ModelAndView("signup", "command", new loginsignup());
        
    }
    @RequestMapping("/viewvehicles")
    public ModelAndView viewvehicles() {
        return new ModelAndView("viewvehicles", "command", new loginsignup());
        
    }
    @RequestMapping("/viewcar1")
    public ModelAndView viewcar1() {
        return new ModelAndView("viewcar1", "command", new loginsignup());
        
    }
    @RequestMapping("/viewbike1")
    public ModelAndView viewbike1() {
        return new ModelAndView("viewbike1", "command", new loginsignup());
        
    }
    

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String signUser(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
        System.out.println(result.hasErrors());
  System.out.println(result.getFieldError());
      if (result.hasErrors()) {
         model.addAttribute("command",user);
        return "signup";
    
      }
      else
      {
          dao.save(user);
          return "redirect:/login";
      }
    }
    
    

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login", "command", new loginsignup());
    }

   
    @RequestMapping(value = "/check1", method = RequestMethod.POST)
 public String logUser(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
  
  //System.out.println(result.hasErrors());
  //System.out.println(result.getFieldError());
      if (result.hasErrors()) {
         model.addAttribute("command",user);
return "login"; 
      }
      
     int n = dao.check(user);
        System.out.println(n);
   if (n == 1) {
            return "redirect:/adminpage";
        } else if (n == 2) {
            return "redirect:/cust";

        } else {
            return "redirect:/index";
        }
         }
 
 @RequestMapping(value="/check",method = RequestMethod.POST)
	public ModelAndView check(@ModelAttribute("emp") loginsignup emp){
		int n =dao.check(emp);
                System.out.println(n);
                if(n==1)
		return new ModelAndView("redirect:/adminpage");
                
                else if(n==2){
                    return new ModelAndView("redirect:/cust");
              
                }
                else
                   	return new ModelAndView("redirect:/index");
            
        }

    @RequestMapping("/contact")
    public ModelAndView contact() {
        return new ModelAndView("contact", "command", new loginsignup());
    }
    
    @RequestMapping(value ="/contact-post", method = RequestMethod.POST)
    public ModelAndView feedback(@ModelAttribute("emp") loginsignup emp) {
        System.out.println(emp.getUsername());
        System.out.println(emp.getEmail());
        System.out.println(emp.getSubject());
        System.out.println(emp.getMessage());
        dao.feedback(emp);
        return new ModelAndView("redirect:/contact");
    }
 @RequestMapping("/sell_car")
    public ModelAndView sell_car() {
        return new ModelAndView("sell_car", "command", new loginsignup());
    }
    
    @RequestMapping(value ="/sell-car", method = RequestMethod.POST)
    public ModelAndView sell_car(@ModelAttribute("emp") loginsignup emp) {
        
        dao.sell_car(emp);
        return new ModelAndView("redirect:/sell_car1");
    }
@RequestMapping("/sell_car1")
    public ModelAndView sell_car1() {
        return new ModelAndView("sell_car1", "command", new loginsignup());
    }
    
     @RequestMapping(value ="/sell-car1", method = RequestMethod.POST)
    public ModelAndView sell_car1(@ModelAttribute("emp") loginsignup emp) {
        
        dao.sell_car1(emp);
        return new ModelAndView("redirect:/buy_vehicle");
    }
    
    
    @RequestMapping("/buy_vehicle")
    public ModelAndView buy_vehicle() {
        List<loginsignup> list = dao.getDetails();
        return new ModelAndView("buy_vehicle", "list", list);
    }
    
     @RequestMapping("/shop")
    public ModelAndView shop() {
        return new ModelAndView("shop", "command", new loginsignup());
    }
    @RequestMapping("/adminpage")
    public ModelAndView showform2() {
        return new ModelAndView("adminpage", "command", new loginsignup());
    }

    @RequestMapping("/cust")
    public ModelAndView showform4() {
        return new ModelAndView("cust", "command", new loginsignup());
    }

    @RequestMapping("/car_details")
    public ModelAndView showform7() {
        return new ModelAndView("car_details", "command", new loginsignup());
    }

    @RequestMapping(value = "/choose_car", method = RequestMethod.POST)
    public ModelAndView choose_car(@ModelAttribute("emp") loginsignup emp) {
        //dao.save(emp);
        return new ModelAndView("redirect:/index");
    }

    @RequestMapping("/index")
    public ModelAndView showform3() {
        return new ModelAndView("index", "command", new loginsignup());
    }
@RequestMapping("/about")
    public ModelAndView about() {
        return new ModelAndView("about","command",new loginsignup());
    }
    @RequestMapping("/termofservice")
    public ModelAndView termofservice() {
        return new ModelAndView("termofservice","command",new loginsignup());
    }
    @RequestMapping("/privacy")
    public ModelAndView privacy() {
        return new ModelAndView("privacy","command",new loginsignup());
    }
    @RequestMapping("/models")
    public ModelAndView models() {
        return new ModelAndView("models","command",new loginsignup());
    }
     

    @RequestMapping("/add_vehicle")
    public ModelAndView showform5() {
        return new ModelAndView("add_vehicle", "command", new loginsignup());
    }

    @RequestMapping(value = "/enquiry-post", method = RequestMethod.POST)
    public ModelAndView enquiry(@ModelAttribute("emp") loginsignup emp) {
        dao.enquiry(emp);
        return new ModelAndView("redirect:/about");
    }

    @RequestMapping("/car")
    public ModelAndView showform6() {
        return new ModelAndView("car", "command", new loginsignup());
    }

     @RequestMapping("/back")
    public ModelAndView back() {
        return new ModelAndView("firstpage", "command", new loginsignup());
    }
    @RequestMapping("/brands")
    public ModelAndView brands() {
        return new ModelAndView("brands", "command", new loginsignup());
    }

    
    
    
    /*@RequestMapping(value = "/insertcardet", method = RequestMethod.POST)
    public ModelAndView insertcardet(@ModelAttribute("command") loginsignup emp) {
        System.out.println(emp.getFile());
        dao.insertcardet(emp);
        return new ModelAndView("redirect:/adminpage");
    }*/
    
    @RequestMapping(value = "/insertcardet", method = RequestMethod.POST)
    
        public String insertcardet(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
        System.out.println(result.hasErrors());
  System.out.println(result.getFieldError());
      if (result.hasErrors()) {
         model.addAttribute("command",user);
        return "car";
      }
      else
      {
          dao.insertcardet(user);
          return "redirect:/adminpage";
      }
    }
    
   

    @RequestMapping("/bike")
    public ModelAndView showform8() {
        return new ModelAndView("bike", "command", new loginsignup());
    }

    @RequestMapping(value = "/insertbikedet", method = RequestMethod.POST)
     public String insertbikedet(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
        System.out.println(result.hasErrors());
  System.out.println(result.getFieldError());
      if (result.hasErrors()) {
         model.addAttribute("command",user);
        return "bike";
      }
      else
      {
          dao.insertbikedet(user);
          return "redirect:/adminpage";
      }
    }

    @RequestMapping("/view_vehicle")
    public ModelAndView showform9() {
        return new ModelAndView("view_vehicle", "command", new loginsignup());
    }
@RequestMapping("/firstpage")
    public ModelAndView firstpage() {
       //JOptionPane.showMessageDialog(parentComponent, this);
        return new ModelAndView("firstpage", "command", new loginsignup());
    }
    @RequestMapping("/carbike")
    public ModelAndView carbike() {
       //JOptionPane.showMessageDialog(parentComponent, this);
        return new ModelAndView("carbike", "command", new loginsignup());
    }
    @RequestMapping("/addcustomer")
    public ModelAndView showform10() {
        return new ModelAndView("addcustomer", "command", new loginsignup());
    }

    @RequestMapping("/addnewcustomer")
    public ModelAndView showform11() {
        return new ModelAndView("addnewcustomer", "command", new loginsignup());
    }

    @RequestMapping(value = "/addcdet", method = RequestMethod.POST)
   public String addcdet(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
        System.out.println(result.hasErrors());
  System.out.println(result.getFieldError());
      if (result.hasErrors()) {
         model.addAttribute("command",user);
        return "addnewcustomer";
      }
      else
      {
          dao.addcdet(user);
          return "redirect:/adminpage";
      }
    }

    @RequestMapping("/view_car")
    public ModelAndView viewcar() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("view_car", "list", list);
    }
    @RequestMapping("/view")
    public ModelAndView view() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("view", "list", list);
    }
    @RequestMapping("/view2")
    public ModelAndView view2() {
        List<loginsignup> list = dao.getBike();
        return new ModelAndView("view2", "list", list);
    }
    
    @RequestMapping(value = "/vc/{vehicleno}")
    public ModelAndView vc(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("viewcar", "list", list);
    }
 @RequestMapping(value = "/vb/{bikeno}")
    public ModelAndView vb(@PathVariable int bikeno) {
        List<loginsignup> list = dao.sbike(bikeno);
        return new ModelAndView("view_bike", "list", list);
    }


    @RequestMapping("/viewcustomer")
    public ModelAndView viewcustomer() {
        List<loginsignup> list = dao.getCustomers();
        return new ModelAndView("viewcustomer", "list", list);
    }
    
    @RequestMapping("/view_bike")
    public ModelAndView viewbike() {
        List<loginsignup> list = dao.getBike();
        return new ModelAndView("view_bike", "list", list);
    }
  

    @RequestMapping(value = "/carupdate/{vehicleno}")
    public ModelAndView edit(@PathVariable int vehicleno) {
        loginsignup emp = dao.getCarById(vehicleno);
        return new ModelAndView("car_update", "command", emp);
    }
    
   @RequestMapping(value = "/updatecardet", method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute("emp") loginsignup emp) {
        dao.update(emp);
        return new ModelAndView("redirect:/view_car");
    }
    @RequestMapping(value = "/car_delete/{vehicleno}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable int vehicleno) {
        dao.delete(vehicleno);
        return new ModelAndView("redirect:/view_car");
    }

    @RequestMapping(value = "/cusupdate/{id}")
    public ModelAndView edit1(@PathVariable int id) {
        loginsignup emp = dao.getCusById(id);
        return new ModelAndView("cus_update", "command", emp);
    }

    @RequestMapping(value = "/updatecusdet", method = RequestMethod.POST)
    public ModelAndView editsave1(@ModelAttribute("emp") loginsignup emp) {
        dao.updatecusdet(emp);
        return new ModelAndView("redirect:/viewcustomer");
    }


    /* It displays object data into form for the given id. 
	 * The @PathVariable puts URL data into variable.*/
    

    @RequestMapping(value = "/bikeupdate/{bikeno}")
    public ModelAndView bike_update(@PathVariable int bikeno) {
        loginsignup emp = dao.getBikeById(bikeno);
        return new ModelAndView("bike_update", "command", emp);
    }

    /* It updates model object. */
    @RequestMapping(value = "/updatebikedet", method = RequestMethod.POST)
    public ModelAndView updatebikedet(@ModelAttribute("emp") loginsignup emp) {
        dao.updatebike(emp);
        return new ModelAndView("redirect:/view_bike");
    }

    /* It deletes record for the given id in URL and redirects to /viewemp */
    @RequestMapping(value = "/bike_delete/{bikeno}", method = RequestMethod.GET)
    public ModelAndView bike_delete(@PathVariable int bikeno) {
        dao.deletebike(bikeno);
        return new ModelAndView("redirect:/view_bike");
    }

    @RequestMapping(value = "/cus_delete/{id}", method = RequestMethod.GET)
    public ModelAndView cus_delete(@PathVariable int id) {
        dao.deletecus(id);
        return new ModelAndView("redirect:/viewcustomer");
    }

    @RequestMapping("/select_car")
    public ModelAndView select_car() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("select_car", "list", list);
    }

    @RequestMapping("/select_bike")
    public ModelAndView select_bike() {
        List<loginsignup> list = dao.getBike();
        return new ModelAndView("select_bike", "list", list);
    }
   
    @RequestMapping(value = "/cspecification/{vehicleno}")
    public ModelAndView cspecification(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("specification", "list", list);
    }
    @RequestMapping(value = "/cspecification1/{vehicleno}")
    public ModelAndView cspecification1(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("car2spec", "list", list);
    }
     @RequestMapping(value = "/bspecification1/{bikeno}")
    public ModelAndView bspecification1(@PathVariable int bikeno) {
        List<loginsignup> list = dao.sbike(bikeno);
        return new ModelAndView("bspecification1", "list", list);
    }
    @RequestMapping(value = "/carspecification/{vehicleno}")
    public ModelAndView buycar1(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("buy car", "lis", list);
    }
    @RequestMapping(value = "/buycarspecification/{vehicleno}")
    public ModelAndView buycar2(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("buycarspecification", "list", list);
    }
    @RequestMapping(value = "/carspecification1/{vehicleno}")
    public ModelAndView carspecification1(@PathVariable int vehicleno) {
        List<loginsignup> list = dao.scar(vehicleno);
        return new ModelAndView("carspecification1", "list", list);
    }
     @RequestMapping(value = "/carspecification2/{name}")
    public ModelAndView carspecification1(@PathVariable String name) {
        List<loginsignup> list = dao.selectcar(name);
        return new ModelAndView("carspecification2", "list", list);
    }
     @RequestMapping(value = "/bspecificationsingle1/{makemodel}")
    public ModelAndView bspecificationsingle1(@PathVariable String makemodel) {
        List<loginsignup> list = dao.selectbike(makemodel);
        return new ModelAndView("bspecificationsingle1", "list", list);
    }
    @RequestMapping(value = "/bspecificationsingle/{bikeno}")
    public ModelAndView bspecificationsingle(@PathVariable int bikeno) {
        List<loginsignup> list = dao.sbike(bikeno);
        return new ModelAndView("bspecificationsingle", "list", list);
    }
     @RequestMapping(value = "/bspecificationselect/{bikeno}")
    public ModelAndView buycar9(@PathVariable int bikeno) {
        List<loginsignup> list = dao.sbike(bikeno);
        return new ModelAndView("bspecificationselect", "list", list);
    }
    
    
    @RequestMapping(value = "/buy/{vehicleno}")
    public ModelAndView buycar8(@PathVariable int vehicleno) {
        //List<loginsignup> list = dao.scar(vehicleno);
        loginsignup emp = new loginsignup();
        emp.setVehicleno(vehicleno);
        return new ModelAndView("buyc","emp",emp);
    }
    
    /*@RequestMapping("/buyc")
    public ModelAndView showform41() {
        return new ModelAndView("buyc", "command", new loginsignup());
    }*/
   
/*(@RequestMapping("/buy/{vehicleno}")
    public ModelAndView buy1(@PathVariable int vehicleno) {
        //List<loginsignup> list = dao.getCars();
        return new ModelAndView("redirect:/buy");
        //return new ModelAndView("buy", "list", list);
    }*/
    @RequestMapping(value = "/bspecification/{bikeno}")
    public ModelAndView bspecification(@PathVariable int bikeno) {
        List<loginsignup> list = dao.sbike(bikeno);
        return new ModelAndView("bspecification", "list", list);
    }

    @RequestMapping("/custspecification")
    public ModelAndView showform13() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("custspecification", "list", list);
    }
    @RequestMapping("/selectbikespecification")
    public ModelAndView selectbikespecification() {
        List<loginsignup> list = dao.getBike();
        return new ModelAndView("selectbikespecification", "list", list);
    }
     

    @RequestMapping("/bymake")
    public ModelAndView bymake() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("bymake", "list", list);
    }

    @RequestMapping(value = "/bmake")
    public ModelAndView newcarmodels(HttpServletRequest request, @ModelAttribute("newcarmodels") loginsignup login, BindingResult result) {

        System.out.println("values =" + login.getName());
        if (login.getName().equals("selectmake") && login.getModel().equals("selectmodel")) {
            return new ModelAndView("redirect:/bymake");
        } else {
            List<loginsignup> list = dao.getCars();
            //return new ModelAndView("newcarmodels","list",list);

            request.setAttribute("list", list);
            return new ModelAndView("newcarmodels", "command", new loginsignup());
        }
        // return "newcarmodels";
    }

    @RequestMapping("/newcar")
    public ModelAndView newcar() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("newcar", "list", list);
    }

    @RequestMapping("/newcarsmodels")
	public ModelAndView newcarsmodels(){
		List<loginsignup> list=dao.getCars();
		return new ModelAndView("newcarsmodels","list",list);
	}

    @RequestMapping("/bybudget")
    public ModelAndView bybudget() {
        List<loginsignup> list = dao.getCars();
        return new ModelAndView("bybudget", "list", list);
    }

    @RequestMapping(value = "/bbudget")
    public ModelAndView newcarmodels2(HttpServletRequest request, @ModelAttribute("newcarmodels") loginsignup login, BindingResult result) {

        List<loginsignup> list = dao.getCars();
        //return new ModelAndView("newcarmodels","list",list);
        request.setAttribute("list", list);
        return new ModelAndView("newcarmodels", "command", new loginsignup());

    }

    @RequestMapping(value = "/ncmodels", method = RequestMethod.POST)
    public ModelAndView getcarspec(@ModelAttribute("emp") loginsignup emp) {
        List<loginsignup> list = dao.getcarspec(emp);
        return new ModelAndView("showcarbyspec", "list", list);
    }

    @RequestMapping(value = "/BUY/{vehicleno}")
    public ModelAndView buycar(@PathVariable int vehicleno) {
        loginsignup emp = new loginsignup();
        emp.setVehicleno(vehicleno);
        System.out.println(emp.getVehicleno());

        return new ModelAndView("selectedvehbyid", "command", emp);

    }
    @RequestMapping(value = "/selectcarid/{vehicleno}")
    public ModelAndView buycar3(@PathVariable int vehicleno) {
        loginsignup emp = new loginsignup();
        emp.setVehicleno(vehicleno);
        System.out.println(emp.getVehicleno());

        return new ModelAndView("selectedvehbyid", "command", emp);

    }
    @RequestMapping(value = "/selectbikeid/{bikeno}")
    public ModelAndView buycar4(@PathVariable int bikeno) {
        loginsignup emp = new loginsignup();
        emp.setBikeno(bikeno);
        System.out.println(emp.getBikeno());

        return new ModelAndView("selectbikebyid", "command", emp);

    }

    @RequestMapping("/showselectedvehicles")
    public ModelAndView showform20() {
        return new ModelAndView("showselectedvehicles", "command", new loginsignup());
    }

    @RequestMapping(value = "/svid", method = RequestMethod.POST)
    public String buycar1(@ModelAttribute("command") @Validated loginsignup user, BindingResult result,
         Model model) {
        System.out.println(result.hasErrors());
  System.out.println(result.getErrorCount());
      if (result.hasErrors()) {
         
         model.addAttribute("command",user);
        return "selectedvehbyid";
      }
      else
      {
          dao.buycar(user);
          return "cust";
      }
    
    
   /* public ModelAndView buycar1(@ModelAttribute("emp") loginsignup emp) {
        System.out.println(emp.getVehicleno());
        dao.buycar(emp);
        return new ModelAndView("redirect:/cust");
    */
    
    
    
    
    }
     @RequestMapping(value = "/bikeid", method = RequestMethod.POST)
    public ModelAndView buybike1(@ModelAttribute("emp") loginsignup emp) {
        System.out.println(emp.getBikeno());
        dao.buybike1(emp);
        return new ModelAndView("redirect:/cust");
    }

    @RequestMapping(value = "/showsv")
    public ModelAndView showsv(@ModelAttribute("emp") loginsignup emp) {
       // int id = emp.getId();
       // String email = emp.getEmail();
       //System.out.println(id);
        List<loginsignup> list = dao.showsvbc();
        return new ModelAndView("showlist", "list", list);
    }
    @RequestMapping(value = "/showsb")
    public ModelAndView showsb(@ModelAttribute("emp") loginsignup emp) {
        //int id = emp.getId();
        //String email = emp.getEmail();
        //System.out.println(id);
        List<loginsignup> list = dao.showsbbc();
        return new ModelAndView("showlist1", "list", list);
    }
    
    
    
}
