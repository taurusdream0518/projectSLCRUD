package tw.com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tw.com.springmvc.entity.Sound;

@Component
public abstract class FixtureDao<T> {
	
	@Autowired
	protected HibernateTemplate hibernateTemplate;

	// 新增product
	@Transactional
	public void createFixtureEntity(T entity) {
		this.hibernateTemplate.saveOrUpdate(entity);
	}	
	
	// 取得全部product
	@Transactional
	public abstract List<T> getFixtureEntities(); 

	// 刪除
	@Transactional
	public abstract void deleteFixtureEntity(Integer id);

}
