package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fsp2Pln entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.Fsp2Pln
 * @author MyEclipse Persistence Tools
 */

public class Fsp2PlnDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Fsp2PlnDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Fsp2Pln transientInstance) {
		log.debug("saving Fsp2Pln instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fsp2Pln persistentInstance) {
		log.debug("deleting Fsp2Pln instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fsp2Pln findById(com.gopawpaw.erp.hibernate.f.Fsp2PlnId id) {
		log.debug("getting Fsp2Pln instance with id: " + id);
		try {
			Fsp2Pln instance = (Fsp2Pln) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.Fsp2Pln", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fsp2Pln instance) {
		log.debug("finding Fsp2Pln instance by example");
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
		log.debug("finding Fsp2Pln instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fsp2Pln as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fsp2Pln instances");
		try {
			String queryString = "from Fsp2Pln";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fsp2Pln merge(Fsp2Pln detachedInstance) {
		log.debug("merging Fsp2Pln instance");
		try {
			Fsp2Pln result = (Fsp2Pln) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fsp2Pln instance) {
		log.debug("attaching dirty Fsp2Pln instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fsp2Pln instance) {
		log.debug("attaching clean Fsp2Pln instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Fsp2PlnDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Fsp2PlnDAO) ctx.getBean("Fsp2PlnDAO");
	}
}