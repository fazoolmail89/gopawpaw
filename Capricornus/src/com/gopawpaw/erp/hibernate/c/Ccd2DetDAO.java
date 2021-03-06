package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ccd2Det entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.Ccd2Det
 * @author MyEclipse Persistence Tools
 */

public class Ccd2DetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Ccd2DetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Ccd2Det transientInstance) {
		log.debug("saving Ccd2Det instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ccd2Det persistentInstance) {
		log.debug("deleting Ccd2Det instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ccd2Det findById(com.gopawpaw.erp.hibernate.c.Ccd2DetId id) {
		log.debug("getting Ccd2Det instance with id: " + id);
		try {
			Ccd2Det instance = (Ccd2Det) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.Ccd2Det", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Ccd2Det instance) {
		log.debug("finding Ccd2Det instance by example");
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
		log.debug("finding Ccd2Det instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ccd2Det as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Ccd2Det instances");
		try {
			String queryString = "from Ccd2Det";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ccd2Det merge(Ccd2Det detachedInstance) {
		log.debug("merging Ccd2Det instance");
		try {
			Ccd2Det result = (Ccd2Det) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ccd2Det instance) {
		log.debug("attaching dirty Ccd2Det instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ccd2Det instance) {
		log.debug("attaching clean Ccd2Det instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Ccd2DetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Ccd2DetDAO) ctx.getBean("Ccd2DetDAO");
	}
}