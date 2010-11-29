package com.gopawpaw.erp.hibernate.f;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fsp3Pln entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.f.Fsp3Pln
 * @author MyEclipse Persistence Tools
 */

public class Fsp3PlnDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Fsp3PlnDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Fsp3Pln transientInstance) {
		log.debug("saving Fsp3Pln instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fsp3Pln persistentInstance) {
		log.debug("deleting Fsp3Pln instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fsp3Pln findById(com.gopawpaw.erp.hibernate.f.Fsp3PlnId id) {
		log.debug("getting Fsp3Pln instance with id: " + id);
		try {
			Fsp3Pln instance = (Fsp3Pln) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.f.Fsp3Pln", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fsp3Pln instance) {
		log.debug("finding Fsp3Pln instance by example");
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
		log.debug("finding Fsp3Pln instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fsp3Pln as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fsp3Pln instances");
		try {
			String queryString = "from Fsp3Pln";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fsp3Pln merge(Fsp3Pln detachedInstance) {
		log.debug("merging Fsp3Pln instance");
		try {
			Fsp3Pln result = (Fsp3Pln) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fsp3Pln instance) {
		log.debug("attaching dirty Fsp3Pln instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fsp3Pln instance) {
		log.debug("attaching clean Fsp3Pln instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Fsp3PlnDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Fsp3PlnDAO) ctx.getBean("Fsp3PlnDAO");
	}
}