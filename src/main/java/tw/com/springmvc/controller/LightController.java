package tw.com.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import tw.com.springmvc.dao.LightDao;
import tw.com.springmvc.entity.Light;

@Controller
public class LightController {
	
	@Autowired
	private LightDao lightDao;
	
	@RequestMapping(value = {"/light"})
	public String index(Model m) {
		List<Light> lights=lightDao.getFixtureEntities();
		m.addAttribute("lights",lights);
		m.addAttribute("title","Light");
		return "light";
	}		
	
	@RequestMapping(value = "/add_light")
	public String addLight(Model m) {		
		m.addAttribute("title","Add light");
		return "light_add";
	}
	
	@RequestMapping(value = "/handle_light_add", method=RequestMethod.POST)
	public RedirectView handleLight_add(@ModelAttribute Light light,HttpServletRequest request) {
		lightDao.createFixtureEntity(light);
		//重轉發至頁面
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/add_light");
		return redirectView;
	}
	
	//刪除
	@RequestMapping("/delete_light/{id}")
	public RedirectView deleteLight(@PathVariable("id") int id,HttpServletRequest request) {
		this.lightDao.deleteFixtureEntity(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/light");
		return redirectView;
	}
	
	@RequestMapping(value = "/update_light/{lightId}")
	public String updateFrom(@PathVariable("lightId") int pid,Model model) {
		Light light=this.lightDao.getLight(pid);
		model.addAttribute("light",light);
		model.addAttribute("title","Update light");	
		return "light_update";
	}
	
	@RequestMapping(value = "/handle_light_update", method=RequestMethod.POST)
	public RedirectView handleLight_update(@ModelAttribute Light light,HttpServletRequest request) {
		lightDao.createFixtureEntity(light);
		//重轉發至頁面
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/light");
		return redirectView;
	}

}
