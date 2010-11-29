package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SodrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SodrDet
 * @author MyEclipse Persistence Tools
 */

public class SodrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SodrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SodrDet transientInstance) {
		log.debug("saving SodrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SodrDet persistentInstance) {
		log.debug("deleting SodrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SodrDet findById(com.gopawpaw.erp.hibernate.s.SodrDetId id) {
		log.debug("getting SodrDet instance with id: " + id);
		try {
			SodrDet instance = (SodrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SodrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SodrDet instance) {
		log.debug("finding SodrDet instance by example");
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
		log.debug("finding SodrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SodrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SodrDet instances");
		try {
			String queryString = "from SodrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SodrDet merge(SodrDet detachedInstance) {
		log.debug("merging SodrDet instance");
		try {
			SodrDet result = (SodrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SodrDet instance) {
		log.debug("attaching dirty SodrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SodrDet instance) {
		log.debug("attaching clean SodrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SodrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SodrDetDAO) ctx.getBean("SodrDetDAO");
	}
}