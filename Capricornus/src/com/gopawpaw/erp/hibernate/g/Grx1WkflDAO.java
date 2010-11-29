package com.gopawpaw.erp.hibernate.g;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Grx1Wkfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.g.Grx1Wkfl
 * @author MyEclipse Persistence Tools
 */

public class Grx1WkflDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Grx1WkflDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Grx1Wkfl transientInstance) {
		log.debug("saving Grx1Wkfl instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Grx1Wkfl persistentInstance) {
		log.debug("deleting Grx1Wkfl instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Grx1Wkfl findById(com.gopawpaw.erp.hibernate.g.Grx1WkflId id) {
		log.debug("getting Grx1Wkfl instance with id: " + id);
		try {
			Grx1Wkfl instance = (Grx1Wkfl) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.g.Grx1Wkfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Grx1Wkfl instance) {
		log.debug("finding Grx1Wkfl instance by example");
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
		log.debug("finding Grx1Wkfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Grx1Wkfl as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Grx1Wkfl instances");
		try {
			String queryString = "from Grx1Wkfl";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Grx1Wkfl merge(Grx1Wkfl detachedInstance) {
		log.debug("merging Grx1Wkfl instance");
		try {
			Grx1Wkfl result = (Grx1Wkfl) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Grx1Wkfl instance) {
		log.debug("attaching dirty Grx1Wkfl instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Grx1Wkfl instance) {
		log.debug("attaching clean Grx1Wkfl instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Grx1WkflDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Grx1WkflDAO) ctx.getBean("Grx1WkflDAO");
	}
}