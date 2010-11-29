package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbscDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbscDet
 * @author MyEclipse Persistence Tools
 */

public class AbscDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbscDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbscDet transientInstance) {
		log.debug("saving AbscDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbscDet persistentInstance) {
		log.debug("deleting AbscDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbscDet findById(com.gopawpaw.erp.hibernate.a.AbscDetId id) {
		log.debug("getting AbscDet instance with id: " + id);
		try {
			AbscDet instance = (AbscDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbscDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbscDet instance) {
		log.debug("finding AbscDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding AbscDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbscDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbscDet instances");
		try {
			String queryString = "from AbscDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbscDet merge(AbscDet detachedInstance) {
		log.debug("merging AbscDet instance");
		try {
			AbscDet result = (AbscDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbscDet instance) {
		log.debug("attaching dirty AbscDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbscDet instance) {
		log.debug("attaching clean AbscDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbscDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbscDetDAO) ctx.getBean("AbscDetDAO");
	}
}