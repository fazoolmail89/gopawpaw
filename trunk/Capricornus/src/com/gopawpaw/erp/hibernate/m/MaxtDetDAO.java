package com.gopawpaw.erp.hibernate.m;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * MaxtDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.m.MaxtDet
 * @author MyEclipse Persistence Tools
 */

public class MaxtDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(MaxtDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(MaxtDet transientInstance) {
		log.debug("saving MaxtDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MaxtDet persistentInstance) {
		log.debug("deleting MaxtDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MaxtDet findById(com.gopawpaw.erp.hibernate.m.MaxtDetId id) {
		log.debug("getting MaxtDet instance with id: " + id);
		try {
			MaxtDet instance = (MaxtDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.m.MaxtDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MaxtDet instance) {
		log.debug("finding MaxtDet instance by example");
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
		log.debug("finding MaxtDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from MaxtDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all MaxtDet instances");
		try {
			String queryString = "from MaxtDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MaxtDet merge(MaxtDet detachedInstance) {
		log.debug("merging MaxtDet instance");
		try {
			MaxtDet result = (MaxtDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MaxtDet instance) {
		log.debug("attaching dirty MaxtDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MaxtDet instance) {
		log.debug("attaching clean MaxtDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MaxtDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MaxtDetDAO) ctx.getBean("MaxtDetDAO");
	}
}