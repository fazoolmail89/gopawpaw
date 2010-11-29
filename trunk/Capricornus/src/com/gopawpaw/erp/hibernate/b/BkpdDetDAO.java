package com.gopawpaw.erp.hibernate.b;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * BkpdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.b.BkpdDet
 * @author MyEclipse Persistence Tools
 */

public class BkpdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(BkpdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(BkpdDet transientInstance) {
		log.debug("saving BkpdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BkpdDet persistentInstance) {
		log.debug("deleting BkpdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BkpdDet findById(com.gopawpaw.erp.hibernate.b.BkpdDetId id) {
		log.debug("getting BkpdDet instance with id: " + id);
		try {
			BkpdDet instance = (BkpdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.b.BkpdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BkpdDet instance) {
		log.debug("finding BkpdDet instance by example");
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
		log.debug("finding BkpdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BkpdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all BkpdDet instances");
		try {
			String queryString = "from BkpdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BkpdDet merge(BkpdDet detachedInstance) {
		log.debug("merging BkpdDet instance");
		try {
			BkpdDet result = (BkpdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BkpdDet instance) {
		log.debug("attaching dirty BkpdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BkpdDet instance) {
		log.debug("attaching clean BkpdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BkpdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BkpdDetDAO) ctx.getBean("BkpdDetDAO");
	}
}