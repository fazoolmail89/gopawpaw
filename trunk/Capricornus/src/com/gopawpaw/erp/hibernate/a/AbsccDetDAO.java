package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AbsccDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AbsccDet
 * @author MyEclipse Persistence Tools
 */

public class AbsccDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AbsccDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AbsccDet transientInstance) {
		log.debug("saving AbsccDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AbsccDet persistentInstance) {
		log.debug("deleting AbsccDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AbsccDet findById(com.gopawpaw.erp.hibernate.a.AbsccDetId id) {
		log.debug("getting AbsccDet instance with id: " + id);
		try {
			AbsccDet instance = (AbsccDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AbsccDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AbsccDet instance) {
		log.debug("finding AbsccDet instance by example");
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
		log.debug("finding AbsccDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AbsccDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AbsccDet instances");
		try {
			String queryString = "from AbsccDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AbsccDet merge(AbsccDet detachedInstance) {
		log.debug("merging AbsccDet instance");
		try {
			AbsccDet result = (AbsccDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AbsccDet instance) {
		log.debug("attaching dirty AbsccDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AbsccDet instance) {
		log.debug("attaching clean AbsccDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AbsccDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AbsccDetDAO) ctx.getBean("AbsccDetDAO");
	}
}