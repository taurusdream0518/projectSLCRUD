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
import tw.com.springmvc.dao.SoundDao;
import tw.com.springmvc.entity.Light;
import tw.com.springmvc.entity.Sound;

@Controller
public class IndexController {

	@Autowired
	private SoundDao soundDao;
	
	@Autowired
	private LightDao lightDao;

	@RequestMapping(value = {"/","/index"})
	public String index(Model m) {
		List<Sound> sounds=soundDao.getSounds();
		m.addAttribute("sounds",sounds);
		List<Light> lights=lightDao.getLights();
		m.addAttribute("lights",lights);
		m.addAttribute("title","Index");
		return "index";
	}		
	

}
