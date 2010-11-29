package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbsrDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbsrDet
 * @author MyEclipse Persistence Tools
 */

public class AbsrDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbsrDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbsrDet transientInstance) {
		log.debug("saving AbsrDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbsrDet persistentInstance) {
		log.debug("deleting AbsrDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbsrDet findById(com.gopawpaw.erp.hibernate.a.AbsrDetId id) {
		log.debug("getting AbsrDet instance with id: " + id);
		try {
			AbsrDet instance = (AbsrDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbsrDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbsrDet instance) {
		log.debug("finding AbsrDet instance by example");
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
		log.debug("finding AbsrDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbsrDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbsrDet instances");
		try {
			String queryString = "from AbsrDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbsrDet merge(AbsrDet detachedInstance) {
		log.debug("merging AbsrDet instance");
		try {
			AbsrDet result = (AbsrDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbsrDet instance) {
		log.debug("attaching dirty AbsrDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbsrDet instance) {
		log.debug("attaching clean AbsrDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbsrDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbsrDetDAO) ctx.getBean("AbsrDetDAO");
	}
}