package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbslDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbslDet
 * @author MyEclipse Persistence Tools
 */

public class AbslDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbslDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbslDet transientInstance) {
		log.debug("saving AbslDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbslDet persistentInstance) {
		log.debug("deleting AbslDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbslDet findById(com.gopawpaw.erp.hibernate.a.AbslDetId id) {
		log.debug("getting AbslDet instance with id: " + id);
		try {
			AbslDet instance = (AbslDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbslDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbslDet instance) {
		log.debug("finding AbslDet instance by example");
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
		log.debug("finding AbslDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbslDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbslDet instances");
		try {
			String queryString = "from AbslDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbslDet merge(AbslDet detachedInstance) {
		log.debug("merging AbslDet instance");
		try {
			AbslDet result = (AbslDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbslDet instance) {
		log.debug("attaching dirty AbslDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbslDet instance) {
		log.debug("attaching clean AbslDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbslDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbslDetDAO) ctx.getBean("AbslDetDAO");
	}
}