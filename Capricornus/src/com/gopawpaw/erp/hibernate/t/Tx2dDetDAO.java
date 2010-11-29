package com.gopawpaw.erp.hibernate.t;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tx2dDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.t.Tx2dDet
 * @author MyEclipse Persistence Tools
 */

public class Tx2dDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(Tx2dDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(Tx2dDet transientInstance) {
		log.debug("saving Tx2dDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tx2dDet persistentInstance) {
		log.debug("deleting Tx2dDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tx2dDet findById(com.gopawpaw.erp.hibernate.t.Tx2dDetId id) {
		log.debug("getting Tx2dDet instance with id: " + id);
		try {
			Tx2dDet instance = (Tx2dDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.t.Tx2dDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tx2dDet instance) {
		log.debug("finding Tx2dDet instance by example");
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
		log.debug("finding Tx2dDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tx2dDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Tx2dDet instances");
		try {
			String queryString = "from Tx2dDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tx2dDet merge(Tx2dDet detachedInstance) {
		log.debug("merging Tx2dDet instance");
		try {
			Tx2dDet result = (Tx2dDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tx2dDet instance) {
		log.debug("attaching dirty Tx2dDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tx2dDet instance) {
		log.debug("attaching clean Tx2dDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static Tx2dDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (Tx2dDetDAO) ctx.getBean("Tx2dDetDAO");
	}
}