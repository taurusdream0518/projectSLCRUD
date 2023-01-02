package tw.com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.springmvc.entity.Light;

@Component
public class LightDao extends FixtureDao<Light>{
	
	@Override
	public List<Light> getFixtureEntities() {
		List<Light> lights = this.hibernateTemplate.loadAll(Light.class);
		return lights;
	}

	@Override
	public void deleteFixtureEntity(Integer id) {
		Light light = this.hibernateTemplate.load(Light.class, id);
		this.hibernateTemplate.delete(light);
		
	}
	
	public Light getLight(Integer id) {
		return this.hibernateTemplate.get(Light.class, id);
	}
	
	
}
