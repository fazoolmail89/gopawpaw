package com.gopawpaw.erp.hibernate.c;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * CmtDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.c.CmtDet
 * @author MyEclipse Persistence Tools
 */

public class CmtDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CmtDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(CmtDet transientInstance) {
		log.debug("saving CmtDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CmtDet persistentInstance) {
		log.debug("deleting CmtDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CmtDet findById(com.gopawpaw.erp.hibernate.c.CmtDetId id) {
		log.debug("getting CmtDet instance with id: " + id);
		try {
			CmtDet instance = (CmtDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.c.CmtDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CmtDet instance) {
		log.debug("finding CmtDet instance by example");
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
		log.debug("finding CmtDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CmtDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all CmtDet instances");
		try {
			String queryString = "from CmtDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CmtDet merge(CmtDet detachedInstance) {
		log.debug("merging CmtDet instance");
		try {
			CmtDet result = (CmtDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CmtDet instance) {
		log.debug("attaching dirty CmtDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CmtDet instance) {
		log.debug("attaching clean CmtDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CmtDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CmtDetDAO) ctx.getBean("CmtDetDAO");
	}
}