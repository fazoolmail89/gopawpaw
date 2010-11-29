package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ecd3Det entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.Ecd3Det
 * @author MyEclipse Persistence Tools
 */

public class Ecd3DetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Ecd3DetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Ecd3Det transientInstance) {
		log.debug("saving Ecd3Det instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ecd3Det persistentInstance) {
		log.debug("deleting Ecd3Det instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ecd3Det findById(com.gopawpaw.erp.hibernate.e.Ecd3DetId id) {
		log.debug("getting Ecd3Det instance with id: " + id);
		try {
			Ecd3Det instance = (Ecd3Det) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.Ecd3Det", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ecd3Det instance) {
		log.debug("finding Ecd3Det instance by example");
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
		log.debug("finding Ecd3Det instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ecd3Det as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Ecd3Det instances");
		try {
			String queryString = "from Ecd3Det";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ecd3Det merge(Ecd3Det detachedInstance) {
		log.debug("merging Ecd3Det instance");
		try {
			Ecd3Det result = (Ecd3Det) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ecd3Det instance) {
		log.debug("attaching dirty Ecd3Det instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ecd3Det instance) {
		log.debug("attaching clean Ecd3Det instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Ecd3DetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Ecd3DetDAO) ctx.getBean("Ecd3DetDAO");
	}
}