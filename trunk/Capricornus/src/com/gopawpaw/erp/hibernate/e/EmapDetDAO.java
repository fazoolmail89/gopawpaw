package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmapDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EmapDet
 * @author MyEclipse Persistence Tools
 */

public class EmapDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmapDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EmapDet transientInstance) {
		log.debug("saving EmapDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmapDet persistentInstance) {
		log.debug("deleting EmapDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmapDet findById(com.gopawpaw.erp.hibernate.e.EmapDetId id) {
		log.debug("getting EmapDet instance with id: " + id);
		try {
			EmapDet instance = (EmapDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EmapDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmapDet instance) {
		log.debug("finding EmapDet instance by example");
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
		log.debug("finding EmapDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmapDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmapDet instances");
		try {
			String queryString = "from EmapDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmapDet merge(EmapDet detachedInstance) {
		log.debug("merging EmapDet instance");
		try {
			EmapDet result = (EmapDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmapDet instance) {
		log.debug("attaching dirty EmapDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmapDet instance) {
		log.debug("attaching clean EmapDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmapDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmapDetDAO) ctx.getBean("EmapDetDAO");
	}
}