package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LgsiDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LgsiDet
 * @author MyEclipse Persistence Tools
 */

public class LgsiDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LgsiDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LgsiDet transientInstance) {
		log.debug("saving LgsiDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LgsiDet persistentInstance) {
		log.debug("deleting LgsiDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LgsiDet findById(com.gopawpaw.erp.hibernate.l.LgsiDetId id) {
		log.debug("getting LgsiDet instance with id: " + id);
		try {
			LgsiDet instance = (LgsiDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LgsiDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LgsiDet instance) {
		log.debug("finding LgsiDet instance by example");
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
		log.debug("finding LgsiDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LgsiDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LgsiDet instances");
		try {
			String queryString = "from LgsiDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LgsiDet merge(LgsiDet detachedInstance) {
		log.debug("merging LgsiDet instance");
		try {
			LgsiDet result = (LgsiDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LgsiDet instance) {
		log.debug("attaching dirty LgsiDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LgsiDet instance) {
		log.debug("attaching clean LgsiDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LgsiDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LgsiDetDAO) ctx.getBean("LgsiDetDAO");
	}
}