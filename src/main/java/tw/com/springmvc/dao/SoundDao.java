package tw.com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.springmvc.entity.Sound;

@Component
public class SoundDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// 新增product
	@Transactional
	public void createSound(Sound sound) {
		this.hibernateTemplate.saveOrUpdate(sound);
	}

	// 取得全部product
	public List<Sound> getSounds() {
		List<Sound> sounds = this.hibernateTemplate.loadAll(Sound.class);
		return sounds;
	}

	// 刪除
	@Transactional
	public void deleteSound(Integer id) {
		Sound s = this.hibernateTemplate.load(Sound.class, id);
		this.hibernateTemplate.delete(s);
	}

	// 取得單一個product
	@Transactional
	public Sound getSound(Integer id) {
		return this.hibernateTemplate.get(Sound.class, id);
	}
	
}
