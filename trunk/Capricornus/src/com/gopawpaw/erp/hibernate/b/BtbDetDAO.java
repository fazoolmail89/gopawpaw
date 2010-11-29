package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BtbDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BtbDet
 * @author MyEclipse Persistence Tools
 */

public class BtbDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BtbDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BtbDet transientInstance) {
		log.debug("saving BtbDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BtbDet persistentInstance) {
		log.debug("deleting BtbDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BtbDet findById(com.gopawpaw.erp.hibernate.b.BtbDetId id) {
		log.debug("getting BtbDet instance with id: " + id);
		try {
			BtbDet instance = (BtbDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BtbDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BtbDet instance) {
		log.debug("finding BtbDet instance by example");
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
		log.debug("finding BtbDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BtbDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BtbDet instances");
		try {
			String queryString = "from BtbDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BtbDet merge(BtbDet detachedInstance) {
		log.debug("merging BtbDet instance");
		try {
			BtbDet result = (BtbDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BtbDet instance) {
		log.debug("attaching dirty BtbDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BtbDet instance) {
		log.debug("attaching clean BtbDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BtbDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BtbDetDAO) ctx.getBean("BtbDetDAO");
	}
}