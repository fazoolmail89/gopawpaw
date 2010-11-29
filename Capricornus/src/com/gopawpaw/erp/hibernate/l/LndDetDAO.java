package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LndDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LndDet
 * @author MyEclipse Persistence Tools
 */

public class LndDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LndDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LndDet transientInstance) {
		log.debug("saving LndDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LndDet persistentInstance) {
		log.debug("deleting LndDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LndDet findById(com.gopawpaw.erp.hibernate.l.LndDetId id) {
		log.debug("getting LndDet instance with id: " + id);
		try {
			LndDet instance = (LndDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LndDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LndDet instance) {
		log.debug("finding LndDet instance by example");
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
		log.debug("finding LndDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LndDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LndDet instances");
		try {
			String queryString = "from LndDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LndDet merge(LndDet detachedInstance) {
		log.debug("merging LndDet instance");
		try {
			LndDet result = (LndDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LndDet instance) {
		log.debug("attaching dirty LndDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LndDet instance) {
		log.debug("attaching clean LndDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LndDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LndDetDAO) ctx.getBean("LndDetDAO");
	}
}