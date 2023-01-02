package tw.com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.springmvc.entity.Sound;

@Component
public class SoundDao extends FixtureDao<Sound> {

	@Override
	public List<Sound> getFixtureEntities() {
		List<Sound> sounds = this.hibernateTemplate.loadAll(Sound.class);
		return sounds;
	}

	@Override
	public void deleteFixtureEntity(Integer id) {
		Sound s = this.hibernateTemplate.load(Sound.class, id);
		this.hibernateTemplate.delete(s);

	}

	// 取得單一個product
	@Transactional
	public Sound getSound(Integer id) {
		return this.hibernateTemplate.get(Sound.class, id);
	}

}
