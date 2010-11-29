package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * TxrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.TxrdDet
 * @author MyEclipse Persistence Tools
 */

public class TxrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TxrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(TxrdDet transientInstance) {
		log.debug("saving TxrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TxrdDet persistentInstance) {
		log.debug("deleting TxrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TxrdDet findById(com.gopawpaw.erp.hibernate.t.TxrdDetId id) {
		log.debug("getting TxrdDet instance with id: " + id);
		try {
			TxrdDet instance = (TxrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.TxrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TxrdDet instance) {
		log.debug("finding TxrdDet instance by example");
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
		log.debug("finding TxrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TxrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TxrdDet instances");
		try {
			String queryString = "from TxrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TxrdDet merge(TxrdDet detachedInstance) {
		log.debug("merging TxrdDet instance");
		try {
			TxrdDet result = (TxrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TxrdDet instance) {
		log.debug("attaching dirty TxrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TxrdDet instance) {
		log.debug("attaching clean TxrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TxrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TxrdDetDAO) ctx.getBean("TxrdDetDAO");
	}
}