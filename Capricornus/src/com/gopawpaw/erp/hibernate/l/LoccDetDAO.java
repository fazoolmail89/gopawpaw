package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LoccDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LoccDet
 * @author MyEclipse Persistence Tools
 */

public class LoccDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LoccDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LoccDet transientInstance) {
		log.debug("saving LoccDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LoccDet persistentInstance) {
		log.debug("deleting LoccDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LoccDet findById(com.gopawpaw.erp.hibernate.l.LoccDetId id) {
		log.debug("getting LoccDet instance with id: " + id);
		try {
			LoccDet instance = (LoccDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LoccDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LoccDet instance) {
		log.debug("finding LoccDet instance by example");
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
		log.debug("finding LoccDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LoccDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LoccDet instances");
		try {
			String queryString = "from LoccDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LoccDet merge(LoccDet detachedInstance) {
		log.debug("merging LoccDet instance");
		try {
			LoccDet result = (LoccDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LoccDet instance) {
		log.debug("attaching dirty LoccDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LoccDet instance) {
		log.debug("attaching clean LoccDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LoccDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LoccDetDAO) ctx.getBean("LoccDetDAO");
	}
}