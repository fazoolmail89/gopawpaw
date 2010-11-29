package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbssDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbssDet
 * @author MyEclipse Persistence Tools
 */

public class AbssDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbssDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbssDet transientInstance) {
		log.debug("saving AbssDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbssDet persistentInstance) {
		log.debug("deleting AbssDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbssDet findById(com.gopawpaw.erp.hibernate.a.AbssDetId id) {
		log.debug("getting AbssDet instance with id: " + id);
		try {
			AbssDet instance = (AbssDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbssDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbssDet instance) {
		log.debug("finding AbssDet instance by example");
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
		log.debug("finding AbssDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbssDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbssDet instances");
		try {
			String queryString = "from AbssDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbssDet merge(AbssDet detachedInstance) {
		log.debug("merging AbssDet instance");
		try {
			AbssDet result = (AbssDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbssDet instance) {
		log.debug("attaching dirty AbssDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbssDet instance) {
		log.debug("attaching clean AbssDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbssDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbssDetDAO) ctx.getBean("AbssDetDAO");
	}
}