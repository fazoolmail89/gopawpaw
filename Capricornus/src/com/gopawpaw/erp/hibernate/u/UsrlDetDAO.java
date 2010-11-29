package com.gopawpaw.erp.hibernate.u;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * UsrlDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.u.UsrlDet
 * @author MyEclipse Persistence Tools
 */

public class UsrlDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsrlDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(UsrlDet transientInstance) {
		log.debug("saving UsrlDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UsrlDet persistentInstance) {
		log.debug("deleting UsrlDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UsrlDet findById(com.gopawpaw.erp.hibernate.u.UsrlDetId id) {
		log.debug("getting UsrlDet instance with id: " + id);
		try {
			UsrlDet instance = (UsrlDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.u.UsrlDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UsrlDet instance) {
		log.debug("finding UsrlDet instance by example");
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
		log.debug("finding UsrlDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UsrlDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all UsrlDet instances");
		try {
			String queryString = "from UsrlDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UsrlDet merge(UsrlDet detachedInstance) {
		log.debug("merging UsrlDet instance");
		try {
			UsrlDet result = (UsrlDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UsrlDet instance) {
		log.debug("attaching dirty UsrlDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UsrlDet instance) {
		log.debug("attaching clean UsrlDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsrlDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsrlDetDAO) ctx.getBean("UsrlDetDAO");
	}
}