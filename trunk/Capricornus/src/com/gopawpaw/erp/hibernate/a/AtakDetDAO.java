package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AtakDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AtakDet
 * @author MyEclipse Persistence Tools
 */

public class AtakDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AtakDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AtakDet transientInstance) {
		log.debug("saving AtakDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AtakDet persistentInstance) {
		log.debug("deleting AtakDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AtakDet findById(com.gopawpaw.erp.hibernate.a.AtakDetId id) {
		log.debug("getting AtakDet instance with id: " + id);
		try {
			AtakDet instance = (AtakDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AtakDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AtakDet instance) {
		log.debug("finding AtakDet instance by example");
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
		log.debug("finding AtakDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AtakDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AtakDet instances");
		try {
			String queryString = "from AtakDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AtakDet merge(AtakDet detachedInstance) {
		log.debug("merging AtakDet instance");
		try {
			AtakDet result = (AtakDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AtakDet instance) {
		log.debug("attaching dirty AtakDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AtakDet instance) {
		log.debug("attaching clean AtakDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AtakDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AtakDetDAO) ctx.getBean("AtakDetDAO");
	}
}