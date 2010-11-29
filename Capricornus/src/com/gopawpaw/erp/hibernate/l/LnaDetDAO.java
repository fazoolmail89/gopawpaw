package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LnaDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LnaDet
 * @author MyEclipse Persistence Tools
 */

public class LnaDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LnaDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LnaDet transientInstance) {
		log.debug("saving LnaDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LnaDet persistentInstance) {
		log.debug("deleting LnaDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LnaDet findById(com.gopawpaw.erp.hibernate.l.LnaDetId id) {
		log.debug("getting LnaDet instance with id: " + id);
		try {
			LnaDet instance = (LnaDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LnaDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LnaDet instance) {
		log.debug("finding LnaDet instance by example");
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
		log.debug("finding LnaDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LnaDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LnaDet instances");
		try {
			String queryString = "from LnaDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LnaDet merge(LnaDet detachedInstance) {
		log.debug("merging LnaDet instance");
		try {
			LnaDet result = (LnaDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LnaDet instance) {
		log.debug("attaching dirty LnaDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LnaDet instance) {
		log.debug("attaching clean LnaDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LnaDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LnaDetDAO) ctx.getBean("LnaDetDAO");
	}
}