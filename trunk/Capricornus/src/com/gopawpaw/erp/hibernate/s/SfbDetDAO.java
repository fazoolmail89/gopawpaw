package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SfbDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SfbDet
 * @author MyEclipse Persistence Tools
 */

public class SfbDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SfbDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SfbDet transientInstance) {
		log.debug("saving SfbDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SfbDet persistentInstance) {
		log.debug("deleting SfbDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SfbDet findById(com.gopawpaw.erp.hibernate.s.SfbDetId id) {
		log.debug("getting SfbDet instance with id: " + id);
		try {
			SfbDet instance = (SfbDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SfbDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SfbDet instance) {
		log.debug("finding SfbDet instance by example");
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
		log.debug("finding SfbDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SfbDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SfbDet instances");
		try {
			String queryString = "from SfbDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SfbDet merge(SfbDet detachedInstance) {
		log.debug("merging SfbDet instance");
		try {
			SfbDet result = (SfbDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SfbDet instance) {
		log.debug("attaching dirty SfbDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SfbDet instance) {
		log.debug("attaching clean SfbDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SfbDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SfbDetDAO) ctx.getBean("SfbDetDAO");
	}
}