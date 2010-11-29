package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxhdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxhdDet
 * @author MyEclipse Persistence Tools
 */

public class TxhdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxhdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxhdDet transientInstance) {
		log.debug("saving TxhdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxhdDet persistentInstance) {
		log.debug("deleting TxhdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxhdDet findById(com.gopawpaw.erp.hibernate.t.TxhdDetId id) {
		log.debug("getting TxhdDet instance with id: " + id);
		try {
			TxhdDet instance = (TxhdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxhdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxhdDet instance) {
		log.debug("finding TxhdDet instance by example");
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
		log.debug("finding TxhdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxhdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxhdDet instances");
		try {
			String queryString = "from TxhdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxhdDet merge(TxhdDet detachedInstance) {
		log.debug("merging TxhdDet instance");
		try {
			TxhdDet result = (TxhdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxhdDet instance) {
		log.debug("attaching dirty TxhdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxhdDet instance) {
		log.debug("attaching clean TxhdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxhdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxhdDetDAO) ctx.getBean("TxhdDetDAO");
	}
}