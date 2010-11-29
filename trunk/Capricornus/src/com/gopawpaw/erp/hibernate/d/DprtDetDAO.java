package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DprtDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DprtDet
 * @author MyEclipse Persistence Tools
 */

public class DprtDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DprtDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DprtDet transientInstance) {
		log.debug("saving DprtDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DprtDet persistentInstance) {
		log.debug("deleting DprtDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DprtDet findById(com.gopawpaw.erp.hibernate.d.DprtDetId id) {
		log.debug("getting DprtDet instance with id: " + id);
		try {
			DprtDet instance = (DprtDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DprtDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DprtDet instance) {
		log.debug("finding DprtDet instance by example");
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
		log.debug("finding DprtDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DprtDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DprtDet instances");
		try {
			String queryString = "from DprtDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DprtDet merge(DprtDet detachedInstance) {
		log.debug("merging DprtDet instance");
		try {
			DprtDet result = (DprtDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DprtDet instance) {
		log.debug("attaching dirty DprtDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DprtDet instance) {
		log.debug("attaching clean DprtDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DprtDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DprtDetDAO) ctx.getBean("DprtDetDAO");
	}
}