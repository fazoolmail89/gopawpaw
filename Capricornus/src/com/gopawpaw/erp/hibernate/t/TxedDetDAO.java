package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxedDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxedDet
 * @author MyEclipse Persistence Tools
 */

public class TxedDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxedDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxedDet transientInstance) {
		log.debug("saving TxedDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxedDet persistentInstance) {
		log.debug("deleting TxedDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxedDet findById(com.gopawpaw.erp.hibernate.t.TxedDetId id) {
		log.debug("getting TxedDet instance with id: " + id);
		try {
			TxedDet instance = (TxedDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxedDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxedDet instance) {
		log.debug("finding TxedDet instance by example");
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
		log.debug("finding TxedDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxedDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxedDet instances");
		try {
			String queryString = "from TxedDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxedDet merge(TxedDet detachedInstance) {
		log.debug("merging TxedDet instance");
		try {
			TxedDet result = (TxedDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxedDet instance) {
		log.debug("attaching dirty TxedDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxedDet instance) {
		log.debug("attaching clean TxedDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxedDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxedDetDAO) ctx.getBean("TxedDetDAO");
	}
}