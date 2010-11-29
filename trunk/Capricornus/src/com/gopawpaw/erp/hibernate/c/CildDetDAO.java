package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CildDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CildDet
 * @author MyEclipse Persistence Tools
 */

public class CildDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CildDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CildDet transientInstance) {
		log.debug("saving CildDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CildDet persistentInstance) {
		log.debug("deleting CildDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CildDet findById(com.gopawpaw.erp.hibernate.c.CildDetId id) {
		log.debug("getting CildDet instance with id: " + id);
		try {
			CildDet instance = (CildDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CildDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CildDet instance) {
		log.debug("finding CildDet instance by example");
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
		log.debug("finding CildDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CildDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CildDet instances");
		try {
			String queryString = "from CildDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CildDet merge(CildDet detachedInstance) {
		log.debug("merging CildDet instance");
		try {
			CildDet result = (CildDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CildDet instance) {
		log.debug("attaching dirty CildDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CildDet instance) {
		log.debug("attaching clean CildDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CildDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CildDetDAO) ctx.getBean("CildDetDAO");
	}
}