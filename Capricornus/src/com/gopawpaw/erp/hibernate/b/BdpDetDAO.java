package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BdpDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BdpDet
 * @author MyEclipse Persistence Tools
 */

public class BdpDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BdpDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BdpDet transientInstance) {
		log.debug("saving BdpDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BdpDet persistentInstance) {
		log.debug("deleting BdpDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BdpDet findById(com.gopawpaw.erp.hibernate.b.BdpDetId id) {
		log.debug("getting BdpDet instance with id: " + id);
		try {
			BdpDet instance = (BdpDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BdpDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BdpDet instance) {
		log.debug("finding BdpDet instance by example");
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
		log.debug("finding BdpDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BdpDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BdpDet instances");
		try {
			String queryString = "from BdpDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BdpDet merge(BdpDet detachedInstance) {
		log.debug("merging BdpDet instance");
		try {
			BdpDet result = (BdpDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BdpDet instance) {
		log.debug("attaching dirty BdpDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BdpDet instance) {
		log.debug("attaching clean BdpDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BdpDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BdpDetDAO) ctx.getBean("BdpDetDAO");
	}
}