package tw.com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.springmvc.entity.Light;

@Component
public class LightDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createLight(Light light) {
		this.hibernateTemplate.saveOrUpdate(light);
	}
	@Transactional
	public List<Light> getLights(){
		List<Light> lights = this.hibernateTemplate.loadAll(Light.class);
		return lights;
	}
	
	@Transactional
	public void deleteLight(Integer id) {
		Light l = this.hibernateTemplate.load(Light.class, id);
		this.hibernateTemplate.delete(l);
	}
	
	public Light getLight(Integer id) {
		return this.hibernateTemplate.get(Light.class, id);
	}
}
