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

import tw.com.springmvc.dao.SoundDao;
import tw.com.springmvc.entity.Sound;

@Controller
public class IndexController {

	@Autowired
	private SoundDao soundDao;

	@RequestMapping(value = {"/","/index"})
	public String index(Model m) {
		List<Sound> sounds=soundDao.getSounds();
		m.addAttribute("sounds",sounds);
		return "index";
	}
		
	
	@RequestMapping(value = "/add_sound")
	public String addSound(Model m) {
		//目前無用途
//		m.addAttribute("title","Add sound");
		return "sound_add";
	}
	
	@RequestMapping(value = "/handle_product", method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Sound sound,HttpServletRequest request) {
		soundDao.createSound(sound);
		//重轉發至頁面
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	//刪除
	@RequestMapping("/delete/{id}")
	public RedirectView deleteSound(@PathVariable("id") int id,HttpServletRequest request) {
		this.soundDao.deleteSound(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping(value = "/update/{soundId}")
	public String updateFrom(@PathVariable("soundId") int pid,Model model) {
		Sound sound=this.soundDao.getSound(pid);
		model.addAttribute("sound",sound);
		return "sound_update";
	}
}
