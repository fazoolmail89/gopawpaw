package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DprdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DprdDet
 * @author MyEclipse Persistence Tools
 */

public class DprdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DprdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DprdDet transientInstance) {
		log.debug("saving DprdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DprdDet persistentInstance) {
		log.debug("deleting DprdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DprdDet findById(com.gopawpaw.erp.hibernate.d.DprdDetId id) {
		log.debug("getting DprdDet instance with id: " + id);
		try {
			DprdDet instance = (DprdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DprdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DprdDet instance) {
		log.debug("finding DprdDet instance by example");
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
		log.debug("finding DprdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DprdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DprdDet instances");
		try {
			String queryString = "from DprdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DprdDet merge(DprdDet detachedInstance) {
		log.debug("merging DprdDet instance");
		try {
			DprdDet result = (DprdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DprdDet instance) {
		log.debug("attaching dirty DprdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DprdDet instance) {
		log.debug("attaching clean DprdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DprdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DprdDetDAO) ctx.getBean("DprdDetDAO");
	}
}