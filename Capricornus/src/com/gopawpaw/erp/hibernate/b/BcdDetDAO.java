package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BcdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BcdDet
 * @author MyEclipse Persistence Tools
 */

public class BcdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BcdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BcdDet transientInstance) {
		log.debug("saving BcdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BcdDet persistentInstance) {
		log.debug("deleting BcdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BcdDet findById(com.gopawpaw.erp.hibernate.b.BcdDetId id) {
		log.debug("getting BcdDet instance with id: " + id);
		try {
			BcdDet instance = (BcdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BcdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BcdDet instance) {
		log.debug("finding BcdDet instance by example");
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
		log.debug("finding BcdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BcdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BcdDet instances");
		try {
			String queryString = "from BcdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BcdDet merge(BcdDet detachedInstance) {
		log.debug("merging BcdDet instance");
		try {
			BcdDet result = (BcdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BcdDet instance) {
		log.debug("attaching dirty BcdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BcdDet instance) {
		log.debug("attaching clean BcdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BcdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BcdDetDAO) ctx.getBean("BcdDetDAO");
	}
}