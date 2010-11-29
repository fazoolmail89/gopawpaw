package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LpmdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LpmdDet
 * @author MyEclipse Persistence Tools
 */

public class LpmdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LpmdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LpmdDet transientInstance) {
		log.debug("saving LpmdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LpmdDet persistentInstance) {
		log.debug("deleting LpmdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LpmdDet findById(com.gopawpaw.erp.hibernate.l.LpmdDetId id) {
		log.debug("getting LpmdDet instance with id: " + id);
		try {
			LpmdDet instance = (LpmdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LpmdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LpmdDet instance) {
		log.debug("finding LpmdDet instance by example");
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
		log.debug("finding LpmdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LpmdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LpmdDet instances");
		try {
			String queryString = "from LpmdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LpmdDet merge(LpmdDet detachedInstance) {
		log.debug("merging LpmdDet instance");
		try {
			LpmdDet result = (LpmdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LpmdDet instance) {
		log.debug("attaching dirty LpmdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LpmdDet instance) {
		log.debug("attaching clean LpmdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LpmdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LpmdDetDAO) ctx.getBean("LpmdDetDAO");
	}
}